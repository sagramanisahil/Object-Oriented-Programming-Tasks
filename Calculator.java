import javax.swing.*;
import java.awt.*;

public class Calculator {
    JFrame frame;
    JTextField t;
    JPanel panel;

    public Calculator() {
        frame = new JFrame("Calculator");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t = new JTextField();
        t.setFont(new Font("Arial", Font.PLAIN, 24));
        t.setHorizontalAlignment(JTextField.RIGHT);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            panel.add(button);
        }

        frame.setLayout(new BorderLayout());
        frame.add(t, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String args[]) {
        Calculator c = new Calculator();
    }
}
