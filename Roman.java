class Kitap {
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


class Roman extends Kitap{
	public static void main(String args []){
		Roman r = new Roman();
		int SayfaSayisi = r.sayfaSayisiOgren();
		double fiyat = r.fiyatOgren();
		String yazar = r.yazarismiOgren();//
	}
}