import java.awt.*;
import javax.swing.*;
import java.awt.FlowLayout;

class GuiTest {
    JFrame myFrame;
    JButton submitButton;
    JButton cancelButton;
    JRadioButton maleRadioButton;
    JRadioButton femaleRadioButton;
    JCheckBox readingCheckBox;
    JCheckBox sportsCheckBox;
    JCheckBox codingCheckBox;
    JCheckBox musicCheckBox;
    JTextArea commentsTextArea;
    JLabel myLabel;
    JComboBox[] provinceComboBox;
    JTextField nameTextField, nicTextField;
    JLabel nameLabel, nicLabel, genderLabel, provinceLabel, hobbiesLabel, commentsLabel;

    void initGUI() {
        myFrame = new JFrame("BIO FORM");

        myFrame.setLayout(new BoxLayout(myFrame.getContentPane(), BoxLayout.Y_AXIS));

        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel titleLabel = new JLabel("My Bio Form");
        titleLabel.setFont(titleLabel.getFont().deriveFont(Font.BOLD, 25f)); 
        titlePanel.add(titleLabel);
        myFrame.add(titlePanel);

        JPanel nicPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        nicLabel = new JLabel("NIC: ");
	nicLabel.setFont(nicLabel.getFont().deriveFont(Font.BOLD, 15f));
        nicTextField = new JTextField(15);
        nicPanel.add(nicLabel);
        nicPanel.add(nicTextField);
        myFrame.add(nicPanel);

        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        nameLabel = new JLabel("Name: ");
	nameLabel.setFont(nameLabel.getFont().deriveFont(Font.BOLD, 15f));
        nameTextField = new JTextField(10);
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);
        myFrame.add(namePanel);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
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
        myFrame.add(genderPanel);

        JPanel provincePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        provinceLabel = new JLabel("Province: ");
	provinceLabel.setFont(provinceLabel.getFont().deriveFont(Font.BOLD, 15f));
        String[] provinces = {"Pakistan", "India", "London", "USA", "Canada", "Europe", "Italy", "New york", "Afghanistan", "Dubai"};
        provinceComboBox = new JComboBox[1];
        provinceComboBox[0] = new JComboBox<>(provinces);
        provincePanel.add(provinceLabel);
        provincePanel.add(provinceComboBox[0]);
        myFrame.add(provincePanel);

        JPanel hobbiesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        hobbiesLabel = new JLabel("Hobbies: ");
	hobbiesLabel.setFont(hobbiesLabel.getFont().deriveFont(Font.BOLD, 15f));
        readingCheckBox = new JCheckBox("Reading");
        codingCheckBox = new JCheckBox("Coding");
        sportsCheckBox = new JCheckBox("Sports");
        musicCheckBox = new JCheckBox("Music");
        hobbiesPanel.add(hobbiesLabel);
        hobbiesPanel.add(hobbiesPanel);

        JPanel commentsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        commentsLabel = new JLabel("Comments: ");
	commentsLabel.setFont(commentsLabel.getFont().deriveFont(Font.BOLD, 15f));
        commentsTextArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(commentsTextArea);
        commentsPanel.add(commentsLabel);
        commentsPanel.add(scrollPane);
        myFrame.add(commentsPanel);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        submitButton = new JButton("Submit");
        cancelButton = new JButton("Cancel");
        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);
        myFrame.add(buttonPanel);

        JPanel developerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel developerLabel = new JLabel("Developed by Sahil Kumar");
	developerLabel.setFont(developerLabel.getFont().deriveFont(Font.BOLD, 20f));
        developerPanel.add(developerLabel);
        myFrame.add(developerPanel);

        myFrame.setSize(300, 400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}

public class Bio {
    public static void main(String[] args) {
        GuiTest gt = new GuiTest();
        gt.initGUI();
    }
}
