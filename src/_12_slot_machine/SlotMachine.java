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
		
	}
	@Override
	public void actionPerformed(ActionEvent SPIIIN) {
		int ranint = ran.nextInt(3);
		int ranint2 = ran2.nextInt(3);
		int ranint3 = ran3.nextInt(3);
if(ranint==1) {
	try {
		loss1 = createLabelImage("water.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	panel.add(loss1);
}
if(ranint==2) {
	try {
		loss1 = createLabelImage("cat.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	panel.add(loss1);
		}
if(ranint==3) {
	try {
		loss1 = createLabelImage("boom.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	panel.add(loss1);
}
if(ranint2==1) {
	try {
		loss2 = createLabelImage("water.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	panel.add(loss2);
		}
if(ranint2==2) {
	try {
		loss2 = createLabelImage("cat.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	panel.add(loss2);
}
if(ranint2==3) {
	try {
		loss2 = createLabelImage("boom.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	panel.add(loss2);
}
if(ranint3==1) {
	try {
		loss3 = createLabelImage("water.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	panel.add(loss3);
}
if(ranint3==2) {
	try {
		loss3 = createLabelImage("cat.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	panel.add(loss3);
}
if(ranint3==3) {
	try {
		loss3 = createLabelImage("boom.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	panel.add(loss3);
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
