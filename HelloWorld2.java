class HelloWorld2 {
	public static void main(String args[]){
		int arr1[]= {2,3,4,3,2,4,4,4,2,2,3,6,7,8,9};
		
		System.out.print("Duplicate Numbers : ");

		for(int i=0; i < arr1.length; i++)
		{
			int isDuplicate=0;
			for(int j= i+1; j < arr1.length; j++)
			{
				if(arr1[i]==arr1[j])
				{
					isDuplicate=1;
					break;
				} 
			}
		if(isDuplicate==1)
		{
			int alreadyPrinted= 0;
			for(int k= i-1; k >=0; k--)
			{
				if(arr1[i]==arr1[k])
				{
					alreadyPrinted=1;
					break;
				}
			}
		if(alreadyPrinted==0)
		{
			System.out.print( arr1[i] + " ");
		}
	}
}

}

}