public class ReplaceDuplicate {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 2, 7, 4, 9, 5};
        
        System.out.print("Original Array: ");
        printArray(array);
        
        replaceDuplicatesWithOne(array);
        
        System.out.print("Modified Array: ");
        printArray(array);
    }
    
    public static void replaceDuplicatesWithOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            boolean foundDuplicate = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == current) {
                    array[j] = 1;
                    foundDuplicate = true;
                }
            }
            if (foundDuplicate) {
                array[i] = 1;
            }
        }
    }
    
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
