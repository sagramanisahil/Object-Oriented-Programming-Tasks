class Vehicle {
    int x;
    int y;

    Vehicle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        System.out.println("Vehicles can move!!");
    }

   
    public void move(int y) {
        System.out.println("The value of y : " + y);
    }

 
    public void move(int x, int y) {
        System.out.println("The values of x and y : " + x + ", " + y);
    }
}

class MotorBike extends Vehicle {
    double a;

    MotorBike(double a) {
        super(0,0);
        this.a = a;
    }

    public void move() {
        System.out.println("MotorBike can move and accelerate too!!");
        System.out.println("MotorBike is too speedy");
    }

    public void move(int x) {
        System.out.println("The value of x : " + x);
    }

    public void move(double a) {
        System.out.println("The values of a : " + a);
    }
}

class Overload {
    public static void main(String[] args) {
        Vehicle vh = new MotorBike(0.0);
        vh.move();
        vh.move(4);
        ((MotorBike) vh).move(4.5);

        vh = new Vehicle(0, 0);
        vh.move();
        vh.move(4);
        vh.move(5, 6);
    }
}
