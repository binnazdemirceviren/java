package ders2103;

abstract class Sporc {
	public abstract void calis();
	public Sporc(){
		System.out.println("calis() cagirilmeden evvel");
		calis();
		System.out.println("calis() cagirildiktan sonra");
		
		
	}
}

class Futbolc extends Sporc{
	int antraman_sayisi = 4 ;
	public void calis() {
		System.out.println("futbolcu calis" + antraman_sayisi);		
	}
	public Futbolc(){
		System.out.println("Futbolcu yapilandirici");
		calis();
	}
}

public class Spor {
	public static void main ( String args[] ){
		Futbolc f = new Futbolc();
		//Sporcu s = new Sporcu();!hata soyut sýnýf
	}
}
