class SuperClass {
    String name;

    public SuperClass(String name) {
        this.name = name;
    }

    public String getInfo() {
        return name;
    }
}

public class SubClass extends SuperClass {
    String subName;

    public SubClass(String name, String subName) {
        super(name);
        this.subName = subName;
    }

    public String getInfo() {
        return subName;
    }
}

public class TestSuper {
    public static void main(String[] args) {

        SuperClass superClassObj = new SuperClass("Sahil Kumar in Super Class");
        SubClass subClassObj = new SubClass("Sahil Kumar in Super Class", "Raja Danish in sub Class");

        System.out.println("Info from SuperClass: " + superClassObj.getInfo());
        System.out.println("Info from SubClass: " + subClassObj.getInfo());
    }
}


