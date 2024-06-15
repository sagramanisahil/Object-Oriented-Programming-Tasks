class Animal {
    String name;
    int age;
    String gender;

    Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void ProduceSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    void ProduceSound() {
        System.out.println("Bow wow");
    }
}

class Frog extends Animal {
    Frog(String name, int age, String gender) {
        super(name, age, gender);
    }

    void ProduceSound() {
        System.out.println("Ribbit");
    }
}

class Kitten extends Animal {
    Kitten(String name, int age) {
        super(name, age, "Female");
    }
}

class Tomcat extends Animal {
    Tomcat(String name, int age) {
        super(name, age, "Male");
    }
}

public class Override {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Buddy", 5, "Male"),
            new Frog("Kermit", 2, "Male"),
            new Kitten("Fluffy", 1),
            new Tomcat("Garfield", 3)
        };

        int dogCount = 0, frogCount = 0, kittenCount = 0, tomcatCount = 0;
        double dogAgeTotal = 0, frogAgeTotal = 0, kittenAgeTotal = 0, tomcatAgeTotal = 0;

        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.println("Bow wow");
                dogCount++;
                dogAgeTotal += animal.age;
            } else if (animal instanceof Frog) {
                System.out.println("Ribbit");
                frogCount++;
                frogAgeTotal += animal.age;
            } else if (animal instanceof Kitten) {
                kittenCount++;
                kittenAgeTotal += animal.age;
            } else if (animal instanceof Tomcat) {
                tomcatCount++;
                tomcatAgeTotal += animal.age;
            }
        }

        System.out.println("Average age of Dog: " + (dogCount != 0 ? dogAgeTotal / dogCount : 0));
        System.out.println("Average age of Frog: " + (frogCount != 0 ? frogAgeTotal / frogCount : 0));
        System.out.println("Average age of Kitten: " + (kittenCount != 0 ? kittenAgeTotal / kittenCount : 0));
        System.out.println("Average age of Tomcat: " + (tomcatCount != 0 ? tomcatAgeTotal / tomcatCount : 0));
    }
}
