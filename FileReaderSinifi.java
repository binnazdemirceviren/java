package ders0205;
import java.io.*;

public class FileReaderSinifi {
	public static void main(String[] args) throws IOException{
		File f = new File("C:\\kitap\\ornek2.txt");
		char veriler[]= new char[(int) f.length()];
		try{
			FileReader f2 =new FileReader(f);
			f2.read(veriler);
			String okunan = new String(veriler);
			System.out.println(okunan);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
