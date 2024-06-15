import java.util.Scanner;

class GCD
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter number : ");
		int b = sc.nextInt();
		
		System.out.println("Enter number : ");
		int c = sc.nextInt();
		
		for(int i = 2 ;  ;i++)
		{
			if(a%i == 0  && b%i == 0 && c%i == 0)
			{
				System.out.print("GCD of given numbers = "+ i);
				break;
			}
			else
			{
				//nothing
			}
		}
		
		
		
	}
	
}
