package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	  char currentLetter;
	  JFrame frame = new JFrame();
	  JPanel panel = new JPanel();
	  JLabel label = new JLabel();
	  int count=0;
public static void main(String[] args) {
	TypingTutor y = new TypingTutor();
	y.currentLetter = y.generateRandomLetter();
	y.setup();
}
  char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
	private void setup() {
		// TODO Auto-generated method stub
label.setText(currentLetter+"");
label.setFont(label.getFont().deriveFont(28.0f));
label.setHorizontalAlignment(JLabel.CENTER);
frame.setVisible(true);
frame.addKeyListener(this);
panel.add(label);
frame.add(panel);
	}
	@Override
	public void keyPressed(KeyEvent key) {
		// TODO Auto-generated method stub
		count+=1;
		System.out.println("You Typed:"+ key.getKeyChar());
		if(key.getKeyChar()==currentLetter) {
			System.out.println("You Typed Correct!");
			panel.setBackground(Color.GREEN);
		}
		else {
			System.out.println("You Typed Wrong.");
			panel.setBackground(Color.RED);
		}
		if(count==45) {
			showTypingSpeed(45);
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(currentLetter+"");
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	Date timeAtStart = new Date(currentLetter);
    
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	    Date timeAtEnd = new Date(numberOfCorrectCharactersTyped);
	    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	    long gameInSeconds = (gameDuration / 1000) % 60;
	    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	    int charactersPerMinute = (int) (charactersPerSecond * 60);
	    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	} 
	
	
	
	
}
