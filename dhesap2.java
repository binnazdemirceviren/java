package ders2802;

public class dhesap2 {
	public static void main(String[] args){
		Dikdortgen2 d3 = new Dikdortgen2();
		Dikdortgen2 d4 = new Dikdortgen2();
		
		d1.en = 4.0;
		d1.boy = 0.5;
		d2.en = 4.0;
		d2.boy = 6.0;
		System.out.println("dikdörtgenin alaný =" + d1.alan());
		System.out.println("dikdörtgenin alaný =" + d2.alan());
	}
//hata veriyor çünkü dikdort2 classýnda private elemana eriþmek istiyoruz.
}
