public class CMD {
public static void main(String[] args) 
{
int sum=0;
if(args.length > 0) {
 System.out.println("Arguments passed from command line:");
 for (String arg : args) {
	sum=sum+Integer.parseInt(arg);
 System.out.println(sum);
 }
}
else
 System.out.println("No arguments provided.");
}
}