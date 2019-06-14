import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NotHesapla{
	public static void main(String args[]){
		JTextField arasinavNotu, finalNotu;
		JButton temizle, tamam;

		arasinavNotu = new JTextField(5);
		finalNotu = new JTextField(5);
		JTextField ortalama = new JTextField();
		ortalama.setEnabled(false);

		tamam = new JButton("Tamam");
		temizle = new JButton("Temizle");

		JFrame pencere = new JFrame("Not Hesaplama");
		pencere.setLayout(new GridLayout(4,2));

		pencere.add(new JLabel("Arasınav"));
		pencere.add(arasinavNotu);
		pencere.add(new JLabel("Final"));
		pencere.add(finalNotu);
		pencere.add(new JLabel("ortalama"));
		pencere.add(ortalama);
		pencere.add(tamam);
		pencere.add(temizle);

		pencere.setSize(400,200);
		pencere.setLocation(300,300);
		pencere.setVisible(true);
		pencere.pack();

		tamam.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e){
				Double vizepuan, finalpuan;
				vizepuan = Double.parseDouble(arasinavNotu.getText());
				finalpuan = Double.parseDouble(finalNotu.getText());
				Double ort = ((vizepuan*0.4)+(finalpuan*0.6));
				String puan = Double.toString(ort);
				ortalama.setEnabled(true);
				ortalama.setText(puan);
				tamam.setEnabled(false);

			}
		});

		temizle.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				arasinavNotu.setText(null);
				finalNotu.setText(null);
				ortalama.setText("");
				ortalama.setEnabled(false);
				tamam.setEnabled(true);
			}
		});
		
	}
}