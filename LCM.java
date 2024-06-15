import java.util.Scanner;

public class LCM {
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number 1: ");
		int a= input.nextInt();
		
		System.out.print("Enter Number 2: ");
		int b= input.nextInt();

		System.out.print("Enter Number 3: ");
		int c= input.nextInt();

		for(int i= 1 ; ; i++)
		{
			if(i%a==0 && i%b==0 && i%c==0)
			{
				System.out.print("LCM is : " + i);
				break;
			}
			else
			{
				//nothing

			}
		}
	}
	
}