import javax.swing.*;
import java.awt.event.*;

public class Buttons {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Click Message");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JLabel label = new JLabel("OK Button clicked");
                JOptionPane.showMessageDialog(frame, label.getText());
            }
        });

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Cancel Button clicked");
            }
        });

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Submit Button clicked");
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);
        buttonPanel.add(submitButton);

        frame.add(buttonPanel);

        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
