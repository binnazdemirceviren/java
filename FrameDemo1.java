import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameDemo1 extends JFrame{
	JFrame pencere;
	JButton buton1;
	public FrameDemo1(){
		pencere = new JFrame("FrameDemo Test");
		
		pencere.setSize(640, 480);
		pencere.setLayout(null);

		buton1 = new JButton("buton 1");
		pencere.add(buton1); //veya pencere.getContentPane().add(buton1);
		buton1.setBounds(10,20,100,40);

		pencere.setVisible(true);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new FrameDemo1();
	}
}
//artık this metodu kullanmıyoruz
