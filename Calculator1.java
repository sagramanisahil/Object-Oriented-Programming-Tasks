package letmecalculate;

public class Calculator1{
		public int add(int x, int y)
		{
			return (x+y);
		}


		public float square(int a)
		{
			return a*a;
		}
		
		public int power(int base, int exp)
		{
			int result=1;
			for(int i=1; i<=exp; i++)
			{
				return result*=base;
			}
			return result;
		}
}