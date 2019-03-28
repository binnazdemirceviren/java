package ders2103;

abstract class Sporcu {
	public abstract void calis();
	public Sporcu(){
		System.out.println("calis() cagirilmeden evvel");
		calis();
		System.out.println("calis() cagirildiktan sonra");
		
		
	}
}

class Futbolcu extends Sporcu{
	int antraman_sayisi = 4 ;
	public void calis() {
		System.out.println("futbolcu calis" + antraman_sayisi);		
	}
	public Futbolcu(){
		System.out.println("Futbolcu yapilandirici");
		calis();
	}
}

public class Sporcu {
	public static void main ( String args[] ){
		Futbolcu f = new Futbolcu();
		//Sporcu s = new Sporcu();!hata soyut sýnýf
	}
}
