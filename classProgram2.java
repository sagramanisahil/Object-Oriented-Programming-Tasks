class A 
{

	int a;
	
	A()
	{
		System.out.println("A constructor called : ");
		a  = 10;
	}

	void display()
	{
		System.out.println("Display in A : with value a : " +a);
	}


}

class B
{

	int b;
	
	B()
	{
		System.out.println("B constructor called : ");
		b  = 20;
	}

	void display()
	{
		System.out.println("Display in B : with value b : " +b);
	}


}

class C
{

	int c;
	
	C()
	{
		System.out.println("C constructor called : ");
		c  = 30;
	}

	void display()
	{
		System.out.println("Display in C : with value c : " +c);
	}


}

public class classProgram2
{

	public static void main(String args[])
	{
	
		C objc=new C();
		System.out.println(" Start of Main  : ");
		
		B objb = new B();
		objb.display();			

		
		A obja = new A();
		obja.display();

			
	}





}