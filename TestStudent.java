class University {
    String name;
    int rank;

    public University(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    void displayDetails() {
        System.out.println("University Name is : " + name);
        System.out.println("University Rank : " + rank);
    }
}

class Department extends University {
    String field_specialization;
    String field_type;
    String dept_head;

    public Department(String name, int rank, String field_specialization, String field_type, String dept_head) {
        super(name, rank);

        this.field_specialization = field_specialization;
        this.field_type = field_type;
        this.dept_head = dept_head;
    }

    public void departmentDetails() {
        System.out.println("University Name: " + name);
        System.out.println("University Rank: " + rank);
        System.out.println("Field Specialization is: " + field_specialization);
        System.out.println("Field Type is: " + field_type);
        System.out.println("Department Head is: " + dept_head);
    }
}

class Library extends University {
    int no_books;
    String type_books;

    public Library(String name, int rank, int no_books, String type_books) {
        super(name, rank);

        this.no_books = no_books;
        this.type_books = type_books;
    }

    public void libraryDetails() {
        System.out.println("University Name: " + name);
        System.out.println("University Rank: " + rank);
        System.out.println("No of Books: " + no_books);
        System.out.println("Type of Books: " + type_books);
    }
}

public class Main {
    public static void main(String[] args) {
     
        Department department1 = new Department("Department of Computer Science", 1, "Computer Science", "Engineering", "Sukkur IBA");
        Department department2 = new Department("Department of Physics", 2, "Physics", "Science", "Sukkur IBA");

        department1.departmentDetails();
        System.out.println();
        department2.departmentDetails();
        System.out.println();

        Library library1 = new Library("University Library", 1, 10000, "Science and Technology");
        Library library2 = new Library("Central Library", 2, 8000, "Arts and Humanities");

        library1.libraryDetails();
        System.out.println();
        library2.libraryDetails();
    }
}
