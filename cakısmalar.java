package ders2803;
interface A1{
	public void hesapla();
}

interface A2{
	public void hesapla(int d);
}

interface A3{
	public void hesapla();
}

class S1 implements A1, A2{
	public void hesapla(){
		System.out.println("S1.hesapla");
	}
	public void hesapla(int d){
		System.out.println("S1.hesapla" + d);
	}
}

/*Hatali adas yordamlar (overloaded) donus tiplerine gore ayýrt edilmez*/
class S2 implements A1,A3{
	public void hesapla (){
		System.out.println("S2.hesapla");
	}
	/*hata
	public int hesapla(){
		System.out.println("S2.hesapla");
		return 123;
	}
	 */
	
}

public class cakýsmalar {
	public static void main(){
		S1 foo = new S1();
		S2 bar = new S2();
	}
}
