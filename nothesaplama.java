import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class nothesaplama implements ActionListener
{
	JLabel jlab_sonuc;
	JTextField jtf_vize, jtf_final; 
	public nothesaplama()
	{
		JFrame jfrm = new JFrame("Not Hesaplama");
		jfrm.setSize(400,200);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setLocation(300,300);
		jfrm.setLayout(new FlowLayout());

		JLabel jlab1= new JLabel("Vize:");
		jtf_vize = new JTextField(5);

		JLabel jlab2= new JLabel("Final:");
		jtf_final = new JTextField(5);

		JButton jbtn = new JButton("Hesapla");
		jbtn.addActionListener(this); // butonun tiklama olayini izle
		jlab_sonuc= new JLabel();
		

		jfrm.add(jlab1);
		jfrm.add(jtf_vize);
		jfrm.add(jlab2);
		jfrm.add(jtf_final);
		jfrm.add(jbtn);
		jfrm.add(jlab_sonuc);

		jfrm.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
		// hesaplama kodu
		int vize_notu=kontrol(jtf_vize.getText());
		int final_notu=kontrol(jtf_final.getText());
		if(vize_notu>-1 && final_notu>-1)
		{
			
			String sonuc="";

			int ort=(int)Math.round(vize_notu*0.4+final_notu*0.6);
			sonuc="Ort: "+ort;

			jlab_sonuc.setText(sonuc);
		}
	}

	public int kontrol(String str)
	{
		try
		{
			int not=Integer.parseInt(str);
			if(not>=0 && not<=100)
				return not;
			return -1;
		}
		catch(Exception ex)
		{
		}
		return -1;	
	}

	public static void main(String[] adsd)
	{
		new nothesaplama();
	}

}