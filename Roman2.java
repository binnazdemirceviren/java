class Kitap2 {
	public int sayfaSayisiOgren(){
		System.out.println("Kitap_sayfaSayisiOgren()");
		return 440;
	}
	public double fiyatOgren(){
		System.out.println("Kitap_fiyatOgren()");
		return 14.5;
	}
	public String yazarismiOgren(){
		System.out.println("yazarismiOgren()");
		return "xy";
	}
}


class Roman2 extends Kitap2{
	public static void main(String args []){
		Roman2 r2 = new Roman2();
		int SayfaSayisi = r2.sayfaSayisiOgren();
		double fiyat = r2.fiyatOgren();
		String yazar = r2.yazarismiOgren();//
		System.out.println("SayfaSayisi="+SayfaSayisi);
		System.out.println("fiyat="+fiyat);
		System.out.println("yazar="+yazar);
	}
}