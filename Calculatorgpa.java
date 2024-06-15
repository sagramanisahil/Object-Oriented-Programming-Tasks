import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculatorgpa extends JFrame {

    private static final int MAX_SUBJECTS = 6;

    private static final String[] SUBJECTS = {
            "Programming Fundamentals",
            "Pre-Calculus",
            "English",
            "Pakistan Studies",
            "Ethics",
            "ICT"
    };

    private JTextField[] creditFields;
    private JTextField[] theoryMarksFields;
    private JTextField[] practicalMarksFields;

    private JLabel resultLabel;

    public Calculatorgpa() {
        setTitle("GPA Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel(new GridLayout(MAX_SUBJECTS + 2, 2));

        initializeFields();

        for (int i = 0; i < MAX_SUBJECTS; i++) {
            mainPanel.add(new JLabel(SUBJECTS[i]));
            mainPanel.add(creditFields[i]);
            mainPanel.add(new JLabel("Theory"));
            mainPanel.add(theoryMarksFields[i]);
            mainPanel.add(new JLabel("Practical"));
            mainPanel.add(practicalMarksFields[i]);
        }

        JButton calculateButton = new JButton("Calculate GPA");
        resultLabel = new JLabel();

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateGPA();
            }
        });

        mainPanel.add(calculateButton);
        mainPanel.add(resultLabel);

        add(mainPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void initializeFields() {
        creditFields = new JTextField[MAX_SUBJECTS];
        theoryMarksFields = new JTextField[MAX_SUBJECTS];
        practicalMarksFields = new JTextField[MAX_SUBJECTS];

        for (int i = 0; i < MAX_SUBJECTS; i++) {
            creditFields[i] = new JTextField();
            theoryMarksFields[i] = new JTextField();
            practicalMarksFields[i] = new JTextField();
        }
    }

    private void calculateGPA() {
        double totalPointsTheory = 0;
        double totalPointsPractical = 0;
        int totalCreditHoursTheory = 0;
        int totalCreditHoursPractical = 0;

        for (int i = 0; i < MAX_SUBJECTS; i++) {
            int creditHours = Integer.parseInt(creditFields[i].getText());
            double theoryMarks = Double.parseDouble(theoryMarksFields[i].getText());
            double practicalMarks = Double.parseDouble(practicalMarksFields[i].getText());

            double theoryPoints = calculatePoints(theoryMarks);
            totalPointsTheory += theoryPoints * creditHours;
            totalCreditHoursTheory += creditHours;

            if (practicalMarks > 0) {
                double practicalPoints = calculatePoints(practicalMarks);
                totalPointsPractical += practicalPoints * creditHours;
                totalCreditHoursPractical += creditHours;
            }
        }

        double gpaTheory = (totalCreditHoursTheory > 0) ? totalPointsTheory / totalCreditHoursTheory : 0.0;
        double gpaPractical = (totalCreditHoursPractical > 0) ? totalPointsPractical / totalCreditHoursPractical : 0.0;
        double overallGPA = (gpaTheory + gpaPractical) / 2.0;

        resultLabel.setText("Overall GPA: " + overallGPA);
    }

    private double calculatePoints(double marks) {
        if (marks >= 93) return 4.0;
        else if (marks >= 87) return 3.67;
        else if (marks >= 82) return 3.33;
        else if (marks >= 77) return 3.0;
        else if (marks >= 72) return 2.67;
        else if (marks >= 68) return 2.3;
        else if (marks >= 64) return 2.0;
        else if (marks >= 60) return 1.67;
        else return 0.0;
    }

    public static void main(String[] args) {
        new Calculatorgpa();
    }
}
