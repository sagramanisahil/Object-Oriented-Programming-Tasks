class Person {
    int pid;
    String pname;
    double psalary;

    public Person() {
        this.pid = 7392;
        this.pname = "Sahil";
        this.psalary = 50000;
    }

    public Person(int pid, String pname, double psalary) {
        this.pid = pid;
        this.pname = pname;
        this.psalary = psalary;
    }

    public Person(Person otherP) {
        this.pid = otherP.pid;
        this.pname = otherP.pname;
        this.psalary = otherP.psalary;
    }

    public void display() {
        System.out.println("Person ID: " + pid);
        System.out.println("Person Name: " + pname);
        System.out.println("Person Salary: " + psalary);
    }

    public static void main(String[] args) {

        Person p1 = new Person();

        System.out.println("Default Constructor:");
        p1.display();

        Person parameter = new Person(1, "Danish", 23);

        System.out.println("\nParameterized Constructor:");
        parameter.display();

        Person Copy = new Person(parameter);

        System.out.println("\nCopy Constructor:");
        Copy.display();
    }
}
