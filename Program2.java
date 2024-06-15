import java.util.Random;
import java.util.Scanner;

class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int rolls = 0;

        System.out.println("Welcome to the Dice Game!");

        do {
            int randomNumber = random.nextInt(6) + 1;

            System.out.println("You rolled a: " + randomNumber);

            totalScore += randomNumber;

            rolls++;

            System.out.print("Do you want to roll again? (Y/N): ");

            char userChoice = scanner.next().charAt(0);

            if (userChoice != 'Y' && userChoice != 'y') {
                break;
            }

        } while (true);
        System.out.println("Your total score is: " + totalScore);
        System.out.println("Dice rolled : "+ rolls +" Times ");
    }
}

