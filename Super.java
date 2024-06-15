import java.util.Scanner;

class A {
	
	int a;
	String name;
	int id;

	public A()
	{
		a= 10;
		System.out.println("In Constructor A ");
	}

	void display()
	{
		System.out.println("The Value of A is :" + a);
	}

	void getData()
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Student Name : ");
		name= input.nextLine();
	
		System.out.print("Enter Student ID : ");
		id= input.nextInt();
	}

	void showData()
	{
		System.out.println("Name of Student is : " + name);
		System.out.println("ID of Student is : " + id);
	}
}

class B extends A {
	
	int b;

	public B()
	{
		b = 20;
		System.out.println("In Constructor B");
	}

	void display()
	{
		System.out.println("The Value of B is :" + b);
	}
	
	void getData()
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Student Name : ");
		name= input.nextLine();
	
		System.out.print("Enter Student ID : ");
		id= input.nextInt();
	}

	void showData()
	{
		System.out.println("Name of Student is : " + name);
		System.out.println("ID of Student is : " + id);
	}
}

class C extends B {
	
	int c;

	public C()
	{
		c = 30;
		System.out.println("In Constructor C ");
	}

	void display()
	{
		System.out.println("The Value of C is :" + c);
	}
	
	void getData()
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Student Name : ");
		name= input.nextLine();
	
		System.out.print("Enter Student ID : ");
		id= input.nextInt();
	}

	void showData()
	{
		System.out.println("Name of Student is : " + name);
		System.out.println("ID of Student is : " + id);
	}
}

public class Super {
	public static void main(String args[]){
		A a = new A();

		a.display();

		System.out.println();

		a.getData();

		System.out.println();

		a.showData();

		System.out.println();

		B b = new B();

		b.display();

		b.getData();

		b.showData();

		System.out.println();
		
		C c = new C();

		c.display();

		b.getData();

		b.showData();
		
	}
}

