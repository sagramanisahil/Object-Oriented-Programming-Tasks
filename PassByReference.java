class Rectangle {
 int length;
 int width;
 Rectangle(int length, int width) {
 this.length = length;
 this.width = width;
 }
}

public class PassByReference {
 public static void main(String[] args) {
 Rectangle rect = new Rectangle(5, 4);
 System.out.println("Before modifying: Length = " + rect.length + ", Width = " + rect.width);
 modifyRectangle(rect);
 System.out.println("After modifying: Length = " + rect.length + ", Width = " + rect.width);
 }
 public static void modifyRectangle(Rectangle r) {
 r.length = 10;
 r.width = 8;
System.out.println("After modifying: Length = " + r.length + ", Width = " + r.width);
 }
}