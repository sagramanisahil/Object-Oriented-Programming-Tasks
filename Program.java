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

    public void setSgpa(double gpa) {
        sgpa = gpa;
    }

    public double getSgpa() {
        return sgpa;
    }

    public void setSage(int age) {
        sage = age;
    }

    public int getSage() {
        return sage;
    }

    public void setSgender(String gender) {
        sgender = gender;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSdateofbirth(String dob) {
        sdateofbirth = dob;
    }

    public String getSdateofbirth() {
        return sdateofbirth;
    }

    public void setSNationality(String nationality) {
        sNationality = nationality;
    }

    public String getSNationality() {
        return sNationality;
    }

    public void setSContactnum(String contactNum) {
        sContactnum = contactNum;
    }

    public String getSContactnum() {
        return sContactnum;
    }

    public void setSAddress(String address) {
        sAddress = address;
    }

    public String getSAddress() {
        return sAddress;
    }

    public void setSFatherName(String fatherName) {
        sFatherName = fatherName;
    }

    public String getSFatherName() {
        return sFatherName;
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

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        Student s1 = new Student();

        System.out.print("Enter Student 1 ID: ");
        s1.sid = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter Student 1 Name: ");
        s1.sname = scanner.nextLine();

        System.out.print("Enter Student 1 GPA: ");
        s1.setSgpa(scanner.nextDouble());

        System.out.print("Enter Student 1 Age: ");
        s1.setSage(scanner.nextInt());

        scanner.nextLine();
        System.out.print("Enter Student 1 Gender: ");
        s1.setSgender(scanner.nextLine());

        System.out.print("Enter Student 1 Date of Birth (YYYY-MM-DD): ");
        s1.setSdateofbirth(scanner.nextLine());

        System.out.print("Enter Student 1 Nationality: ");
        s1.setSNationality(scanner.nextLine());

        System.out.print("Enter Student 1 Contact Number: ");
        s1.setSContactnum(scanner.nextLine());

        System.out.print("Enter Student 1 Address: ");
        s1.setSAddress(scanner.nextLine());

        System.out.print("Enter Student 1 Father's Name: ");
        s1.setSFatherName(scanner.nextLine());

        System.out.println();

        Student s2 = new Student();

        System.out.print("Enter Student 2 ID: ");
        s2.sid = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter Student 2 Name: ");
        s2.sname = scanner.nextLine();

        System.out.print("Enter Student 2 GPA: ");
        s2.setSgpa(scanner.nextDouble());

        System.out.print("Enter Student 2 Age: ");
        s2.setSage(scanner.nextInt());

        scanner.nextLine();
        System.out.print("Enter Student 2 Gender: ");
        s2.setSgender(scanner.nextLine());

        System.out.print("Enter Student 2 Date of Birth (YYYY-MM-DD): ");
        s2.setSdateofbirth(scanner.nextLine());

        System.out.print("Enter Student 2 Nationality: ");
        s2.setSNationality(scanner.nextLine());

        System.out.print("Enter Student 2 Contact Number: ");
        s2.setSContactnum(scanner.nextLine());

        System.out.print("Enter Student 2 Address: ");
        s2.setSAddress(scanner.nextLine());

        System.out.print("Enter Student 2 Father's Name: ");
        s2.setSFatherName(scanner.nextLine());

        System.out.println();

        System.out.println("Student 1:");
        s1.display();
        System.out.println();

        System.out.println("Student 2:");
        s2.display();
    }
}
