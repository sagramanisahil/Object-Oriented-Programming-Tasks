/*
This code is created to demonstrate "String pool" in the heap memory. In addition,it will also 
demonstrate the Immutable strings
Before Executing This code:
You must be aware of the Heap and Stack memory concept
*/

public class Demo_String {
public static void main(String args[])
{
String s1 = new String("Zainab");

String s2 = new String("Zainab");

System.out.println(s1==s2);//Thisstatement will return False

//Without the new keywords1 = "Zainab";

s2= "Zainab";

System.out.println(s1==s2);//This willreturn True

//String are Immutable... Let'ssee

System.out.println("Before append: "+ s1 + ": " + s1.hashCode());

s1 += " Umair";

System.out.println("After append: "+ s1 + ": " + s1.hashCode());

//Hashes are different before and after append
}
}
