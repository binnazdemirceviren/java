package ders0205;
import java.io.*;


public class FilewriterSinifi {
	public static void main(String[] args) throws IOException{
		File f=new File("C:\\kitap\\ornek2.txt");
		try{
			//yazma iþlemleri
			FileWriter yazdir = new FileWriter(f, true);
			String yazilacak ="bu bir deneme yazýsýdýr";
			yazdir.write(yazilacak);
			yazdir.close();
			char veriler[]= new char[(int) f.length()];
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
