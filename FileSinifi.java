package ders0205;
import java.io.File;
import java.io.IOException;

public class FileSinifi {
	public static void main(String[] args){
		File f = new File ("C:\\kitap\\ornek2.txt");
		try{
			f.createNewFile(); //yeni dosya oluþturur
		
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(f.exists());//dosya var mý
		//f.renameTo(f2);//ismini deðiþtirir
	}

}
//ornek2 adýnda kitap klosorunde txt dosyasý açar
