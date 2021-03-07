package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class LatestTweet implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField searchTopic = new JTextField(15);
JButton searchButton = new JButton();
String tweet = "anyName";

public void run() {
	frame.setVisible(true);
	frame.setTitle("The Amazing Tweet Retriever");
	searchButton.setText("Search the Twitterverse");
	searchButton.addActionListener(this);
	frame.add(panel);
	panel.add(searchTopic);
	panel.add(searchButton);
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Tweet,Tweet!");
String tweets =	getLatestTweet(searchTopic.getText());
System.out.println(tweets);
JOptionPane.showMessageDialog(null, tweets);
}
private String getLatestTweet(String searchingFor) {

    Twitter twitter = new TwitterFactory().getInstance();

    AccessToken accessToken = new AccessToken(
        "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
        "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
        "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
    twitter.setOAuthAccessToken(accessToken);

Query query = new Query(searchingFor);
    try {
        QueryResult result = twitter.search(query);
        return result.getTweets().get(0).getText();
    } catch (Exception e) {
        System.err.print(e.getMessage());
        return "What the heck is that?";
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
