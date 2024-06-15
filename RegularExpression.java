import java.util.regex.*;
import java.util.*;
public class RegularExpression {
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
// Example 1: Checking if a String contains a specific pattern
String text1 = "This is the sample text just to explore https://www.finance.gov.pk/";
String pattern1 = "[a-zA-Z0-9._%+-]+gov.pk";
boolean containsPattern = Pattern.compile(pattern1).matcher(text1).find();
System.out.println("Contains 'xyz@gov.pk': " + containsPattern);
// Example 2: To check whether the email is valid or not
// Regex pattern for validating email addresses
String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
// Input email to be validated
System.out.println("Enter your email");
String email = sc.nextLine();
// Replace with the email to be validated
// Check if the email matches the pattern
boolean isValidEmail = email.matches(emailPattern);
System.out.println("The entered email is? :" + isValidEmail);
// Example 3: Replacing parts of a String using regex
String text3 = "The quick brown fox jumps over the lazy dog";
String replacedText = text3.replaceAll("fox", "cat");
System.out.println("Replaced text: " + replacedText);
}
}
