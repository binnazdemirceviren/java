package ders2103;


abstract class sekil{
	String isim;
	public void isimBelirle(String a){
		isim = a;
	}
	String isimGetir(){
		return isim;
	}
}

class Ucgen extends sekil{
	double taban;
	double yukseklik;
	void bilgi(double taban, double yukseklik){
		this.taban= taban;
		this.yukseklik= yukseklik;
		this.isimBelirle("Ucgen");
	}
	double alanHesapla(){
		return taban*yukseklik/2;
	}
}

class Yamuk extends sekil{
	double alt;
	double ust;
	double h;
	void bilgi(double alt, double ust, double h){
		this.alt= alt;
		this.ust= ust;
		this.h= h;
		this.isimBelirle("Yamuk");
	}
	double alanHesapla(){
		return (alt+ust)*h/2;
	}
}
class Daire extends sekil{
	double yaricap;
	final double pi = 3.14;
	void bilgi(double yaricap){
		this.yaricap= yaricap;
		this.isimBelirle("Daire");
	}
	double alanHesapla(){
		return pi*yaricap*yaricap;
	}
}





public class SoyutSinifornegi {
	public static void main(String[] args){
		Yamuk foo = new Yamuk();
		foo.bilgi(15, 14, 3);
		System.out.println(foo.isimGetir() + "Alani : " + foo.alanHesapla());
	}
	
	
}
