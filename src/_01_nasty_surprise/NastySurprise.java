package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
static JButton lolforyou = new JButton();
static JButton tricky = new JButton();
static JPanel paneloffools = new JPanel();
static JFrame framethatholdsstuff = new JFrame();
public static void main(String[] args) {
	framethatholdsstuff.setVisible(true);
	framethatholdsstuff.setSize(200,200);
	framethatholdsstuff.add(paneloffools);
	paneloffools.add(tricky);
	paneloffools.add(lolforyou);
	lolforyou.setText("Treat");
	tricky.setText("Trick");
	NastySurprise NS = new NastySurprise();
	NS.aal();
}
public void aal() {
	lolforyou.addActionListener(this);
	tricky.addActionListener(this);
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	//System.out.println("Testing");
	if(arg0.getSource() == lolforyou) {
		showPictureFromTheInternet("https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Bsodwindows10.png/1200px-Bsodwindows10.png");
	}
	if(arg0.getSource() == tricky) {
		showPictureFromTheInternet("https://icatcare.org/app/uploads/2018/07/Thinking-of-getting-a-cat.png");
	}
}
}
