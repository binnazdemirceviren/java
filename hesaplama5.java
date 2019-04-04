package ders0404;

public class hesaplama5 {
	private static int x= 3;
	public static class Toplama5 {
		static int toplam ;
		int sonuc ; 
		public static int toplamaYap ( int a, int b){
			//sonuc = a+b +x; //!hata sonuc static tanýmlý olmadýðý için
			toplam = a+b+x ;
			return toplam; 
			
		}
	}

	public static void main(String args []){
		int sonuc = hesaplama5.Toplama5.toplamaYap(16,8);
		System.out.println("sonuc = 16 + 8 = " + sonuc );
	}
}
