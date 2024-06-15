import java.util.Scanner;

class Value {

public void Test()
{
	System.out.println("No Parameters");
}
public void Test(int a)
{
	a=10;
	System.out.println("Value of a is : " + a);
}

public void Test(double a, double b)
{
	System.out.println("Value of a and b : " + a + " "+ b );
}

public double Test(double a)
{
	System.out.println("Double a : " + a);
	return a*a;
}

}

public class OverloadMethod{
	public static void main(String args[]){
	Value v = new Value();
	v.Test();
	
	v.Test(6);
		
	v.Test(4.3, 6.5);
	
	double result = v.Test(4.5);

	System.out.print("Multiplication of double a is : " + result);
		
	}
}