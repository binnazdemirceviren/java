package ders0205;
import java.io.*;

public class BufferOrnek {
	public static void main(String[] args){
		File f = new File("C:\\kitap\\ornek2.txt");
		byte dizi[] = new byte[1000];
		try{
			FileInputStream f2 =  new FileInputStream(f);
			BufferedInputStream bf = new BufferedInputStream(f2);
			int okunan =0;
			while((okunan=bf.read(dizi))!=1){
				String veriler = new String(dizi,0,okunan);
				System.out.println(veriler);
			}
			bf.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
