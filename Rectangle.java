import java.util.Scanner;
import javax.swing.JOptionPane;

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width using Scanner: ");
        double widthScanner = scanner.nextDouble();

        System.out.print("Enter height using Scanner: ");
        double heightScanner = scanner.nextDouble();

        Rectangle rectangleScanner = new Rectangle(widthScanner, heightScanner);

        String widthInput = JOptionPane.showInputDialog("Enter width using JOptionPane:");
        double widthJOptionPane = Double.parseDouble(widthInput);

        String heightInput = JOptionPane.showInputDialog("Enter height using JOptionPane:");
        double heightJOptionPane = Double.parseDouble(heightInput);

        Rectangle rectangleJOptionPane = new Rectangle(widthJOptionPane, heightJOptionPane);

        System.out.println("Using Scanner:");
        System.out.println("Area: " + rectangleScanner.calculateArea());
        System.out.println("Perimeter: " + rectangleScanner.calculatePerimeter());

        System.out.println("\nUsing JOptionPane:");
        System.out.println("Area: " + rectangleJOptionPane.calculateArea());
        System.out.println("Perimeter: " + rectangleJOptionPane.calculatePerimeter());

    }
}
