package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel addButtonsToMe = new JPanel();
	JButton jokeButton = new JButton();
	JButton punchlineButton = new JButton();
public static void main(String[] args) {
	ChuckleClicker whyMiami = new ChuckleClicker();
	whyMiami.makeButtons();
}
public void makeButtons() {
	//JOptionPane.showMessageDialog(null, "I Make Buttons!");
	addButtonsToMe.add(jokeButton);
	addButtonsToMe.add(punchlineButton);
	frame.add(addButtonsToMe);
	frame.setVisible(true);
	jokeButton.setText("Jenky Jokes");
	punchlineButton.setText("Putrid Punchlines");
	frame.setTitle("Chuckle Clicker");
	frame.setSize(265,125);
	jokeButton.addActionListener(this);
	punchlineButton.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent event) {
	// TODO Auto-generated method stub
	//JOptionPane.showMessageDialog(null, "Placeholder Text");
	if(event.getSource() == jokeButton) {
		JOptionPane.showMessageDialog(null, "Why doesn't the sun go to college? Because it has a million degrees!");
	}
if(event.getSource() == punchlineButton) {
	JOptionPane.showMessageDialog(null, "A plateau is the highest form of flattery.");
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
}
