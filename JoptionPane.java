import javax.swing.JOptionPane;
public class JoptionPane {
	public static void main(String[] args) {

//String input(Default)

String name = JOptionPane.showInputDialog("Enter your name:");
JOptionPane.showMessageDialog(null, "Hello, " + name + "! Welcome.");

//Integer Input

String str = JOptionPane.showInputDialog("Enter Any Number: ");
int num = Integer.parseInt(str);
JOptionPane.showMessageDialog(null, "you entered" + num + "! Welcome.");

//For float/double

str = JOptionPane.showInputDialog("Enter Any Number: ");
float num1 = Float.parseFloat(str);
JOptionPane.showMessageDialog(null, "you entered" + num1 + "! Welcome.");
}
}