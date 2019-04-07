public class Yapicilar{
	int deger1;
	public Yapicilar(){//metot //->1
		deger1 = 5;
	}
	public static void main (String[] args){
		Yapicilar nesne1 = new Yapicilar(); //->2
		System.out.println(nesne1.deger1);
	}
	/*1 yerine
	public Yapicilar(int sayi){//parametreli bir yapilandırıcı metod
		deger1 = sayi;
	}
	*/
	/*2 yerine
	Yapicilar nesne2 = new Yapicilar(10)//parametreli bir yapılandırıcı kullandığım için nesen oluştururken paremetre gönderebiliriz.
								//parametre yazmazsak hata alırız.*/
}