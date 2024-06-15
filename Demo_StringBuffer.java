public class Demo_StringBuffer {
 	public static void main(String args[])
{
	StringBuffer sb = new StringBuffer("Zainab");

	//To append another string/text

	System.out.println("Before append:"+ sb + ": " + sb.hashCode());

	sb.append(" Umair");

	System.out.println("After append:"+ sb + ": " + sb.hashCode());

	System.out.println(sb.capacity());
	}
}
