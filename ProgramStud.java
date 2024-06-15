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

    public Student(int sid, String sname, double sgpa, int sage, String sgender, String sdateofbirth,
                   String sNationality, String sContactnum, String sAddress, String sFatherName) {
        this.sid = sid;
        this.sname = sname;
        this.sgpa = sgpa;
        this.sage = sage;
        this.sgender = sgender;
        this.sdateofbirth = sdateofbirth;
        this.sNationality = sNationality;
        this.sContactnum = sContactnum;
        this.sAddress = sAddress;
        this.sFatherName = sFatherName;
    }
	// Mutators Methods (Setter)
    public void setGPA(double sgpa) {
        this.sgpa = sgpa;
    }

    public void setAge(int sage) {
        this.sage = sage;
    }

    public void setGender(String sgender) {
        this.sgender = sgender;
    }

    public void setDateOfBirth(String sdateofbirth) {
        this.sdateofbirth = sdateofbirth;
    }

    public void setNationality(String sNationality) {
        this.sNationality = sNationality;
    }

    public void setContactNumber(String sContactnum) {
        this.sContactnum = sContactnum;
    }

    public void setAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public void setFatherName(String sFatherName) {
        this.sFatherName = sFatherName;
    }    
	// Accesser Methods (Gettter)
    public double getGPA() {
        return this.sgpa;
    }

    public int getAge() {
        return this.sage;
    }

    public String getGender() {
        return this.sgender;
    }

    public String getDateOfBirth() {
        return this.sdateofbirth;
    }

    public String getNationality() {
        return this.sNationality;
    }

    public String getContactNumber() {
        return this.sContactnum;
    }

    public String getAddress() {
        return this.sAddress;
    }

    public String getFatherName() {
        return this.sFatherName;
    }
	
      public double rewardPoint() {
        if (this.sgpa >= 3.5) {
            return this.sgpa + 0.2;
        } else {
            return this.sgpa;
        }
    }

    public void display() {
        System.out.println("Student ID: " + this.sid);
        System.out.println("Student Name: " + this.sname);
        System.out.println("Student GPA: " + this.sgpa);
        System.out.println("Student Age: " + this.sage);
        System.out.println("Student Gender: " + this.sgender);
        System.out.println("Date of Birth: " + this.sdateofbirth);
        System.out.println("Nationality: " + this.sNationality);
        System.out.println("Contact Number: " + this.sContactnum);
        System.out.println("Address: " + this.sAddress);
        System.out.println("Father's Name: " + this.sFatherName);
	System.out.println("GPA with Reward Points : " + rewardPoint());
    }
	
	
}

class ProgramStud {
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
