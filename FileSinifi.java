package ders0205;
import java.io.File;
import java.io.IOException;

public class FileSinifi {
	public static void main(String[] args){
		File f = new File ("C:\\kitap\\ornek2.txt");
		try{
			f.createNewFile(); //yeni dosya olu�turur
		
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(f.exists());//dosya var m�
		//f.renameTo(f2);//ismini de�i�tirir
	}

}
//ornek2 ad�nda kitap klosorunde txt dosyas� a�ar
