import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class guıdeneme extends JFrame{
	public static void main(String args[]){
		JFrame sema = new JFrame();
		sema.setTitle("ilk sema");
		sema.setSize(500, 258);//arayüzün 500*258 boyutu
		sema.setLocation(50, 150);//arayüz ekranda 50,150 konumunda açıldı
		sema.setLayout(new FlowLayout());//ekran içerisindeki objelerin sıralaması ve hangi bölgede yer alacağı ile ilgidir. 


		JLabel etiket1 = new JLabel("ilk etiketimiz");
		etiket1.setToolTipText("Deneme etiketi");

		JTextField alan1 = new JTextField();
		alan1.setText("buraya veri giriniz");

		sema.add(alan1);
		sema.add(etiket1);//etiket1i ekrana ekler
		sema.setVisible(true);//arayüzün görünürlüğünü boolean ifadeleri ile belirleriz.

	}
}