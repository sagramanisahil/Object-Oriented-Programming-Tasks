public class University {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }
        
        try {
            int[] array = {1, 2, 3};
            int value = array[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
        
        try {
            String str = "Hello";
            char character = str.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException occurred: " + e.getMessage());
        }
        
        try {
            Object[] objectArray = new String[3];
            objectArray[0] = Integer.valueOf(10); 
        } catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException occurred: " + e.getMessage());
        }
    }
}
