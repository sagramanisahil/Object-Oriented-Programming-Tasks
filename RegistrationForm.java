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

        f1.setLayout(new BoxLayout(f1.getContentPane(), BoxLayout.Y_AXIS));

        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel titleLabel = new JLabel("Registration Form");
        titleLabel.setFont(titleLabel.getFont().deriveFont(Font.BOLD, 25f));
        titlePanel.add(titleLabel);
        f1.add(titlePanel);

        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        nameLabel = new JLabel("Name : ");
	nameLabel.setFont(nameLabel.getFont().deriveFont(Font.BOLD, 15f));
        nameTextField = new JTextField(10);
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);
        f1.add(namePanel);

        JPanel mobilePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        mobileLabel = new JLabel("Mobile Number : ");
	mobileLabel.setFont(mobileLabel.getFont().deriveFont(Font.BOLD, 15f));
        mobileTextField = new JTextField(12);
        mobilePanel.add(mobileLabel);
        mobilePanel.add(mobileTextField);
        f1.add(mobilePanel);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderLabel = new JLabel("Gender: ");
        genderLabel.setFont(genderLabel.getFont().deriveFont(Font.BOLD, 15f));
        ButtonGroup genderGroup = new ButtonGroup();
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        genderPanel.add(genderLabel);
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        f1.add(genderPanel);

        JPanel dobPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel dobLabel = new JLabel("Date of Birth: ");
	dobLabel.setFont(dobLabel.getFont().deriveFont(Font.BOLD, 15f));
        JTextField dayTextField = new JTextField(2);
        JTextField monthTextField = new JTextField(2);
        JTextField yearTextField = new JTextField(4);
        dobPanel.add(dobLabel);
        dobPanel.add(dayTextField);
        dobPanel.add(new JLabel("/"));
        dobPanel.add(monthTextField);
        dobPanel.add(new JLabel("/"));
        dobPanel.add(yearTextField);
        f1.add(dobPanel);

        JPanel commentsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        commentsLabel = new JLabel("Address : ");
        commentsLabel.setFont(commentsLabel.getFont().deriveFont(Font.BOLD, 15f));
        commentsTextArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(commentsTextArea);
        commentsPanel.add(commentsLabel);
        commentsPanel.add(scrollPane);
        f1.add(commentsPanel);

        JPanel checkBoxPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        checkBox = new JCheckBox("Accept Terms and Conditions");
        checkBoxPanel.add(checkBox);
        f1.add(checkBoxPanel);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        submitButton = new JButton("Submit");
        ResetButton = new JButton("Reset");
        buttonPanel.add(submitButton);
        buttonPanel.add(ResetButton);
        f1.add(buttonPanel);

        f1.setSize(300, 500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
    }
}

class RegistrationForm {
    public static void main(String args[]) {
        RForm f = new RForm();
        f.initGui();
    }
}
