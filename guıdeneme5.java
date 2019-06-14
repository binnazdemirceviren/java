import javax.swing.*;
import java.awt.*;


public class guıdeneme5{
	public static void main(String args[]){
		String sayi1, sayi2;
		int tamsayi1, tamsayi2, toplam, carpim, fark, kalan;
		float bolum;

		JFrame frame = new JFrame("Not hesaplama");
		JPanel GUI = new JPanel();	
		
		JLabel arasınav = new JLabel(sayi1);
		sayi1=JOptionPane.showInputDialog("1.sayiyi veriniz");
		frame.add(arasınav);
		JLabel finl = new JLabel(sayi2);
		sayi2=JOptionPane.showInputDialog("2.sayiyi veriniz");
		frame.add(finl);
		tamsayi1 = Integer.parseInt(sayi1);
		tamsayi2 = Integer.parseInt(sayi2);
		toplam = tamsayi1+tamsayi2;
		carpim = tamsayi1*tamsayi2;
		fark   = tamsayi1-tamsayi2; 
		bolum  = tamsayi1/tamsayi2;
		kalan  = tamsayi1%tamsayi2;
		JOptionPane.showMessageDialog(null,"Toplam = "+toplam+"\nCarpim = "+carpim+"\nFark = "+fark+"\nTamsayi Bolum = "+bolum+"\nKalan = "+kalan+"\nBolum = "+(float)tamsayi1/tamsayi2,"Sonuclar",JOptionPane.PLAIN_MESSAGE);
		System.exit(0);
	}
}