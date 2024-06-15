/*abstract class Animal {
	abstract void Sound();
}

class Lion extends Animal{

	public void Sound()
	{
		System.out.println("waaa-ah");
	}
}

class Tiger extends Animal {
	public void Sound()
	{
		System.out.println("Aahahah-whaow");
	}
}

class AbstractPractice {
	public static void main(String args[]){
		Lion l = new Lion();
		l.Sound();
	
		Tiger t = new Tiger();
		t.Sound();
		
	}
}
*/


/*abstract class Shape {
	 abstract double calculateArea();
	 abstract double calculatePerimeter();
}

class Circle extends Shape {
	private double radius;

	public Circle(double radius)
	{
		this.radius = radius;
	}

	double calculateArea()
	{
		return Math.PI*radius*radius;
	}

	double calculatePerimeter()
	{
		return 2*Math.PI*radius;
	}
	
	public void printdetails()
	{
		System.out.print("Area of Circle is : " + calculateArea());
		System.out.print("Perimeter of Circle is : " + calculatePerimeter());
	}
}

class Triangle extends Shape {
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double calculateArea()
	{
		double s = (a+b+c)/2;
		return Math.sqrt (s*(s-a)*(s-b)*(s-c));
	}

	public double calculatePerimeter()
	{
		return a+b+c;
	}
	
	public void printdetails()
	{
		System.out.print("Area of Circle is : " + calculateArea());
		System.out.print("Perimeter of Circle is : " + calculatePerimeter());
	}
}

class AbstractPractice{
	public static void main(String args[]){
		Circle c = new Circle(5.0);
		System.out.println("Area of Circle is : " + c.calculateArea());
		System.out.println("Perimeter of Circle is : " + c.calculatePerimeter());
	
		Triangle t = new Triangle(4.3, 5.4, 8.5);
		System.out.println("Area of Triangle is : " + t.calculateArea());
		System.out.println("Perimeter of Triangle is : " + t.calculatePerimeter());

	}
}
*/





















	