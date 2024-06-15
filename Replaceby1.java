public class Replaceby1 {
	public static void main(String args[]){
		int a[]= {3,2,4,5,3,2,3,2,2,5};
		int b, count;
	for(int i=0; i < 10; i++)
	{
		b= a[i];
		count=0;
		for(int j= i+1 ; j < 10; j++){
			if(a[j] == b){
				count++;
			}
			else
			{
				//nothing
			}
		}
	
		if(count>=1)
		{
			for(int k=0; k < 10; k++){
				if(a[k] == b)
				{
					a[k]=1;
				}
		}
	}
}

	for(int m=0; m<10; m++)
	{
		System.out.print(a[m] + " ");
	}
	
	}
	
}
				
			