interface Animal {
    void legs(int leg);
    void eat(String eat);
}

class Spider implements Animal {
    int l;
    String e;
    
    public void legs(int leg) {
        l = leg;
    }
    
    public void eat(String eat) {
        e = eat;
    }

    public void print() {
        System.out.println("Spider has " + l + " legs and eats " + e);
    }
}

class Caterpillar implements Animal {
    int l;
    String e;
    
    public void legs(int leg) {
        l = leg;
    }
    
    public void eat(String eat) {
        e = eat;
    }

    public void print() {
        System.out.println("Caterpillar has " + l + " legs and eats " + e);
    }
}

class Cat implements Animal {
    int l;
    String e;
    
    public void legs(int leg) {
        l = leg;
    }
    
    public void eat(String eat) {
        e = eat;
    }

    public void print() {
        System.out.println("Cat has " + l + " legs and eats " + e);
    }
}

class InterfaceTest {
    public static void main(String args[]){
        Spider s = new Spider();
        s.legs(8);
        s.eat("Insects");
        System.out.print("Details : ");
        s.print();

        Caterpillar c = new Caterpillar();
        c.legs(3);
        c.eat("Food");
        System.out.print("Details : ");
        c.print();

        Cat ca = new Cat();
        ca.legs(4);
        ca.eat("Milk");
        System.out.print("Details : ");
        ca.print();
    }
}
