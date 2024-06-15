class A 
{

	int a;
	
	A()
	{
		System.out.println("A constructor called : ");
		a  = 10;
	}

	


}

class B extends A
{

	int b;
	
	B()
	{
		System.out.println("B constructor called : ");
		b  = 20;
	}
	
	
	


}

class C extends B
{

	int c;
	
	C()
	{
		System.out.println("C constructor called : ");
		c  = 30;
	}

	


}

public class classProgram7
{

	public static void main(String args[])
	{
	
		
		System.out.println(" Start of Main  : ");

		//B objb = new B();
		C objc = new C();
		objc.display();
		
			
	}





}