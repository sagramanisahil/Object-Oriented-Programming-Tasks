import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ATM extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private int pin;
    private double balance = 5000.0;
    private JTextField signUpPinField;
    private JTextField signUpNameField;
    private JTextField pinField;
    private JTextField amountField;
    private JTextArea displayArea;
    private JButton checkBalanceButton;
    private JButton withdrawButton;
    private JButton transferButton;
    private JButton exitButton;
    private JButton loginButton;
    private JButton signUpButton;

    public ATM() {
        setTitle("ATM Simulator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center window on screen
        setIconImage(new ImageIcon("atm_icon.png").getImage());

        JPanel signUpPanel = new JPanel();
        JLabel signUpNameLabel = new JLabel("Enter Name: ");
        signUpNameField = new JTextField(10);
        JLabel signUpPinLabel = new JLabel("Enter PIN: ");
        signUpPinField = new JTextField(10);
        signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(this);

        signUpPanel.add(signUpNameLabel);
        signUpPanel.add(signUpNameField);
        signUpPanel.add(signUpPinLabel);
        signUpPanel.add(signUpPinField);
        signUpPanel.add(signUpButton);

        JPanel mainPanel = new JPanel(new GridLayout(2, 1));

        JPanel loginPanel = new JPanel();
        JLabel pinLabel = new JLabel("Enter PIN: ");
        pinField = new JTextField(10);
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        loginPanel.add(pinLabel);
        loginPanel.add(pinField);
        loginPanel.add(loginButton);
        loginPanel.setVisible(false);

        JPanel atmPanel = new JPanel(new GridLayout(4, 1));
        checkBalanceButton = new JButton("Check Balance");
        checkBalanceButton.addActionListener(this);
        withdrawButton = new JButton("Withdraw Cash");
        withdrawButton.addActionListener(this);
        transferButton = new JButton("Transfer Amount");
        transferButton.addActionListener(this);
        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);

        atmPanel.add(checkBalanceButton);
        atmPanel.add(withdrawButton);
        atmPanel.add(transferButton);
        atmPanel.add(exitButton);

        displayArea = new JTextArea();
        displayArea.setEditable(false);

        mainPanel.add(atmPanel);
        mainPanel.add(displayArea);

        getContentPane().add(signUpPanel, BorderLayout.NORTH);
        getContentPane().add(loginPanel, BorderLayout.NORTH);
        getContentPane().add(mainPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signUpButton) {
            // Perform sign-up process
            String name = signUpNameField.getText();
            int pin = Integer.parseInt(signUpPinField.getText());
            // Store the name and PIN in a database or file
            JOptionPane.showMessageDialog(null, "Sign up successful! Please login.");
            signUpButton.setEnabled(false);
            signUpNameField.setEnabled(false);
            signUpPinField.setEnabled(false);
            loginButton.setVisible(true);
        } else if (e.getSource() == checkBalanceButton) {
            displayArea.setText("Current Balance: $" + balance);
        } else if (e.getSource() == withdrawButton) {
            double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter Withdraw Cash Amount:"));
            if (amount < 0) {
                JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a positive amount.");
            } else if (amount > balance) {
                JOptionPane.showMessageDialog(null, "Insufficient funds.");
            } else {
                balance -= amount;
                displayArea.setText("Withdrawal Successful. Current Balance: $" + balance);
            }
        } else if (e.getSource() == transferButton) {
            double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter Transfer Amount:"));
            if (amount < 0) {
                JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a positive amount.");
            } else {
                balance += amount;
                displayArea.setText("Transaction Successful. Current Balance: $" + balance);
            }
        } else if (e.getSource() == exitButton) {
            JOptionPane.showMessageDialog(null, "Thank you for using the ATM. Come again soon!");
            System.exit(0);
        } else if (e.getActionCommand().equals("Login")) {
            int enteredPin = Integer.parseInt(pinField.getText());
            if (enteredPin == pin) {
                JOptionPane.showMessageDialog(null, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect PIN. Please enter the correct PIN.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ATM();
            }
        });
    }
}
