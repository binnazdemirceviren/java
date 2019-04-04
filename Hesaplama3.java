package ders0404;

public class Hesaplama3 {
	private int sabit1 = 2;
	private static int sabit2 = 1;
	
	public class Toplama3{//üye dahli sýnýf
		public int toplamaYap (int a, int b){
			return(a+b) + sabit1;//dikkat
			
		}
	}
	
	public class Cikarma3{//üye dahli sýnýf
		public int cikarmaYap (int a, int b){
			dekontBilgileriGoster();
			return(a-b) - sabit2;//dikkat
			
		}
	}
	
	private void dekontBilgileriGoster(){
		System.out.println("Dekont Bilgileri gösteriliyor");
		
	}
	public void ekranaBas(int a, int b){
		int sonuc = new Toplama3().toplamaYap(a, b);
		System.out.println("sonuc=" +a+ "+" + b + "sabit1 = "+ sonuc);
	}
	public static void main (String args[]){
		Hesaplama3 h3 = new Hesaplama3();
		h3.ekranaBas(10,5);
		
		Hesaplama3.Toplama3 ht3 = h3.new Toplama3();
		int sonuc = ht3.toplamaYap(11,6);
		System.out.println("Sonuc = 11+6+sabit1 =" + sonuc);
		
		Hesaplama3.Cikarma3 hc3 = h3.new Cikarma3();
		int sonuc1 = hc3.cikarmaYap(10 , 5);
		System.out.println("Sonuc = 10 - 5 - sabit2 =" + sonuc1);
	}

}
