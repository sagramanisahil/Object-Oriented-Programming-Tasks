import javax.swing.*;
import java.awt.event.*;

public class CopyText extends JFrame implements ActionListener {
    private JTextField textField1, textField2;
    private JButton okButton;

    public CopyText() {
       
        setTitle("Copy Text");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        okButton = new JButton("OK");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(textField1)
                        .addComponent(okButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(textField2))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(textField1)
                .addComponent(textField2))
                .addComponent(okButton)
        );

        okButton.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == okButton) {
            String text = textField1.getText();
            textField2.setText(text);
        }
    }

    public static void main(String[] args) {
        new CopyText();
    }
}
