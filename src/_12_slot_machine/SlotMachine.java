package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton spiin = new JButton();
JLabel loss1;
JLabel loss2;
JLabel loss3;
Random ran = new Random();
int ranint = ran.nextInt(3);
Random ran2 = new Random();
int ranint2 = ran2.nextInt(3);
Random ran3 = new Random();
int ranint3 = ran3.nextInt(3);
	public void run() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(spiin);
		frame.setTitle("Slot Machine");
		spiin.setText("Spin");
		spiin.addActionListener(this);
		frame.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent SPIIIN) {
		int ranint = ran.nextInt(3);
		int ranint2 = ran2.nextInt(3);
		int ranint3 = ran3.nextInt(3);
		panel.removeAll();
		panel.add(spiin);
if(ranint==0) {
	try {
		loss1 = createLabelImage("orange.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	panel.add(loss1);
	frame.pack();
}
if(ranint==1) {
	try {
		loss1 = createLabelImage("cherry.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	panel.add(loss1);
	frame.pack();
		}
if(ranint==2) {
	try {
		loss1 = createLabelImage("banana.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	panel.add(loss1);
	frame.pack();
}
if(ranint2==0) {
	try {
		loss2 = createLabelImage("banana.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	panel.add(loss2);
	frame.pack();
		}
if(ranint2==1) {
	try {
		loss2 = createLabelImage("orange.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	panel.add(loss2);
	frame.pack();
}
if(ranint2==2) {
	try {
		loss2 = createLabelImage("cherry.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	panel.add(loss2);
	frame.pack();
}
if(ranint3==0) {
	try {
		loss3 = createLabelImage("cherry.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	panel.add(loss3);
	frame.pack();
}
if(ranint3==1) {
	try {
		loss3 = createLabelImage("banana.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	panel.add(loss3);
	frame.pack();
}
if(ranint3==2) {
	try {
		loss3 = createLabelImage("orange.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	panel.add(loss3);
	frame.pack();
}
		if(ranint==0 && ranint2==1 && ranint3==2) {
			System.out.println("orange win");
			JOptionPane.showMessageDialog(null, "You won...     ALL your money back and the WITS to leave and never come back!!!");
		}
		if(ranint==1 && ranint2==2 && ranint3==0) {
			System.out.println("cherry win");
			JOptionPane.showMessageDialog(null, "You won...      ANYTHING AND EVERYTHING YOU WANT!!!!!");
		}
		if(ranint==2 && ranint2==0 && ranint3==1) {
			System.out.println("banana win");
			JOptionPane.showMessageDialog(null, "You win a...   MONKEY!!!");
		}
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}

}
