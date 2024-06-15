import java.awt.*;
import javax.swing.*;

class RForm {
    JFrame f1;
    JButton submitButton;
    JButton ResetButton;
    JRadioButton maleRadioButton;
    JRadioButton femaleRadioButton;
    JTextField textField;
    JCheckBox checkBox;
    JTextArea commentsTextArea;
    JTextField nameTextField, mobileTextField;
    JLabel nameLabel, mobileLabel, genderLabel, commentsLabel;

    void initGui() {
        f1 = new JFrame("Registration Form");

        f1.setLayout(new BorderLayout()); // Changed layout manager to BorderLayout

        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel titleLabel = new JLabel("Registration Form");
        titleLabel.setFont(titleLabel.getFont().deriveFont(Font.BOLD, 25f));
        titlePanel.add(titleLabel);
        f1.add(titlePanel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(); // New panel to hold form components
        formPanel.setLayout(new GridLayout(6, 1, 5, 5)); // Changed layout manager to GridLayout with reduced gaps
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Added padding

        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        nameLabel = new JLabel("Name:");
        nameTextField = new JTextField(10);
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);
        formPanel.add(namePanel);

        JPanel mobilePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        mobileLabel = new JLabel("Mobile Number:");
        mobileTextField = new JTextField(12);
        mobilePanel.add(mobileLabel);
        mobilePanel.add(mobileTextField);
        formPanel.add(mobilePanel);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        genderLabel = new JLabel("Gender:");
        genderLabel.setFont(genderLabel.getFont().deriveFont(Font.BOLD, 15f));
        ButtonGroup genderGroup = new ButtonGroup();
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        genderPanel.add(genderLabel);
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        formPanel.add(genderPanel);

        JPanel dobPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel dobLabel = new JLabel("Date of Birth:");
        JTextField dayTextField = new JTextField(2);
        JTextField monthTextField = new JTextField(2);
        JTextField yearTextField = new JTextField(4);
        dobPanel.add(dobLabel);
        dobPanel.add(dayTextField);
        dobPanel.add(new JLabel("/"));
        dobPanel.add(monthTextField);
        dobPanel.add(new JLabel("/"));
        dobPanel.add(yearTextField);
        formPanel.add(dobPanel);

        JPanel commentsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        commentsLabel = new JLabel("Address:");
        commentsLabel.setFont(commentsLabel.getFont().deriveFont(Font.BOLD, 15f));
        commentsTextArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(commentsTextArea);
        commentsPanel.add(commentsLabel);
        commentsPanel.add(scrollPane);
        formPanel.add(commentsPanel);

        JPanel checkBoxPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        checkBox = new JCheckBox("Accept Terms and Conditions");
        checkBoxPanel.add(checkBox);
        formPanel.add(checkBoxPanel);

        f1.add(formPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        submitButton = new JButton("Submit");
        ResetButton = new JButton("Reset");
        buttonPanel.add(submitButton);
        buttonPanel.add(ResetButton);
        f1.add(buttonPanel, BorderLayout.SOUTH);

        f1.setSize(300, 500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
    }
}

class Regis {
    public static void main(String args[]) {
        RForm f = new RForm();
        f.initGui();
    }
}
