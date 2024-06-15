interface Employee {
    void details(String name, double salary, int age);
}

interface Officer {
    void basicInfo(String name, double salary, int age);
}

class PersonEmployee implements Employee {
    String name;
    double salary;
    int age;

    public void details(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println("Name is : " + name);
        System.out.println("Salary is : " + salary);
        System.out.println("Age is : " + age);
    }
}

class PersonOfficer implements Officer {
    String name;
    double salary;
    int age;

    public void basicInfo(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println("Name is : " + name);
        System.out.println("Salary is : " + salary);
        System.out.println("Age is : " + age);
    }
}

class MultipleInterface {
    public static void main(String args[]) {
        PersonEmployee p1 = new PersonEmployee();
        p1.details("Sahil", 100000, 19);
        p1.print();

        System.out.println();

        PersonOfficer p2 = new PersonOfficer();
        p2.basicInfo("Danish", 50000, 23);
        p2.print();
    }
}
