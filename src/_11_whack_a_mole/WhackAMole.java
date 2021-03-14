package _11_whack_a_mole;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
Random ran = new Random();
int ranint = ran.nextInt(24);
int molesWhacked = 0;
int holesWhacked = 0;
Date timeAtStart;

boolean mole =false;

	public void run() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		frame.setTitle("Whack a Button for Fame and Glory");
		frame.add(panel);
		frame.setSize(400,175);
		drawButtons(ranint);
		timeAtStart=new Date();
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent mouseClicked) {
		// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) mouseClicked.getSource();
	if(buttonPressed.getText() == "Mole!") {
			panel.removeAll();
		ranint = ran.nextInt(24);	
			drawButtons(ranint);
			molesWhacked += 1;
			playSound("Explosion+3.wav");
			if(molesWhacked==10) {
				endGame(timeAtStart,10);
				
			}
			System.out.println(molesWhacked);
		}
	else {
		holesWhacked +=1;
		if(holesWhacked == 5) {
			JOptionPane.showMessageDialog(null, "How in the world did you miss the mole 5 times!? Yes we have moles per second but not a time limit! I have to stop you before you miss the mole 10 times! Geesh!");
			System.exit(0);
		}
	}
	}
public void	drawButtons(int number) {
	for (int i = 0; i < 24; i++) {
		JButton button = new JButton();
		panel.add(button);
		button.addActionListener(this);
		if(i==ranint) {
			button.setText("Mole!");
			mole = true;
		}
		else {
			button.setText("      ");
			mole = false;
	//		System.out.println("You Hit The Wrong Space.");
			//speak("You Hit The Wrong Space.");
		}
		
	}
}
private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}
/*static void speak(String words) {
    if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
        String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                + words + "');\"";
        try {
            Runtime.getRuntime().exec( cmd ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    } else {
        try {
            Runtime.getRuntime().exec( "say " + words ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
} */
private void playSound(String fileName) { 
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}
}
