class Student2 {
    String name;
    int age;
    String gender;
    String studentId;

    public Student2() {
        this.name = "Sahil";
        this.age = 20;
        this.gender = "Male";
        this.studentId = "3282";
    }

    public Student2(String name, int age, String gender, String studentId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.studentId = studentId;
    }

    public Student2(Student2 otherStudent) {
        this.name = otherStudent.name;
        this.age = otherStudent.age;
        this.gender = otherStudent.gender;
        this.studentId = otherStudent.studentId;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Student ID: " + studentId);
    }

    public static void main(String[] args) {

        Student2 studentDefault = new Student2();

        System.out.println("Default Constructor:");
        studentDefault.displayInfo();

        Student2 studentParam = new Student2("Danish", 23, "Male", "S12345");

        System.out.println("\nParameterized Constructor:");
        studentParam.displayInfo();

        Student2 studentCopy = new Student2(studentParam);

        System.out.println("\nCopy Constructor:");
        studentCopy.displayInfo();
    }
}
