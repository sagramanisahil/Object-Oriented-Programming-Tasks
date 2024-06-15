package atm.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label, label1, label2;
    JTextField textField;
    JPasswordField passwordField;
    JButton button1,button2,button3;
    String pin;

    Login(String pin) {
        super("ATM Management System");
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/Atm.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 100, 100);
        add(image);

        label = new JLabel("Welcome to ATM Machine");
        label.setForeground(Color.white);
        label.setFont(new Font("TimesNewRoman",Font.BOLD,25));
        label.setBounds(260,125,450,40);
        add(label);

        label1 = new JLabel("Card No : ");
        label1.setForeground(Color.white);
        label1.setFont(new Font("Arial",Font.BOLD,20));
        label1.setBounds(170,190,375,30);
        add(label1);

        textField = new JTextField(15);
        textField.setFont(new Font("Arial", Font.BOLD,20));
        textField.setBounds(325, 190,230,30);
        add(textField);

        label2 = new JLabel("PIN : ");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Arial",Font.BOLD,20));
        label2.setBounds(210,205,390,120);
        add(label2);

        passwordField = new JPasswordField(15);
        passwordField.setBounds(325,250,230,30);
        passwordField.setFont(new Font("Arial",Font.BOLD,20));
        add(passwordField);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD,15));
        button1.setForeground(Color.white);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300, 300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("Cancel");
        button2.setFont(new Font("Arial", Font.BOLD, 15));
        button2.setForeground(Color.white);
        button2.setBackground(Color.BLACK);
        button2.setBounds(450, 300, 100, 30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial", Font.BOLD, 15));
        button3.setForeground(Color.white);
        button3.setBackground(Color.BLACK);
        button3.setBounds(360, 350, 150, 30 );
        button3.addActionListener(this);
        add(button3);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("Icons/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel imageLabel = new JLabel(ii3);
        imageLabel.setBounds(630, 350, 100, 100);
        add(imageLabel);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("Icons/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel i = new JLabel(iii3);
        i.setBounds(0, 0, 850, 480);
        add(i);

        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
        setVisible(true);
    }
    public static void main(String args[]){

        new Login("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        if (e.getSource()==button1){
            Connectivity c = new Connectivity();
            String cardno = textField.getText();
            String pin = passwordField.getText();
            String q = "select * from login where card_no = '"+cardno+"' and  pin = '"+pin+"'";
            ResultSet resultSet = c.statement.executeQuery(q);
            if (resultSet.next()){
                setVisible(false);
                new Main(pin);
            }else {
                JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
            }

        } else if (e.getSource() == button2) {
                textField.setText("");
                passwordField.setText("");
            } else if (e.getSource() == button3) {
                new Signup().setVisible(true);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }

}
package atm.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L)+ 1000L;
    String first = " " + Math.abs(first4);
    JTextField textField,textField1,textField2,textField3,textField4;
    JLabel genderLabel,maritalLabel;
    JButton button4;
    JRadioButton maleRadioButton,femaleRadioButton,marriedRadioButton,unmarriedRadioButton,otherRadioButton;

    Signup(){
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/Atm.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("Application Form No: "+first);
        label1.setBounds(160,20, 600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Personal Details");
        label2.setBounds(160,80, 600,40);
        label2.setFont(new Font("Arial",Font.BOLD,25));
        add(label2);

        JLabel label3 = new JLabel("Name : ");
        label3.setBounds(100,150, 350,20);
        label3.setFont(new Font("Arial",Font.BOLD,20));
        add(label3);

        textField = new JTextField(15);
        textField.setFont(new Font("Arial", Font.BOLD,20));
        textField.setBounds(275, 150,230,25);
        add(textField);

        JLabel label4 = new JLabel("Father's Name : ");
        label4.setBounds(100,200, 370,20);
        label4.setFont(new Font("Arial",Font.BOLD,20));
        add(label4);

        textField1 = new JTextField(15);
        textField1.setFont(new Font("Arial", Font.BOLD,20));
        textField1.setBounds(275, 200,230,25);
        add(textField1);

        genderLabel = new JLabel("Gender: ");
        genderLabel.setBounds(100,250, 350,20);
        genderLabel.setFont(new Font("Arial",Font.BOLD,20));
        ButtonGroup genderGroup = new ButtonGroup();
        maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(275, 250, 100, 30);
        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(380, 250, 100, 30);
        add(genderLabel);
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        add(maleRadioButton);
        add(femaleRadioButton);

        JLabel label5 = new JLabel("Email Address:");
        label5.setBounds(100,290, 250,20);
        label5.setFont(new Font("Arial",Font.BOLD,20));
        add(label5);

        textField2 = new JTextField(15);
        textField2.setFont(new Font("Arial", Font.BOLD,20));
        textField2.setBounds(275, 290,230,25);
        add(textField2);

        maritalLabel = new JLabel("Marital Status : ");
        maritalLabel.setBounds(100,350, 350,20);
        maritalLabel.setFont(new Font("Arial",Font.BOLD,20));
        ButtonGroup maritalGroup = new ButtonGroup();
        marriedRadioButton = new JRadioButton("Married");
        marriedRadioButton.setBounds(280, 345, 100, 30);
        unmarriedRadioButton = new JRadioButton("UnMarried");
        unmarriedRadioButton.setBounds(390, 345, 100, 30);
        otherRadioButton = new JRadioButton("Other");
        otherRadioButton.setBounds(500, 345, 100, 30);
        add(maritalLabel);
        maritalGroup.add(marriedRadioButton);
        maritalGroup.add(unmarriedRadioButton);
        maritalGroup.add(otherRadioButton);
        add(marriedRadioButton);
        add(unmarriedRadioButton);
        add(otherRadioButton);

        JLabel label6 = new JLabel("Address : ");
        label6.setBounds(100,410, 370,20);
        label6.setFont(new Font("Arial",Font.BOLD,20));
        add(label6);

        textField3 = new JTextField(30);
        textField3.setFont(new Font("Arial", Font.BOLD,20));
        textField3.setBounds(275, 410,230,25);
        add(textField3);

        JLabel label7 = new JLabel("PIN : ");
        label7.setBounds(100,480, 370,20);
        label7.setFont(new Font("Arial",Font.BOLD,20));
        add(label7);

        textField4 = new JPasswordField(15);
        textField4.setFont(new Font("Arial", Font.BOLD,20));
        textField4.setBounds(275, 480,230,25);
        add(textField4);

        button4 = new JButton("Next");
        button4.setFont(new Font("Arial", Font.BOLD, 15));
        button4.setForeground(Color.white);
        button4.setBackground(Color.BLACK);
        button4.setBounds(600, 600, 150, 30 );
        button4.addActionListener(this);
        add(button4);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(400, 40);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textField.getText();
        String fname = textField1.getText();
        String gender = null;
        if(maleRadioButton.isSelected()){
            gender = "Male";
        } else if (femaleRadioButton.isSelected()) {
            gender = "Female";
        }
        String email = textField2.getText();
        String marital = null;
        if(marriedRadioButton.isSelected()){
            marital = "Married";
        } else if (unmarriedRadioButton.isSelected()) {
            marital = "UnMarried";
        } else if (otherRadioButton.isSelected()) {
            marital = "Other";
        }
        String adress = textField3.getText();
        String pin = textField4.getText();

        try{
            if(textField.getText().equals("") || textField1.getText().equals("") ||
                    textField2.getText().equals("") || textField3.getText().equals("") ||
                    textField4.getText().equals("") || gender == null || marital == null){
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else{
                Connectivity c2 = new Connectivity();
                String q = "insert into Signup9 values('"+name+"', '"+fname+"', '"+gender+"', '"+email+"', '"+marital+"', '"+adress+"', '"+pin+"')";
                c2.statement.executeUpdate(q);
                new Signup2().setVisible(true);
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }


    }
    public static void main(String [] args){
        new Signup();
    }
}
package atm.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup2 extends JFrame implements ActionListener {
    JLabel accountLabel;
    JRadioButton currentRadioButton, savingRadioButton,fixedDepositRadioButton;
    JCheckBox checkBox;
    JButton b1,b2;



    Signup2(){

        super("Application Form");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/Atm.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 20, 100, 100);
        add(image);

        JLabel label2 = new JLabel("Account Details");
        label2.setBounds(220,90, 600,40);
        label2.setFont(new Font("Arial",Font.BOLD,25));
        add(label2);

        accountLabel = new JLabel("Account Type: ");
        accountLabel.setBounds(100,180, 350,20);
        accountLabel.setFont(new Font("Arial",Font.BOLD,20));
        ButtonGroup accountGroup = new ButtonGroup();
        currentRadioButton = new JRadioButton("Current Account");
        currentRadioButton.setBounds(280, 175, 100, 30);
        savingRadioButton = new JRadioButton("Saving Account");
        savingRadioButton.setBounds(400, 175, 100, 30);
        fixedDepositRadioButton = new JRadioButton("Fixed Deposit Account");
        fixedDepositRadioButton.setBounds(520, 175, 100, 30);
        add(accountLabel);
        accountGroup.add(currentRadioButton);
        accountGroup.add(savingRadioButton);
        accountGroup.add(fixedDepositRadioButton);
        add(currentRadioButton);
        add(savingRadioButton);
        add(fixedDepositRadioButton);

        JLabel label8 = new JLabel("Card No : ");
        label8.setBounds(100,220, 370,20);
        label8.setFont(new Font("Arial",Font.BOLD,20));
        add(label8);

        JLabel label9 = new JLabel("(Your 16 digit Card No)");
        label9.setBounds(100,245, 370,20);
        label9.setFont(new Font("Arial",Font.BOLD,15));
        add(label9);

        JLabel label4 = new JLabel("XXXX-XXXX-XXXX-7433");
        label4.setBounds(280,220, 370,20);
        label4.setFont(new Font("Arial",Font.BOLD,20));
        add(label4);

        JLabel label3 = new JLabel("PIN : ");
        label3.setBounds(100,300, 370,20);
        label3.setFont(new Font("Arial",Font.BOLD,20));
        add(label3);

        JLabel label = new JLabel("(Your 4 digit PIN)");
        label.setBounds(100,320, 370,20);
        label.setFont(new Font("Arial",Font.BOLD,15));
        add(label);

        JLabel label1 = new JLabel("XXXX");
        label1.setBounds(280,300, 370,20);
        label1.setFont(new Font("Arial",Font.BOLD,20));
        add(label1);

        checkBox = new JCheckBox();
        checkBox.setFont(new Font("Arial", Font.BOLD,20));
        checkBox.setBounds(100, 380,20,25);
        add(checkBox);

        JLabel l2 = new JLabel("I here by declares that the above details are correct");
        l2.setBounds(130,380, 370,20);
        l2.setFont(new Font("Arial",Font.BOLD,15));
        add(l2);

        b1 = new JButton("Submit");
        b1.setFont(new Font("Arial", Font.BOLD,15));
        b1.setForeground(Color.white);
        b1.setBackground(Color.BLACK);
        b1.setBounds(300, 500,100,30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setFont(new Font("Arial", Font.BOLD, 15));
        b2.setForeground(Color.white);
        b2.setBackground(Color.BLACK);
        b2.setBounds(450, 500, 100, 30);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(new Color(252,228,76));
        setLayout(null);
        setSize(850,800);
        setLocation(400, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if(savingRadioButton.isSelected()){
            atype = "Saving Account";
        }else if(currentRadioButton.isSelected()){
            atype = "Current Account";
        }else if(fixedDepositRadioButton.isSelected()) {
            atype = "Fixed Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = " " + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = " " + Math.abs(first3);

        try{
            if(e.getSource()==b1){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else{
                    Connectivity c1 = new Connectivity();
                    String q1 = "insert into Signupt values('"+atype+"','"+cardno+"','"+pin+"')";
                    String q2 = "insert into login3 values('"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin );
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==b2) {
                System.exit(0);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String args[]){
       new Signup2();
    }
}
package atm.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1,b2;
    Deposit(String pin){
        this.pin= pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(460,180,480 ,35);
        image.add(label1);

        textField = new TextField();
        textField.setBackground(new Color(65,128,125));
        textField.setForeground(Color.white);
        textField.setBounds(460,230,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        image.add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(700,362,150,35);
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,128,125));
        b1.addActionListener(this);
        image.add(b1);

        b2= new JButton("BACK");
        b2.setBounds(700,410,150,35);
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,128,125));
        b2.addActionListener(this);
        image.add(b2);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0, 0);
        setVisible(true);
    }

    public static void main(String args[]){

        new Deposit("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date = new Date();

            if(e.getSource()==b1){
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter amount you want to deposit");
                }else {
                    Connectivity c1 = new Connectivity();
                    c1.statement.executeUpdate("insert into Deposit values('"+pin+"', '"+date+"','Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new Main(pin);
                }
            }else if(e.getSource()==b2){
                setVisible(false);
                new Main(pin);
            }

        } catch(Exception E){
            E.printStackTrace();

        }
    }
}

package atm.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdraw extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1,b2;
    Withdraw(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        JLabel label1 = new JLabel("Maximum WithDrawl Amount is Rs: 10,000");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(460,180,700 ,35);
        image.add(label1);

        JLabel label2 = new JLabel("Please Enter your Amount");
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(460,220,700 ,35);
        image.add(label2);

        textField = new TextField();
        textField.setBackground(new Color(65,128,125));
        textField.setForeground(Color.white);
        textField.setBounds(460,260,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        image.add(textField);

        b1 = new JButton("WithDrawl");
        b1.setBounds(700,362,150,35);
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,128,125));
        b1.addActionListener(this);
        image.add(b1);

        b2= new JButton("BACK");
        b2.setBounds(700,410,150,35);
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,128,125));
        b2.addActionListener(this);
        image.add(b2);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0, 0);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
                } else {
                    Connectivity c3 = new Connectivity();
                    ResultSet resultSet = c3.statement.executeQuery("select * from withdraw2 where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance <= Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    c3.statement.executeUpdate("insert into withdraw2 values('" + pin + "', '" + date + "', 'Withdraw', '" + amount + "' )");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Withdraw Successfully");
                    setVisible(false);
                    new Main(pin);

                }
            }catch(Exception E) {

            }
        } else if (e.getSource()==b2) {
            setVisible(false);
            new Main(pin);
        }
    }

    public static void main(String[] args) {
        new Withdraw("");
    }
}package atm.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    FastCash(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        JLabel label = new JLabel("Select WithDrawl Amount");
        label.setBounds(430,180,700,35);
        label.setForeground(Color.white);
        label.setFont(new Font("Arial", Font.BOLD,25));
        image.add(label);

        b1 = new JButton("Rs 100");
        b1.setBounds(410,270,130,35);
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,128,125));
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("Rs 500");
        b2.setBounds(410,317,130,35);
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,128,125));
        b2.addActionListener(this);
        image.add(b2);

        b3 = new JButton("Rs 1000");
        b3.setBounds(410,363,130,35);
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,128,125));
        b3.addActionListener(this);
        image.add(b3);

        b7 = new JButton("Rs 2000");
        b7.setBounds(410,410,130,35);
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,128,125));
        b7.addActionListener(this);
        image.add(b7);

        b4 = new JButton("Rs 5000");
        b4.setBounds(715,270,130,35);
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,128,125));
        b4.addActionListener(this);
        image.add(b4);

        b5 = new JButton("Rs 10000");
        b5.setBounds(715,315,130,35);
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,128,125));
        b5.addActionListener(this);
        image.add(b5);

        b6 = new JButton("Back");
        b6.setBounds(715,358,130,35);
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,128,125));
        b6.addActionListener(this);
        image.add(b6);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0, 0);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b6) {
            setVisible(false);
            new Main(pin);
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Connectivity c5 = new Connectivity();
            Date date = new Date();
            try{
                ResultSet resultSet = c5.statement.executeQuery("select * from fastCash2 where pin = '"+pin+"'");
                int balance =0;
                while (resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                if (e.getSource() != b6 && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }

                c5.statement.executeUpdate("insert into fastCash2 values('"+pin+"','"+date+"', 'withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new Main(pin);
        }


    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
package atm.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceInquiry extends JFrame implements ActionListener {
    JLabel label2;
    JButton b1;
    String pin;
    BalanceInquiry(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        JLabel label1 = new JLabel("Your Current Balance is : ");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(460,180,700 ,35);
        image.add(label1);

        label2 = new JLabel();
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(460,220,700 ,35);
        image.add(label2);

        b1 = new JButton("Back");
        b1.setBounds(700,406,150,35);
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,128,125));
        b1.addActionListener(this);
        image.add(b1);

        int balance =0;
        try{
            Connectivity c4 = new Connectivity();
            ResultSet resultSet = c4.statement.executeQuery("Select * from balanceInquiry2 where pin = '"+pin+"'");
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        label2.setText(""+balance);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Main(pin);
    }

    public static void main(String[] args) {
        new BalanceInquiry("");
    }
}package atm.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener {

    String pin;
    JButton button;

    MiniStatement(String pin){
        this.pin = pin;
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(new Color(255,204,204));
        setLayout(null);

        JLabel label1 = new JLabel();
        label1.setBounds(20,140,400,20);
        add(label1);

        JLabel label2 = new JLabel("Sahil Kumar");
        label2.setFont(new Font("System",Font.BOLD,15));
        label2.setBounds(150,20,200,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,400,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,400,300,20);
        add(label4);


        try{
            Connectivity c8 = new Connectivity();
            ResultSet resultSet = c8.statement.executeQuery("select * from login1 where pin = '"+pin+"'");
            while (resultSet.next()){
                label3.setText("Card Number:  "+ resultSet.getString("card_no").substring(0,4) + "XXXXXXXX"+ resultSet.getString("card_number").substring(12));
            }
        }catch (Exception e ){
            e.printStackTrace();
        }

        try{
            int balance =0;
            Connectivity c7 = new Connectivity();
            ResultSet resultSet = c7.statement.executeQuery("select * from miniStatement2 where pin = '"+pin+"'");
            while (resultSet.next()){

                label1.setText(label1.getText() + "<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+ "<br><br><html>");

                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("Your Total Balance is Rs "+balance);
        }catch (Exception e){
            e.printStackTrace();
        }

        button = new JButton("Exit");
        button.setBounds(20,500,100,25);
        button.addActionListener(this);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        add(button);

        setVisible(true);
    }

    public static void main(String[] args){
        new MiniStatement("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }
}
package atm.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {

    String pin;
    JButton b1,b2;
    JPasswordField p1,p2;
    Pin(String pin){

        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        JLabel label1 = new JLabel("Change your Pin");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(430,180,480 ,35);
        image.add(label1);

        JLabel label2 = new JLabel("New Pin");
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(430,220,150 ,35);
        image.add(label2);

        p1 = new JPasswordField();
        p1.setBackground(new Color(65,128,125));
        p1.setForeground(Color.white);
        p1.setBounds(600,220,180,25);
        p1.setFont(new Font("Rale way",Font.BOLD,22));
        image.add(p1);

        JLabel label3 = new JLabel("Re-Enter New Pin");
        label3.setForeground(Color.white);
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setBounds(430,250,200 ,35);
        image.add(label3);

        p2 = new JPasswordField();
        p2.setBackground(new Color(65,128,125));
        p2.setForeground(Color.white);
        p2.setBounds(600,260,180,25);
        p2.setFont(new Font("Rale way",Font.BOLD,22));
        image.add(p2);

        b1 = new JButton("Change");
        b1.setBounds(700,362,150,35);
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,128,125));
        b1.addActionListener(this);
        image.add(b1);

        b2= new JButton("BACK");
        b2.setBounds(700,410,150,35);
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,128,125));
        b2.addActionListener(this);
        image.add(b2);



        setLayout(null);
        setSize(1550,1080);
        setLocation(0, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try{

            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if (!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                return;
            }
            if (e.getSource()==b1){
                if (p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                    return;
                }
                if (p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                    return;
                }

                Connectivity c6= new Connectivity();
                String q1 = "update Pin setPin pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2 = "update  setPin2 pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3 = "update signup9 setPin pin = '"+pin1+"' where pin = '"+pin+"'";

                c6.statement.executeUpdate(q1);
                c6.statement.executeUpdate(q2);
                c6.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN changed successfully");
                setVisible(false);
                new Main(pin);

            } else if (e.getSource()==b2) {
                new Main(pin);
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Pin("");
    }
}package atm.management.system;

import java.sql.*;

public class Connectivity  {
    Connection connection;
    Statement statement;
    public Connectivity(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","kumarsahil@04");
            statement = connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Connectivity();
    }
}
package atm.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Frame implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7;
    String pin;

    Main(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(430, 180, 700, 35);
        label.setForeground(Color.white);
        label.setFont(new Font("Arial", Font.BOLD, 25));
        image.add(label);

        b1 = new JButton("Deposit");
        b1.setBounds(410, 270, 130, 35);
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65, 128, 125));
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("Cash WithDrawl");
        b2.setBounds(410, 317, 130, 35);
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65, 128, 125));
        b2.addActionListener(this);
        image.add(b2);

        b3 = new JButton("Balance Inquiry");
        b3.setBounds(410, 363, 130, 35);
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65, 128, 125));
        b3.addActionListener(this);
        image.add(b3);

        b7 = new JButton("Fast Cash");
        b7.setBounds(410, 410, 130, 35);
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65, 128, 125));
        b7.addActionListener(this);
        image.add(b7);

        b4 = new JButton("Pin Change");
        b4.setBounds(715, 270, 130, 35);
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65, 128, 125));
        b4.addActionListener(this);
        image.add(b4);

        b5 = new JButton("Mini Statement");
        b5.setBounds(715, 315, 130, 35);
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65, 128, 125));
        b5.addActionListener(this);
        image.add(b5);

        b6 = new JButton("Exit");
        b6.setBounds(715, 358, 130, 35);
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65, 128, 125));
        b6.addActionListener(this);
        image.add(b6);


        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    public static void main(String args[]) {

        new Main("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource() == b7) {
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource() == b2) {
            new Withdraw(pin);
            setVisible(false);
        } else if (e.getSource() == b6) {
            System.exit(0);
        } else if (e.getSource() == b3) {
            new BalanceInquiry(pin);
            setVisible(false);
        } else if (e.getSource() == b5) {
            new MiniStatement(pin);
            setVisible(false);
        } else if (e.getSource() == b4) {
            new Pin(pin);
            setVisible(false);
        }

    }

}
