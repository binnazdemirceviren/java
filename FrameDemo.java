import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameDemo extends JFrame{
	JButton buton1;
	public FrameDemo(){
		this.setTitle("FrameDemotest");
		this.setSize(640, 480);
		this.setLayout(null);

		buton1 = new JButton("buton 1");
		this.add(buton1); //veya this.getContentPane().add(buton1);
		buton1.setBounds(10,20,100,40);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new FrameDemo();
	}
}
//this.add() metodu pencereye bir bileşen eklemek için kullanılır. Object tipinde bir parametre alır. bu metod ile aslında pencerenin top-level konteynına bir bileşen eklenir. bu konteynerın refasına eişmeş için getContentPane() metodu kuallanılabilir.