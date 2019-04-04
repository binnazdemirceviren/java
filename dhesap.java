package ders2802;

public class dhesap {
	public static void main(String[] args){
		Dikdortgen d1 = new Dikdortgen();
		Dikdortgen d2 = new Dikdortgen();
		
		d1.en = 4.0;
		d1.boy = 0.5;
		d2.en = 4.0;
		d2.boy = 6.0;
		System.out.println("dikdörtgenin alaný =" + d1.alan());
		System.out.println("dikdörtgenin alaný =" + d2.alan());
	}
}
