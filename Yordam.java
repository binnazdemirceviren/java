public class int Yordam{
	public int toplamaYap(int a, int b){
		int sonuc =a+b ;
		System.out.println("sonuc1 = "+ sonuc)
		return sonuc;
	}
	public int toplamaYap(int a, double b){
		double sonuc =a+b ;
		System.out.println("sonuc2 = "+ sonuc)
	}
	public int toplamaYap(double a, int b){
		double sonuc =a+b ;
		System.out.println("sonuc3 = "+ sonuc)
		return sonuc;
	}
	public static void main(String[] args){
		Yordam metod2 = new Yordam();
		metod2.toplamaYap(3,4);
		metod2.toplamaYap(3,3.5);
		metod2.toplamaYap(6.3,4);
	}
	//Yordam metodu içinde 3 tane aynı ismi tasıyanmetod var bu da overload yani asırı yüklenmedir.
	//metotlar için belirleyici özellik aldığı parametrelerdir
}