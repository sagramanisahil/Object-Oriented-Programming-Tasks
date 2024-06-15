import java.util.Scanner;

class Student {
    int sid;
    String sname;
    private double sgpa;
    private int sage;
    private String sgender;
    private String sdateofbirth;
    private String sNationality;
    private String sContactnum;
    private String sAddress;
    private String sFatherName;

    public Student(int id, String name, double gpa, int age, String gender, String dob,
                   String nationality, String contactNum, String address, String fatherName) {
        sid = id;
        sname = name;
        sgpa = gpa;
        sage = age;
        sgender = gender;
        sdateofbirth = dob;
        sNationality = nationality;
        sContactnum = contactNum;
        sAddress = address;
        sFatherName = fatherName;
    }
    public void display() {
        System.out.println("Student ID: " + sid);
        System.out.println("Student Name: " + sname);
        System.out.println("Student GPA: " + sgpa);
        System.out.println("Student Age: " + sage);
        System.out.println("Student Gender: " + sgender);
        System.out.println("Date of Birth: " + sdateofbirth);
        System.out.println("Nationality: " + sNationality);
        System.out.println("Contact Number: " + sContactnum);
        System.out.println("Address: " + sAddress);
        System.out.println("Father's Name: " + sFatherName);
    }
}

class ProgramStu {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student 1 ID: ");
        int id1 = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter Student 1 Name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter Student 1 GPA: ");
        double gpa1 = scanner.nextDouble();

        System.out.print("Enter Student 1 Age: ");
        int age1 = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter Student 1 Gender: ");
        String gender1 = scanner.nextLine();

        System.out.print("Enter Student 1 Date of Birth (YYYY-MM-DD): ");
        String dob1 = scanner.nextLine();

        System.out.print("Enter Student 1 Nationality: ");
        String nationality1 = scanner.nextLine();

        System.out.print("Enter Student 1 Contact Number: ");
        String contactNum1 = scanner.nextLine();

        System.out.print("Enter Student 1 Address: ");
        String address1 = scanner.nextLine();

        System.out.print("Enter Student 1 Father's Name: ");
        String fatherName1 = scanner.nextLine();

        Student s1 = new Student(id1, name1, gpa1, age1, gender1, dob1, nationality1, contactNum1, address1, fatherName1);

        System.out.println();

        System.out.print("Enter Student 2 ID: ");
        int id2 = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter Student 2 Name: ");
        String name2 = scanner.nextLine();

        System.out.print("Enter Student 2 GPA: ");
        double gpa2 = scanner.nextDouble();

        System.out.print("Enter Student 2 Age: ");
        int age2 = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter Student 2 Gender: ");
        String gender2 = scanner.nextLine();

        System.out.print("Enter Student 2 Date of Birth (YYYY-MM-DD): ");
        String dob2 = scanner.nextLine();

        System.out.print("Enter Student 2 Nationality: ");
        String nationality2 = scanner.nextLine();

        System.out.print("Enter Student 2 Contact Number: ");
        String contactNum2 = scanner.nextLine();

        System.out.print("Enter Student 2 Address: ");
        String address2 = scanner.nextLine();

        System.out.print("Enter Student 2 Father's Name: ");
        String fatherName2 = scanner.nextLine();

        Student s2 = new Student(id2, name2, gpa2, age2, gender2, dob2, nationality2, contactNum2, address2, fatherName2);

        System.out.println();

        System.out.println("Student 1:");
        s1.display();

        System.out.println();

        System.out.println("Student 2:");
        s2.display();
    }
}
