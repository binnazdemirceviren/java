package ders2802;

public class dhesap3 {
	public static void main(String[] args){
		dikdortgen3 d5 = new dikdortgen3();
		dikdortgen3 d6 = new dikdortgen3();
		
		d5.setEn(2);
		d5.setBoy(10);
		d6.setEn(5);
		d6.setBoy(20);
		System.out.println("dikdörtgenin alaný =" + d5.alan());
		System.out.println("dikdörtgenin alaný =" + d6.alan());
		System.out.println("d5 dikdörtgenin eni="+d5.getEn());
		System.out.println("d5 dikdörtgenin boyu="+d5.getBoy());
		System.out.println("d6 dikdörtgenin eni="+d6.getEn());
		
		
		
	}
//hata veriyor çünkü dikdort2 classýnda private elemana eriþmek istiyoruz.
}
