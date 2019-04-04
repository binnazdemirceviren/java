package ders0404;
//bir dahili üye sýnýf private eriþim belirleyicisine sahip olsa dahi, çevreleyici sýnýf içerisindeki tüm yordamlar tarafýndan eriþebilirlerbu kýsýt ancak baþka sýnýflar için geçerlidir
public class Heaplama1 {
	public class Toplama {//dahili üye sýnýf 
		public int toplamaYap(int a, int b){
			return a+b;
		}
	}
	protected class Cikarma {//dahili üye sýnýf 
		public int cikarmaYap(int a, int b){
			return a-b;
		}
	}
	class Carpma {//dahili üye sýnýf 
		public int carpmaYap(int a, int b){
			return a*b;
		}
	}
	private class Bolme {//dahili üye sýnýf 
		public int bolmeYap(int a, int b){
			return a/b;
		}
	}
	public static void main (String args[])  {
		Heaplama1.Toplama ht = new Heaplama1().new Toplama();
		Heaplama1.Cikarma hck = new Heaplama1().new Cikarma();
		Heaplama1.Carpma hcp = new Heaplama1().new Carpma();
		Heaplama1.Bolme hb = new Heaplama1().new Bolme();
		
		int sonuc1 = ht.toplamaYap(10, 5);
		int sonuc2 = hck.cikarmaYap(10,5);
		int sonuc3 = hcp.carpmaYap(10,5);
		int sonuc4 = hb.bolmeYap(10,5);
		
		System.out.println("carpma Sonuc ="+ sonuc3);
		System.out.println("bölme sonuc= " + sonuc4);
		System.out.println("toplama sonuc= " + sonuc1);
		System.out.println("cýkarma sonuc= " + sonuc2);
	}
	
	
}
