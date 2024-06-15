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

    public void setSage(int age) {
        sage = age;
    }

    public void setSgender(String gender) {
        sgender = gender;
    }

    public void setSdateofbirth(String dob) {
        sdateofbirth = dob;
    }

    public void setSNationality(String nationality) {
        sNationality = nationality;
    }

    public void setSContactnum(String contactNum) {
        sContactnum = contactNum;
    }

    public void setSAddress(String address) {
        sAddress = address;
    }

    public void setSFatherName(String fatherName) {
        sFatherName = fatherName;
    }
	
    public double getSgpa() {
        return sgpa;
    }

    public int getSage() {
        return sage;
    }

    public String getSgender() {
        return sgender;
    }

    public String getSdateofbirth() {
        return sdateofbirth;
    }

    public String getSNationality() {
        return sNationality;
    }

    public String getSContactnum() {
        return sContactnum;
    }

    public String getSAddress() {
        return sAddress;
    }

    public String getSFatherName() {
        return sFatherName;
    }
	// Printing Records by General Display Method
    public void display() {
        System.out.println("Student ID: " + sid);
        System.out.println("Student Name: " + sname);
        System.out.println("Student GPA: " + getSgpa());
        System.out.println("Student Age: " + getSage());
        System.out.println("Student Gender: " + getSgender());
        System.out.println("Date of Birth: " + getSdateofbirth());
        System.out.println("Nationality: " + getSNationality());
        System.out.println("Contact Number: " + getSContactnum());
        System.out.println("Address: " + getSAddress());
        System.out.println("Father's Name: " + getSFatherName());
    }
}

class ProgramStu {
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
		// Printing Records by Getter Method
	System.out.println("Student ID is : "+s1.sid);
        System.out.println("Student Name is : "+s1.sname);
        System.out.println("Student GPA is : "+s1.getSgpa());
        System.out.println("Student Age is : "+s1.getSage());
        System.out.println("Student Gender is : "+s1.getSgender());
        System.out.println("Student Date of Birth is : "+s1.getSdateofbirth());
        System.out.println("Student Nationality is : "+s1.getSNationality());
        System.out.println("Student Contact Number is : "+s1.getSContactnum());
        System.out.println("Student Address is : "+s1.getSAddress());
        System.out.println("Student Father's Name is : "+s1.getSFatherName());
	
	System.out.println();

	System.out.println("Student ID is : "+s2.sid);
        System.out.println("Student Name is : "+s2.sname);
        System.out.println("Student GPA is : "+s2.getSgpa());
        System.out.println("Student Age is : "+s2.getSage());
        System.out.println("Student Gender is : "+s2.getSgender());
        System.out.println("Student Date of Birth is : "+s2.getSdateofbirth());
        System.out.println("Student Nationality is : "+s2.getSNationality());
        System.out.println("Student Contact Number is : "+s2.getSContactnum());
        System.out.println("Student Address is : "+s2.getSAddress());
        System.out.println("Student Father's Name is : "+s2.getSFatherName());

	System.out.println();
        System.out.println("Student 1:");
        s1.display();
	
        System.out.println();

        System.out.println("Student 2:");
        s2.display();
    }
}
