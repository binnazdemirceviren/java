class Araba{
	int kapi_sayisi;
	int vites_sayisi;
	public Araba(int adet){
		kapi_sayisi = adet;
	}
	public Araba(int adet, int sayi){
		kapi_sayisi = adet;
		vites_sayisi =sayi; 
	}
}
public class Yapilandirici{
	public static void main(String[] args){
		//Araba ar = new Araba(); //hatadır
		Araba ar1 = new Araba(2);
		Araba ar2 = new Araba(4,5);
	}
}