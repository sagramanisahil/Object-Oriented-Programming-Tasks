import java.util.Scanner;

public class MostOccuredNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int sizeOfArray = input.nextInt();
    
        int array[] = new int[sizeOfArray];
        
        for(int i = 0; i < array.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        int[] count = new int[101];
       
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        
        int maxOccurrences = 0;
        int mostOccurredNumber = 0;
        
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxOccurrences) {
                maxOccurrences = count[i];
                mostOccurredNumber = i;
            }
        }
        
        System.out.println("Most occurred number: " + mostOccurredNumber + " (Occurred " + maxOccurrences + " times)");
    }
}
