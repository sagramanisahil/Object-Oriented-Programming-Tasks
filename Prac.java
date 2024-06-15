import javax.swing.*;
import java.awt.*;

public class Prac{
	public static void main(String args[]){

	JFrame frame = new JFrame();
	JButton button;
	JTextField textfield1,textfield2;
	

	JLabel label = new JLabel("User");
	label.setBounds(20,20,100,30);
	label.setFont(new Font("Arial",Font.BOLD,20));
	frame.add(label);

	textfield1 = new JTextField(20);
	textfield1.setBounds(150,20,150,20);
	frame.add(textfield1);

	JLabel label1 = new JLabel("Password");
	label1.setBounds(20,60,100,30);
	label1.setFont(new Font("Arial",Font.BOLD,20));
	frame.add(label1);

	textfield2 = new JTextField(20);
	textfield2.setBounds(150,60,150,20);
	frame.add(textfield2);

	button = new JButton("Login");
	button.setBounds(150,100,80,30);
	frame.add(button);


	

	

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,600);
	frame.setLayout(null);
	frame.setTitle("My First Swing Example");
	frame.setVisible(true);
	frame.setResizable(false);

	}
}