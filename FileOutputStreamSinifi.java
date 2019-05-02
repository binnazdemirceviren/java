package ders0205;
import java.io.*;

public class FileOutputStreamSinifi {
	public static void main(String[] args){
		File yol =new File("C:\\kitap\\ornek2.txt");
		try{
			//yazma iþlemleri
			FileOutputStream yazdir = new FileOutputStream(yol);
			String metin = "FileoutputStream ile yazdýr";
			byte veriler[]= metin.getBytes();
			yazdir.write(veriler);
			yazdir.close();//dosya kapandý
			//okuma iþlemleri
			char okunacak[]= new char[(int) yol.length()];
			FileReader f2 =new FileReader(yol);
			f2.read(okunacak);//dizi dolduruldu
			String okunan = new String(okunacak);
			System.out.println(okunan);
	
		}
		catch (IOException e){
			e.printStackTrace();
			
		}
	}

}
