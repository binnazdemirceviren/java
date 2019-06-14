import javax.swing.*;
import java.awt.*;

public class guıdeneme2{
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
		dugmeler.add(jb1);

		JButton jb2 = new JButton();
		jb2.setText("buna bas");
		jb2.setSize(120,20);
		jb2.setLocation(70,45);
		jb2.setHorizontalAlignment(4);
		dugmeler.add(jb2);


		ImageIcon ic1 = new ImageIcon("/.../icon");
		Image ic = ic1.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
		ic1=new ImageIcon(ic);
		JButton jb3 = new JButton(ic1);
		jb3.setSize(110,70);
		jb3.setLocation(70,75);
		jb3.setHorizontalAlignment(0);
		dugmeler.add(jb3);

		JButton jb4 = new JButton("sağ",ic1);
		jb4.setSize(145,70);
		jb4.setLocation(10,155);
		dugmeler.add(jb4);

		JButton jb5 = new JButton("sol",ic1);
		jb5.setSize(145,70);
		jb5.setLocation(160,155);
		jb5.setHorizontalTextPosition(SwingConstants.LEFT);
		dugmeler.add(jb5);


		frame.setSize(290,300);
		frame.setContentPane(GUI);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}