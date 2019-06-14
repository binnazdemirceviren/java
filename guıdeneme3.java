import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;


public class guıdeneme3{
	public static void main(String args[]){
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("buton çalışıyorum");

		JPanel GUI = new JPanel();	
		GUI.setLayout(null);

		JPanel dugmeler = new JPanel();
		dugmeler.setLayout(null);
		dugmeler.setLocation(10,10);
		dugmeler.setSize(250,275);
		GUI.add(dugmeler);

		JButton jb1 = new JButton();
		jb1.setText("buna basma");
		jb1.setSize(120,20);
		jb1.setLocation(70,20);
		jb1.setHorizontalAlignment(0);
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane jop1 = new JOptionPane ();
				jop1.showMessageDialog(null, "TIKLAMA");

			}
		});
		dugmeler.add(jb1);

		final JButton jb2 = new JButton();
		jb2.setText("red alarm");
		jb2.setSize(120,20);
		jb2.setLocation(70,45);
		jb2.setHorizontalAlignment(0);
		final Color renk = jb2.getBackground();
		jb2.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent arg0){
				jb2.setBackground(Color.red);
				super.mouseEntered(arg0);
			}
			public void mouseExited(MouseEvent arg0){
				jb2.setBackground(renk);
				super.mouseExited(arg0);
			}
		});
		dugmeler.add(jb2);

		JButton jb3 = new JButton();
		jb3.setText("buna bas");
		jb3.setSize(120,20);
		jb3.setLocation(70,120);
		jb3.setHorizontalAlignment(0);
		jb3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("işlem başarılı");
			}
		});
		dugmeler.add(jb3);


		frame.setSize(290,300);
		frame.setContentPane(GUI);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}