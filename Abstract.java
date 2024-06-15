abstract class Shape {
    abstract void RectangleArea(int length, int breadth);
    abstract void SquareArea(int side);
    abstract void CircleArea(double radius);
}

class Area extends Shape {
    public void RectangleArea(int length, int breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void SquareArea(int side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public void CircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class Abstract{
    public static void main(String[] args) {
        Area area = new Area();

        area.RectangleArea(5, 10);

        area.SquareArea(6);

        area.CircleArea(3);
    }
}
