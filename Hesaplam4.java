package ders0404;


public class Hesaplam4 {

	int sabit = 2 ;
	private int ozelsabit = 1 ;
	public  class Toplama4{
		 int toplam ; 
		int sonuc ;
		public int toplamaYap(int a, int b){
			//return (a+b) +sabit ; //!Hata sabit deðiþkeni static yapýlýrsa bu return hta vermez
			
			sonuc = toplam = a+b;
			return sonuc;
		}
		public void dekontOlustur(){
			/* sabit alanýna ve ekranaBas() yordamýna ulaþabilmek için Hesaplama4sýnýfýna ait nesne oluþturmamýz gerekir*/
			Hesaplam4 hs4 = new Hesaplam4(); //doðru
			int a = hs4.ozelsabit;//doðru
			hs4.ekranaBas(); //doðru
			System.out.println("Dekont oluþturuluyor = "+ hs4.sabit + "-" + a);
		}
	}
	
	public class Cikartma4{
		int sonuc ;
		//static int sonuc1;   //!hata
		public int cikartmaYap(int a, int b){
			ekranaBas();
			sonuc = (a-b) - ozelsabit ;
			return sonuc; //dikkat
		}
	}
	private void ekranaBas(){
		System.out.println("Hesaplama4.ekranaBas()");
	}
	public static void main(String args[]){
		//!hata  Toplama4 statik dahili üye sýnýfýna  çevreleyen sýnýfa ait herhangi bir  kalmadfýk
		Hesaplam4.Toplama4 tp4 = new Hesaplam4().new Toplama4(); //==	Hesaplama4.Toplama4 tp4 = new Hesaplama4.Toplama4();
		//Toplama4 tp4 = new Toplama4();
		tp4.dekontOlustur();
		int sonuc = tp4.toplamaYap(10, 5);
		System.out.println("Sonuc = 10 + 5 = " +sonuc );
	}

	

	
}
