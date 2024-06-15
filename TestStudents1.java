class Student {
    private String name;
    private int id;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public Student(int id, double gpa) {
        this(id, "", gpa);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGPA() {
        return gpa;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String toString() {
        return "Student:\nID: " + id + "\nName: " + name + "\nGPA: " + gpa;
    }
}

class Undergrad extends Student {
    private String year;

    public Undergrad(int id, String name, double gpa, String year) {
        super(id, name, gpa);
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String newYear) {
        this.year = newYear;
    }

    public String toString() {
        return "Undergraduate " + super.toString() + "\nYear: " + year;
    }
}

class Graduate extends Student {
    private String thesisTitle;

    public Graduate(int id, String name, double gpa, String thesisTitle) {
        super(id, name, gpa);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String newThesisTitle) {
        this.thesisTitle = newThesisTitle;
    }

    public String toString() {
        return "Graduate " + super.toString() + "\nThesis: " + thesisTitle;
    }
}

public class TestStudents1 {
    public static void main(String[] args) {
        Student s1 = new Student(123456, "Aariz", 3.27);
        Student s2 = new Student(234567, 3.22);
        Undergrad u1 = new Undergrad(345678, "Asad", 2.73, "Junior");
        Graduate g1 = new Graduate(456789, "Ahmed", 3.67, "Algorithms and Complexity");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(u1);
        System.out.println(g1);
    }
}
