package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
int number1;
int number2;
int number3=0;
String labelint;
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
JButton button4 = new JButton();
JTextField txtfield1 = new JTextField(10);
JTextField txtfield2 = new JTextField(10);
JLabel label= new JLabel();
	public void run() {
		// TODO Auto-generated method stub
	//	add();
	//	subtract();
	//	multiply();
	//	divide();
		frame.setTitle("Calculator");
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(txtfield1);
		panel.add(txtfield2);
		panel.add(label);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button1.setText("Add");
		button2.setText("Subtract");
		button3.setText("Multiply");
		button4.setText("Divide");
		labelint = "" + number3; 
		label.setText(labelint);
		frame.pack();
	}
 public void add() {
	// System.out.println("Test1");
	 String string1 = txtfield1.getText();
	 number1 = Integer.parseInt(string1);
	 String string2 = txtfield2.getText();
	 number2 = Integer.parseInt(string2);
	number3= number1 + number2;
	labelint = "" + number3;
	label.setText(labelint);
 }
 public void subtract() {
	// System.out.println("Test2");
	 String string1 = txtfield1.getText();
	 number1 = Integer.parseInt(string1);
	 String string2 = txtfield2.getText();
	 number2 = Integer.parseInt(string2);
	 number3= number1 - number2;
		labelint = "" + number3;
		label.setText(labelint);
 }
 public void multiply() {
	// System.out.println("Test3");
	 String string1 = txtfield1.getText();
	 number1 = Integer.parseInt(string1);
	 String string2 = txtfield2.getText();
	 number2 = Integer.parseInt(string2);
	 number3= number1 * number2;
		labelint = "" + number3;
		label.setText(labelint);
 }
 public void divide() {
	// System.out.println("Test4");
	 String string1 = txtfield1.getText();
	 number1 = Integer.parseInt(string1);
	 String string2 = txtfield2.getText();
	 number2 = Integer.parseInt(string2);
	 number3= number1 / number2;
		labelint = "" + number3;
		label.setText(labelint);
 }
@Override
public void actionPerformed(ActionEvent aeaeae) {
	// TODO Auto-generated method stub
	if(aeaeae.getSource()==button1) {
		add();
		frame.pack();
	}
if(aeaeae.getSource()==button2) {
		subtract();
		frame.pack();
	}
if(aeaeae.getSource()==button3) {
	multiply();
	frame.pack();
}
if(aeaeae.getSource()==button4) {
	divide();
	frame.pack();
}
}
}
