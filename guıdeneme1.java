import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;

public class guıdeneme1{
	public static void main (String args[]){
		JFrame frame = new JFrame("renklerle çalışıyorum");
		JPanel GUI = new JPanel();	
		GUI.setLayout(null);
		JPanel yazilar = new JPanel();
		yazilar.setLayout(null);
		yazilar.setLocation(10,0);
		yazilar.setSize(150,30);
		GUI.add(yazilar);

		JLabel kirmizi = new JLabel("kırmızı");
		kirmizi.setForeground(Color.RED);
		kirmizi.setLocation(0,0);
		kirmizi.setSize(50,30);
		//0 merkeze 2 sola 4 sağa yaslamak için
		kirmizi.setHorizontalAlignment(0);
		yazilar.add(kirmizi);

		JLabel beyaz = new JLabel("beyaz");
		kirmizi.setForeground(Color.white);
		beyaz.setLocation(100,0);
		beyaz.setSize(50,30);
		//0 merkeze 2 sola 4 sağa yaslamak için
		beyaz.setHorizontalAlignment(0);
		yazilar.add(beyaz);

		JPanel renkler = new JPanel();
		renkler.setLayout(null);
		renkler.setLocation(10,40);
		renkler.setSize(150,30);
		GUI.add(renkler);

		JPanel kırmızıKutu = new JPanel();
		kırmızıKutu.setBackground(Color.RED);
		kırmızıKutu.setLocation(0,0);
		kırmızıKutu.setSize(50,50);
		renkler.add(kırmızıKutu);


		JPanel beyazKutu = new JPanel();
		beyazKutu.setBackground(Color.white);
		beyazKutu.setLocation(100,0);
		beyazKutu.setSize(50,50);
		renkler.add(beyazKutu);


		frame.setSize(190,150);
		frame.setContentPane(GUI);
		frame.setResizable(false);//ekran boyutunu değiştirmeyi engeller false olduğu için
		frame.setVisible(true);

	}
}