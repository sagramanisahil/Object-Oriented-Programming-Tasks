import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class StudentCrud {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/StudentCrud";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "kumarsahil@04";

    private Connection connection;
    private JFrame frame;
    private JTextField idField, nameField, phoneField, semesterField, cgpaField;
    private JTable table;
    private DefaultTableModel tableModel;

    public static void main(String[] args) {
        new StudentCrud();
    }

    public StudentCrud() {
        connectToDB();
        createUI();
    }

    private void connectToDB() {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to connect to database", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void createUI() {
        frame = new JFrame("Student Management System");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(20, 20, 80, 25);
        frame.add(idLabel);

        idField = new JTextField();
        idField.setBounds(100, 20, 160, 25);
        frame.add(idField);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 60, 80, 25);
        frame.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(100, 60, 160, 25);
        frame.add(nameField);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(20, 100, 80, 25);
        frame.add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(100, 100, 160, 25);
        frame.add(phoneField);

        JLabel semesterLabel = new JLabel("Semester:");
        semesterLabel.setBounds(20, 140, 80, 25);
        frame.add(semesterLabel);

        semesterField = new JTextField();
        semesterField.setBounds(100, 140, 160, 25);
        frame.add(semesterField);

        JLabel cgpaLabel = new JLabel("CGPA:");
        cgpaLabel.setBounds(20, 180, 80, 25);
        frame.add(cgpaLabel);

        cgpaField = new JTextField();
        cgpaField.setBounds(100, 180, 160, 25);
        frame.add(cgpaField);

        JButton addButton = new JButton("Add");
        addButton.setBounds(20, 220, 80, 25);
        frame.add(addButton);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        JButton updateButton = new JButton("Update");
        updateButton.setBounds(110, 220, 80, 25);
        frame.add(updateButton);
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateStudent();
            }
        });

        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(200, 220, 80, 25);
        frame.add(deleteButton);
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteStudent();
            }
        });

        JButton fetchButton = new JButton("Fetch");
        fetchButton.setBounds(290, 220, 80, 25);
        frame.add(fetchButton);
        fetchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fetchStudents();
            }
        });

        tableModel = new DefaultTableModel(new Object[]{"ID", "Name", "Phone", "Semester", "CGPA"}, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 260, 750, 300);
        frame.add(scrollPane);

        frame.setVisible(true);
    }

    private void addStudent() {
        try {
            String name = nameField.getText();
            String phone = phoneField.getText();
            String semesterText = semesterField.getText();
            String cgpaText = cgpaField.getText();

            // Input validation
            if (name.isEmpty() || phone.isEmpty() || semesterText.isEmpty() || cgpaText.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int semester;
            float cgpa;

            try {
                semester = Integer.parseInt(semesterText);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "Invalid semester. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                cgpa = Float.parseFloat(cgpaText);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "Invalid CGPA. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String query = "INSERT INTO students (name, phone, semester, cgpa) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setString(2, phone);
            stmt.setInt(3, semester);
            stmt.setFloat(4, cgpa);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(frame, "Student added successfully!");
            clearFields();
            fetchStudents();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Failed to add student", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateStudent() {
        try {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            String phone = phoneField.getText();
            int semester = Integer.parseInt(semesterField.getText());
            float cgpa = Float.parseFloat(cgpaField.getText());

            String query = "UPDATE students SET name = ?, phone = ?, semester = ?, cgpa = ? WHERE id = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setString(2, phone);
            stmt.setInt(3, semester);
            stmt.setFloat(4, cgpa);
            stmt.setInt(5, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(frame, "Student updated successfully!");
            clearFields();
            fetchStudents();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Failed to update student", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteStudent() {
        try {
            int id = Integer.parseInt(idField.getText());

            String query = "DELETE FROM students WHERE id = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(frame, "Student deleted successfully!");
            clearFields();
            fetchStudents();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Failed to delete student", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void fetchStudents() {
        try {
            tableModel.setRowCount(0); // Clear existing rows
            String query = "SELECT * FROM students";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                int semester = rs.getInt("semester");
                float cgpa = rs.getFloat("cgpa");

                tableModel.addRow(new Object[]{id, name, phone, semester, cgpa});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Failed to fetch students", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        idField.setText("");
        nameField.setText("");
        phoneField.setText("");
        semesterField.setText("");
        cgpaField.setText("");
    }
}
