// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld(2) {
    public static void main(String[] args) {
        //     //54321
        //     //5432
        //     //543
        //     //54
        //     //5
        // for(int i=1; i<=5; i++)
        // {
        //     for(int j=5; j>i-1; j--)
        //     {
        //         System.out.print(j+ "");
        //     }
        //     System.out.println();
        // }
        
        /* arr1 = [2,3,4,3,2,4,4,2,2,3,4,6,7,8,9] // Duplicate numbers 
           arr2 = [2,3,4,3,2,2,3,4,6,7,8,9]
        */
        int[] arr1 = {2, 3, 4, 3, 2, 4, 4, 2, 2, 3, 4, 6, 7, 8, 9};

        System.out.print("Duplicate numbers: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i+1] == arr1[j]) {
                    System.out.print(arr1[j] + " ");
                    break;
                }
            }
        }
    }
}
