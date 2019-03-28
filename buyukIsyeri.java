package ders2803;
interface Calisan{ //arayüz
	public void calis();
}

class Mudur implements Calisan{
	public void calis(){//iptal etti(ovveride)
		System.out.println("mudur calisiyor");
	}
}

class GenelMudur extends Mudur{
	public void calis(){//iptal etti(ovveride)
		System.out.println("genel mudur calisiyor");
	}
	public void toplantiyonet(){
		System.out.println("Genel Mudur toplanti yonetiyor.");
	}
}

class Programci implements Calisan{
	public void calis(){//iptal etti(ovveride)
		System.out.println("Programci calisiyor");
	}
}

class AnalizProgramci extends Programci{
	public void analizYap() {
		System.out.println("Analiz yapiliyor");
	}
}
class SistemProgramci extends Programci{
	public void sistemincele(){//iptal etti(ovveride)
		System.out.println("Sistem inceleniyor");
	}
}
class Sekreter implements Calisan{
	public void calis(){//iptal etti(ovveride)
		System.out.println("Sekreter calisiyor");
	}
}


public class buyukIsyeri {
	public static void mesaiBasla (Calisan[] c){
		for (int i = 0 ; i< c.length ; i++){
			c[i].calis();//Dikkat
		}
	}
	public static void main( String args[]){
		Calisan[] c = new Calisan[6];
		//c[0] = new Calisan(
		c[0] = new Programci();
		c[1] = new Mudur();
		c[2] = new Sekreter();
		c[3] = new GenelMudur();
		c[4] = new AnalizProgramci();
		c[5] = new SistemProgramci();

	
	}
}
