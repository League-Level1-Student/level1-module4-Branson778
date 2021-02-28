package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LatestTweet implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton searchButton = new JButton();
JTextField searchTopic = new JTextField(15);

public void run() {
	frame.setVisible(true);
	frame.setTitle("The Amazing Tweet Retriever");
	searchButton.setText("Search the Twitterverse");
	searchButton.addActionListener(this);
	frame.add(panel);
	panel.add(searchButton);
	panel.add(searchTopic);
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
