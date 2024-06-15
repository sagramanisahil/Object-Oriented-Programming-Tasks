public class ArrayPBR {
public static void modifyArray(int[] arr) {
arr[0] = 10;
}
public static void main(String[] args) {
int[] numbers = {1, 2, 3};
modifyArray(numbers);
System.out.println(numbers[0]); // Output: 10
}
}
