class Vehicle {
    private String color;
    private int model_num;
    private String company;

    public Vehicle(int model_num, String company, String color) {
        this.model_num = model_num;
        this.color = color;
        this.company = company;
    }

    public Vehicle(int model_num, String color) {
        this(model_num,null, color);
    }

    public String getCompany() {
        return company;
    }

    public int getModel_num() {
        return model_num;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Vehicle:\nModel Number : " +model_num + "\nCompany : " + company + "\nColor : " + color;
    }
}

 class Car extends Vehicle {
    private int engine_num;

    public Car(int model_num, String company, String color, int engine_num) {
        super(model_num, company, color);
        this.engine_num = engine_num;
    }

    public int getEngine_num() {
        return engine_num;
    }

    public String toString() {
        return "Car" + super.toString() + "\nEngine Number : " + engine_num;
    }
}

 class Bike extends Vehicle {
    private int No_of_wheels;

    public Bike(int model_num, String color, String company, int No_of_wheels) {
        super(model_num, company, color);
        this.No_of_wheels = No_of_wheels;
    }

    public int getNoOfWheels() {
        return No_of_wheels;
    }

    public String toString() {
        return "Bike" + super.toString() + "\nNumber of Wheels : " + No_of_wheels;
    }
}

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(2014, "Audi", "White");
        Vehicle v2 = new Vehicle(2016, "Black");
        Car c1 = new Car(2020, "Mercedes", "RED", 347392);
        Bike b1 = new Bike(2023, "Black", "Honda", 2);

        System.out.println(v1);

	System.out.println();

        System.out.println(v2);

	System.out.println();

        System.out.println(c1);

	System.out.println();

        System.out.println(b1);
    }
}
