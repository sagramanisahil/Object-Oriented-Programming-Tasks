class Student {
    String name;
    int id;
    int year;

    public Student(String name, int id, int year) {
        this.name = name;
        this.id = id;
        this.year = year;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student Year: " + year);
    }
}

class BSStudent extends Student {
    double gpa;
    int award;

    public BSStudent(String name, int id, int year, double gpa, int award) {
        super(name, id, year);
        this.gpa = gpa;
        this.award = award;
    }

    public void Award() {
        System.out.println("---Student Award Information---");
        super.display();
        System.out.println("GPA: " + gpa);
        System.out.println("Award: " + award);
    }
}

class MSStudent extends BSStudent {
    String specialization;
    String publication;

    public MSStudent(String name, int id, int year, double gpa, int award, String specialization, String publication) {
        super(name, id, year, gpa, award);
        this.specialization = specialization;
        this.publication = publication;
    }

    public void Publication() {
        System.out.println("---Student Publication Information---");
        super.display();
        System.out.println("Specialization: " + specialization);
        System.out.println("Publication: " + publication);
    }
}

public class TestStudents{
    public static void main(String[] args) {
        BSStudent bsStudent = new BSStudent("John Doe", 1001, 2022, 3.8, 1);
        MSStudent msStudent = new MSStudent("Jane Smith", 1002, 2021, 3.9, 2, "Computer Science", "Research paper on AI");

        System.out.println("---BS Student Information---");
        bsStudent.display();
        bsStudent.Award();

        System.out.println();

        System.out.println("---MS Student Information---");
        msStudent.display();
        msStudent.Publication();
    }
}
