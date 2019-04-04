package ders0404;
class Heaplama {
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
}
public class Hesaplama1 {
	public static void main (String args[])  {
		Heaplama.Toplama ht = new Heaplama().new Toplama();
		Heaplama.Cikarma hck = new Heaplama().new Cikarma();
		Heaplama.Carpma hcp = new Heaplama().new Carpma();
		//Heaplama.Bolme hb = new Heaplama().new Bolme();
		
		int sonuc1 = ht.toplamaYap(10, 5);
		int sonuc2 = hck.cikarmaYap(10,5);
		int sonuc3 = hcp.carpmaYap(10,5);
		//int sonuc4 = hb.bolmeYap(10,5);
		
		System.out.println("carpma Sonuc ="+ sonuc3);
		//System.out.println("bölme sonuc= " + sonuc4);
		System.out.println("toplama sonuc= " + sonuc1);
		System.out.println("cýkarma sonuc= " + sonuc2);
	}
}
