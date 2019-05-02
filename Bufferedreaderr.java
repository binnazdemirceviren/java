package ders0205;
import java.io.BufferedReader;
import java.io.*;

public class Bufferedreaderr {
	public static void main(String[] a){
		try{
			File f= new File("C:\\kitap\\ornek2.txt");
			FileReader fr =new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String satir = br.readLine();
			while (satir != null){
				System.out.println(satir);
				satir=br.readLine();
				
			}
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

