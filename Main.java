import java.util.Scanner;

public class Main {

    public static int cube(int a, int b) {
        return (a * a * a) + (b * b * b);
    }

    public static int square(int a, int b) {
        return (a * a) + (b * b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two digits:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int cubeResult = cube(num1, num2);
        System.out.println("Cube of " + num1 + " and " + num2 + " is: " + cubeResult);

        int squareResult = square(num1, num2);
        System.out.println("Square of " + num1 + " and " + num2 + " is: " + squareResult);

    }
}
