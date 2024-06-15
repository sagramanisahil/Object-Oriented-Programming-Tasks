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
		System.out.println("Display in A : with value a : " + a);
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
	
	void display()
	{
		System.out.println("Display in B : with value b : " + b);
	}
	


}

class C extends A
{

	int c;
	
	C()
	{
		System.out.println("C constructor called : ");
		c  = 30;
	}
	
	void display()
	{
		System.out.println("Display in C : with value c : " + c);
	}

}

class D extends B
{

		int d;
	
	D()
	{
		System.out.println("D constructor called : ");
		d = 40;
	}

	void display()
	{
		System.out.println("Display in D : with value d : " + d);
	}
	
}

class E extends D
{
	
		int e;
	E()
	{
		
		System.out.println("E constructor called : ");
		e = 50;
	}

	void display()
	{
		System.out.println("Display in E : with value e : " + e);
	}
	
}

class F extends C
{

		int f;
	
	F()
	{
		
		System.out.println("F constructor called : ");
		f = 60;
	}
	
	void display()
	{
		System.out.println("Display in F : with value f : " + f);
	}

}

class G extends C
{

		int g;
	
	G()
	{
		
		System.out.println("G constructor called : ");
		g = 70;
	}

	void display()
	{
		System.out.println("Display in G : with value g : " + g);
	}
	
}

public class Function_Overriding {
		public static void main(String args[]){
			
		A obja = new A();
		obja.display();

		System.out.println();
		
		B objb = new B();
		objb.display();
		
		System.out.println();
	
		C objc = new C();
		objc.display();

		System.out.println();

		D objd = new D();
		objd.display();
		
		System.out.println();

		E obje = new E();
		obje.display();
	
		System.out.println();

		F objf = new F();
		objf.display();
		
		System.out.println();

		G objg = new G();
		objg.display();
	}

}