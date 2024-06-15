import java.util.Scanner;
class Practice1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = input.nextInt();

        int[][] originalArray = new int[row][column];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                originalArray[i][j] = input.nextInt();
            }
        }
        System.out.println("Original Array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(originalArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Average of each row:");
        for (int i = 0; i < row; i++) {
            int rowSum = 0;
            for (int j = 0; j < column; j++) {
                rowSum += originalArray[i][j];
            }
            double rowAverage = (double) rowSum / column;
            System.out.println("Row " + (i + 1) + ": " + rowAverage);
        }

    }
}
