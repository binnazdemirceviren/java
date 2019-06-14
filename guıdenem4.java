import javax.swing.*;

public class guıdenem4{
	public static void main(String args[]){
				JFrame.setDefaultLookAndFeelDecorated(true);
				JFrame frame= new JFrame("Cay...");

				JPanel boxes = new JPanel();
				JLabel label = new JLabel("çayınız nasıl olsun?");
				boxes.add(label);
				JCheckBox sutcb = new JCheckBox("süt");
				JCheckBox sekercb = new JCheckBox("şeker");
				boxes.add(sutcb);
				boxes.add(sekercb);

				frame.add(boxes);
				frame.setSize(350,300);
				frame.setVisible(true);

	}

}