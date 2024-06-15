import java.util.Scanner;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point p) {
        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }
}

class Shape {
    Point center;

    public Shape(Point center) {
        this.center = center;
    }

    boolean isPointInside(Point p) {
        return false;
    }
}

class Circle extends Shape {
    int radius;

    public Circle(Point center, int radius) {
        super(center);
        this.radius = radius;
    }

    public boolean isPointInside(Point p) {
        return center.distanceTo(p) <= radius;
    }

    public String toString() {
        return "Circle - Center: (" + center.x + ", " + center.y + "), Radius: " + radius;
    }
}

class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle(Point center, int length, int width) {
        super(center);
        this.length = length;
        this.width = width;
    }

    public boolean isPointInside(Point p) {
        int halfLength = length / 2;
        int halfWidth = width / 2;
        return Math.abs(p.x - center.x) <= halfLength && Math.abs(p.y - center.y) <= halfWidth;
    }

    public String toString() {
        return "Rectangle - Center: (" + center.x + ", " + center.y + "), Length: " + length + ", Width: " + width;
    }
}

class ShapesArray {
    Shape[] shapes;
    int count;

    public ShapesArray(int size) {
        shapes = new Shape[size];
        count = 0;
    }

    public void addShape(Shape shape) {
        shapes[count++] = shape;
    }

    public void displayRectsInfo() {
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                System.out.println(shape);
            }
        }
    }

    public int getCircleCounter() {
        int circleCount = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                circleCount++;
            }
        }
        return circleCount;
    }

    public double getAvgAreas() {
        double totalArea = 0;
        int totalShapes = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                totalArea += Math.PI * ((Circle) shape).radius * ((Circle) shape).radius;
            } else if (shape instanceof Rectangle) {
                totalArea += ((Rectangle) shape).length * ((Rectangle) shape).width;
            }
            totalShapes++;
        }
        return totalArea / totalShapes;
    }

    public void removeAllRect() {
        for (int i = 0; i < count; i++) {
            if (shapes[i] instanceof Rectangle) {
                shapes[i] = null;
            }
        }
        count = 0;
    }
}

public class TestShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapesArray shapesArray = new ShapesArray(20);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an option:");
            System.out.println("1. Add new shape");
            System.out.println("2. Display all rectangles");
            System.out.println("3. Display the average shapes area");
            System.out.println("4. Display the number of circles");
            System.out.println("5. Remove all rectangles");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Which shape do you want to add?");
                    System.out.println("a. Rectangle");
                    System.out.println("b. Circle");
                    char shapeChoice = scanner.next().charAt(0);
                    switch (shapeChoice) {
                        case 'a':
                            System.out.println("Enter center coordinates (x y):");
                            int xRect = scanner.nextInt();
                            int yRect = scanner.nextInt();
                            System.out.println("Enter length and width:");
                            int length = scanner.nextInt();
                            int width = scanner.nextInt();
                            shapesArray.addShape(new Rectangle(new Point(xRect, yRect), length, width));
                            break;
                        case 'b':
                            System.out.println("Enter center coordinates (x y):");
                            int xCircle = scanner.nextInt();
                            int yCircle = scanner.nextInt();
                            System.out.println("Enter radius:");
                            int radius = scanner.nextInt();
                            shapesArray.addShape(new Circle(new Point(xCircle, yCircle), radius));
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                case 2:
                    System.out.println("Displaying all rectangles:");
                    shapesArray.displayRectsInfo();
                    break;
                case 3:
                    System.out.println("Average shapes area: " + shapesArray.getAvgAreas());
                    break;
                case 4:
                    System.out.println("Number of circles: " + shapesArray.getCircleCounter());
                    break;
                case 5:
                    shapesArray.removeAllRect();
                    System.out.println("All rectangles removed.");
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
