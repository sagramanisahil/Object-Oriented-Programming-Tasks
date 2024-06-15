import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AlphabetButtons extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] alphabetButtons;

    public AlphabetButtons() {
        setTitle("Alphabet Buttons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField(10);
        textField.addActionListener(this);
        add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 9));
        add(buttonPanel, BorderLayout.CENTER);


        alphabetButtons = new JButton[26];
        for (int i = 0; i < 26; i++) {
            char letter = (char) ('A' + i);
            alphabetButtons[i] = new JButton();
            alphabetButtons[i].setActionCommand(Character.toString(letter));
            alphabetButtons[i].addActionListener(this);
            alphabetButtons[i].setEnabled(false); // Initially disable buttons
            buttonPanel.add(alphabetButtons[i]);
        }

        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        // Check if source is a button
        if (source instanceof JButton) {
            JButton clickedButton = (JButton) source;
            String buttonText = clickedButton.getActionCommand();

            // Show button label
            clickedButton.setText(buttonText);

        } else if (source instanceof JTextField) {
            // If enter key pressed in text field
            String inputText = textField.getText().toUpperCase();
            if (inputText.length() > 0 && Character.isLetter(inputText.charAt(0))) {
                char inputChar = inputText.charAt(0);

                // Enable corresponding button
                int index = inputChar - 'A';
                if (index >= 0 && index < 26) {
                    alphabetButtons[index].setEnabled(true);
                    alphabetButtons[index].setText(Character.toString(inputChar));
                }
            }
        }
    }

    public static void main(String[] args) {
        new AlphabetButtons();
    }
}
