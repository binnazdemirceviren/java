package ders2802;

public class dikdortgen3 {
	//sýnýfýmýza ai veri alanlarýný kapsülleme yöntemi ile belirleyelim
	private double en;
	private double boy;
	//varsayýlan yapýlandýrýcý yazalým.
	//en veri alanýmýzý getter yöntemi ile döndürelim.
	public double getEn(){
		return en;
	}
	//en veri alanýmýza setter yöntemi ile deðer atayalým. 
	//dönüþ deðeri yok void
	public void setEn(double x){
		en = x;
	}
	//boy veri alanýmýzý getter yöntemi ile döndürelim
	public double getBoy(){
		return boy;
	}
	//boy veri alanýmýza setter yöntemi ile deðer atayalým. 
	//dönüþ deðeri yok void
	public void setBoy(double boy){
		this.boy = boy;
	}
	public double alan(){
		return en*boy;
	}
}
