class Person {
    private int nic;
    private String name;
    private String gender;

    public Person() {
        nic = 2812;
        name = "Pardeep";
        gender = "Male";
    }

    public int getNic() {
        return nic;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void display() {
        System.out.println("NIC is : " + nic);
        System.out.println("Name is : " + name);
        System.out.println("Gender is : " + gender);
    }
}

class Student extends Person {
    private int sid;
    private String sdept;

    public Student() {
        super();
        sid = 111;
        sdept = "CS";
    }

    public int getSid() {
        return sid;
    }

    public String getSdept() {
        return sdept;
    }

    public void display() {
        System.out.println("Student ID : " + sid);
        System.out.println("Student Dept : " + sdept);
        System.out.println("Student Gender is : " + getGender()); 
	}
}

class Teacher extends Person {
    private int tid;
    private String tdept;
    private String tdesig;

    public Teacher() {
        super();
        tid = 11111;
        tdept = "CS";
        tdesig = "AP";
    }

    public int getTid() {
        return tid;
    }

    public String getTdept() {
        return tdept;
    }

    public String getTdesig() {
        return tdesig;
    }

    public void display() {
        System.out.println("Teacher ID : " + tid);
        System.out.println("Teacher Dept : " + tdept);
        System.out.println("Teacher Gender is : " + getGender());
        System.out.println("Teacher Designation: " + tdesig);
    }
}

public class inheritance_Program2 {
    public static void main(String args[]) {
        Person p1 = new Person();
        p1.display();
        System.out.println();

        Student s1 = new Student();
        s1.display();
        System.out.println();

        Teacher t1 = new Teacher();
        t1.display();
    }
}
