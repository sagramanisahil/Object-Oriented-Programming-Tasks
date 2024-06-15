public class Recursion {
	
	public static String ReverseString(String str){
		String reversed = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			reversed += str.charAt(i);
		}
		return reversed;
	}
	
	public static void main(String args[]){
		String original= "Sahil Kumar";
		System.out.println("Original string is : "+ original);
		
		String reversedstring= ReverseString(original);
		System.out.println("Reversed string is : "+ reversedstring);	
	
		
		}
}
