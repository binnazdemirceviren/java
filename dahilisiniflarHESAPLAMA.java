package ders0404;

public class dahilisiniflarHESAPLAMA {
	

	public class Toplama {//dahili üye sýnýf
		public int toplamaYap(int a, int b) {
			return a+b;
		}
	} //class Toplama
	
	public static void main(String args[]) {
		dahilisiniflarHESAPLAMA.Toplama ht = new dahilisiniflarHESAPLAMA().new Toplama();
		int sonuc = ht.toplamaYap(3, 5);
		System.out.println("Sonuc = " + sonuc);
	}
	
}//class dahilisiniflarHESAPLAMA
/* neden arayüzler var?
 * arayüzler ile çoklu kalýtým desteði kýsmen bulabiliyorduk ama bu tam deðildi. tam deðildi çünkü bir sýnýf iki normal sýnýftan türetülemiyordu
 * bir dahili üye sýnýf private eriþim belirleyicisine sahip olsa dahi, çevreleyici sýnýf içerisindeki tüm yordamlar tarafýndan eriþebilirlerbu kýsýt ancak baþka sýnýflar için geçerlidir 
 */
