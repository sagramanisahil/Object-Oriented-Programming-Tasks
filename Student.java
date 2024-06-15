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

class Program {
    public static void main(String args[]) {
        Student s1, s2;
        s1 = new Student();
        s2 = new Student();

        s1.sid = 1234;
        s1.sname = "Sahil Kumar";
        s1.setSgpa(3.5);
        s1.setSage(20);
        s1.setSgender("Male");
        s1.setSdateofbirth("2004-05-27");
        s1.setSNationality("Pakistan");
        s1.setSContactnum("03457353773");
        s1.setSAddress("Mithi, Tharpakar");
        s1.setSFatherName("Dileep Kumar");

        s2.sid = 3567;
        s2.sname = "Raja Danish";
        s2.setSgpa(3.2);
        s2.setSage(22);
        s2.setSgender("Male");
        s2.setSdateofbirth("2002-01-18");
        s2.setSNationality("America");
        s2.setSContactnum("03467483693");
        s2.setSAddress("Mithi, Tharparkar");
        s2.setSFatherName("Dileep Kumar");

        System.out.println("Student 1:");
        s1.display();
        System.out.println("\n");

        System.out.println("Student 2:");
        s2.display();
    }
}
