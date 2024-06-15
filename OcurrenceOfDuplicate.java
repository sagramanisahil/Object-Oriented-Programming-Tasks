class OcurrenceOfDuplicate {
	public static void main(String args[]){
		int arr1[]= {2,3,4,3,2,4,4,4,2,2,3,6,7,8,9};

		System.out.println("Duplicate Numbers and their Occurrences");
		
		for(int i=0; i < arr1.length; i++)
		{
			int count=1;
			if(arr1[i] != -1)
			{
				for(int j= i+1; j < arr1.length; j++)
				{
					if(arr1[i]==arr1[j])
					{
						count++;
						arr1[j]=-1;
					}
				}
			if(count > 1)
			{
				System.out.println( arr1[i] + " - Occurrences " + count);
			}
		}
	}
}

}