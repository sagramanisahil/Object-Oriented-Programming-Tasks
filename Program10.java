class Vehicle {
    String brand;
    String model;
    String color;
    int size;

    public Vehicle(String brand, String model, String color, int size) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
        System.out.println("The Color of " + model + " and " + brand + " is now " + newColor + ".");
    }

    public void changeSize(int newSize) {
        this.size = newSize;
        System.out.println("The Size of " + model + " and " + brand + " is now " + newSize + ".");
    }
}

class Program10 {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Audi", "2023", "Blue", 10);
        Vehicle vehicle2 = new Vehicle("Range Rover", "2021", "White", 5);
        Vehicle vehicle3 = new Vehicle("Mercedes", "2024", "Black", 15);

        vehicle1.changeColor("White");
        vehicle2.changeColor("Blue");
        vehicle3.changeColor("Black");

        vehicle1.changeSize(20);
        vehicle2.changeSize(12);
        vehicle3.changeSize(25);
    }
}
