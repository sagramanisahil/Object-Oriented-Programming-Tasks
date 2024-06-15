import java.util.Arrays;

public class Array{

	private int[] items;

	public Array(int length){
		items = new int [length];
	}

	public void print(){
	for(int i=0; i < items.length; i++)
	{
		System.out.println(items[i]);
	}
}
public class Main{
	public static void main(String args[]){
		
	Array numbers = new Array(3);
	numbers.insert(5);
	numbers.insert(4);
	numbers.insert(3);
	//numbers[3]=4;
	//numbers[4]=1;
	System.out.println("Length of numbers is : " + numbers.length);
	//for(int i=0; i < numbers.length; i++)
	//{
		//System.out.println("Numbers are : " + numbers[i]);
		
	//}
		System.out.println(Arrays.toString(numbers));

		//System.out.println(print());

	}
}
}