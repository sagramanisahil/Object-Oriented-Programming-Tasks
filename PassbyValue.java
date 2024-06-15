class Rectangle {
 int length;
 int width;
 Rectangle(int length, int width) {
 this.length = length;
 this.width = width;
 }
}
public class PassbyValue {
 public static void main(String[] args) {
 Rectangle rect = new Rectangle(5, 4);
 System.out.println("Before modifying: Length = " + rect.length + ", Width = " + rect.width);
 modifyRectangle(rect.length,rect.width);
 System.out.println("After modifying: Length = " + rect.length + ", Width = " + rect.width);
 }
 public static void modifyRectangle(int length, int width) {
 length = 10;
 width = 8;
System.out.println("During modifying: Length = " + length + ", Width = " + width);
 }
}
