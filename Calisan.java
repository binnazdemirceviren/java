package ders2103;

public abstract class Calisan {
	public String pozisyon = "Clisan";
	public abstract void calis();
	public void zamIste(){
		System.out.println("Calisan zam");
	}
	
}

class Mudur extends Calisan{
	public Mudur() {
		pozisyon = "Mudur";
	}
	public void calis(){
		System.out.println("Mudur calisiyor");
	}
}

class Programcý extends Calisan{
	public Programcý() {
		pozisyon = "Programci";
	}
	public void calis(){
		System.out.println("Programci calisiyor");
	}
	public void zamIste(){
		System.out.println("Programci zam Ýstiyor");
	}
}

class Pazarlamaci extends Calisan{
	public Pazarlamaci() {
		pozisyon = "Pazarlamaci";
	}
	public void calis(){
		System.out.println("Pazarlamaci calisiyor");
	}
}














