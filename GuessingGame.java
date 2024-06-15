import java.util.Scanner;

class GuessingGame
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a = 89;
		
		for(int i = 0 ; ; i++)
		{
			System.out.println("Enter Number between 1 to 100 : ");
			int b= sc.nextInt();
		
			if(a==b)
			{
				System.out.println("Congrats you Guessed the number");
				break;
			}
			else
			{
				System.out.println("Please Try Again");
			}
		}
		
	}
	
}
