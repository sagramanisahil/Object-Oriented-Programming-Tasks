import java.util.Scanner;

public class StringChar {
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the String : ");
		String str= sc.nextLine();

		char[] ch = str.toCharArray(); 
		for(int i=3; i < str.length()-1; i++)
		{
			 ch[i]= ch[i+1];
		}
	
		for(int i=0; i < str.length()-1; i++)
		{
			 System.out.print(ch[i]);
		}
		
	}
}