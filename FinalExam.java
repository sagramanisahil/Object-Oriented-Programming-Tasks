abstract class Flight {
    protected String flightNumber;
    protected String destination;
    protected double price;

    protected Flight(String flightNumber, String destination, double price) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.price = price;
    }

    abstract void displayDetails();
}

class InternationalFlight extends Flight {
    String airline;

    public InternationalFlight(String flightNumber, String destination, double price, String airline) {
        super(flightNumber, destination, price);
        this.airline = airline;
    }

    void displayDetails() {
        System.out.println("Flight Number is : " + flightNumber);
        System.out.println("Destination is : " + destination);
        System.out.println("Price is : " + price);
        System.out.println("Airline is : " + airline);
    }

    boolean isExpensiveFlight() {
        return price > 1000;
    }
}

class TestFlight {
    public static void main(String[] args) {
        InternationalFlight f = new InternationalFlight("345", "USA", 500.5, "American Airline");
        
        f.displayDetails();
        System.out.println("Is Expensive Flight : " + f.isExpensiveFlight());
    }
}
