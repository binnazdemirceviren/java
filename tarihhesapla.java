public class tarihhesapla{
	int gun, ay, yil;
	public void gunEkle(int gun){
		this.gun += gun;
	}
	public void gunEkranaBas(){
		System.out.println("gun = "+gun);
	}
	public static void main(String [] args){
		tarihhesapla th = new tarihhesapla();
		th.gunEkle(2); th.gunEkle(3);
		th.gunEkranaBas();
	}
	/*
	int gun, ay, yil;
	public void gunEkle(int gun){
		gun += gun;//parantez dışındaki gun değişkeni değeri değişmez
	}
	public void gunEkranaBas(){
		System.out.println("gun = "+gun);
	}
	public static void main(String [] args){
		tarihhesapla th = new tarihhesapla();
		th.gunEkle(2); th.gunEkle(3);//hiçbir zaman ilk tanımladığımız int gun değerine erişemediğimiz için gun değeri hiç bir zaman değişmez
		th.gunEkranaBas();
	}

	*/
}