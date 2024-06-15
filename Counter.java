import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("AWT Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel("Counter");
        label.setBounds(10,10,10,10);
        label.setFont(new Font("Arial",Font.BOLD,14));
        frame.add(label);
        JTextField count = new JTextField(10);
        JButton countButton = new JButton("Count");
        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int currentValue = Integer.parseInt(count.getText());
                    currentValue++;
                    count.setText(String.valueOf(currentValue));
                } catch (NumberFormatException ex) {
                    System.err.println("Invalid input: " + ex.getMessage());
                }
            }
        });
        frame.add(count);
        frame.add(countButton);
        frame.pack();
        frame.setVisible(true);
    }
}