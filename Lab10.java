/*public class Lab10 {
    public static void main(String[] args) {
    
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        try {
            String str = "Hello";
            char ch = str.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }

        try {
            int[] arr = new int[3];
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Generic ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
import java.util.Scanner;

class UnknownOperatorException extends Exception {
    public UnknownOperatorException(String message) {
        super(message);
    }
}

public class Lab10{
    public static void main(String[] args) {
        double result = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator is on.");
        
        while (true) {
            System.out.println("result = " + result);
            String userInput = scanner.nextLine().toLowerCase();
            
            if (userInput.equals("r")) {
                System.out.println("Final result = " + result);
                System.out.print("Again? (y/n) ");
                String n = scanner.nextLine().toLowerCase();
                if (!n.equals("y")) {
                    System.out.println("End of Program");
                    break;
                } else {
                    result = 0.0;
                    System.out.println("result = 0.0");
                    continue;
                }
            }
            
            try {
                char operator = userInput.charAt(0);
                double operand = Double.parseDouble(userInput.substring(1).trim());
                switch (operator) {
                    case '+':
                        result += operand;
                        break;
                    case '-':
                        result -= operand;
                        break;
                    case '*':
                        result *= operand;
                        break;
                    case '/':
                        result /= operand;
                        break;
                    default:
                        throw new UnknownOperatorException(operator + " is an unknown operation.");
                }
                System.out.printf("result %c %.1f = %.1f%n", operator, operand, result);
                System.out.println("updated result = " + result);
            } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
                System.out.println("Invalid input. Please enter an operator followed by a number.");
            } catch (UnknownOperatorException e) {
                System.out.println(e.getMessage());
                System.out.println("Reenter, your last line:");
            }
        }
        
    }
}


import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.println("Enter two integers to divide:");
                int n1 = scan.nextInt();
                int n2 = scan.nextInt();
                
                double result = (double) n1 / n2;
                System.out.println("Result of division: " + result);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter valid integers.");
                scan.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero.");
            }
        }
        
    }
}
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();
                System.out.println("You entered: " + number);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer.");
                scanner.nextLine();
            }
        }
        
    }
}
