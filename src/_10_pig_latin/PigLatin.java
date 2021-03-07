package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton translate = new JButton();
JTextField english = new JTextField(23);
JTextField pigLatin = new JTextField(23);
	public void run() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		frame.add(panel);
		panel.add(english);
		panel.add(translate);
		panel.add(pigLatin);
		frame.setTitle("Branson's Pig Latin Translator!");
		translate.setText("Translate");
		translate.addActionListener(this);
		frame.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
	JOptionPane.showMessageDialog(null, "Translating...");
	PigLatinTranslator plt = new PigLatinTranslator();
String translated =	plt.translate(english.getText());
pigLatin.setText(translated);
		
	}

}
