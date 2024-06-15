import letmecalculate.Calculator;
import letmecalculate.Multiplication;
import letmecalculate.Substraction;
public class Demo{
 public static void main(String args[]){
Calculator obj = new Calculator();
System.out.println(obj.add(100, 200));

Multiplication m = new Multiplication();
System.out.println(m.Multiply(25,3));

Substraction s= new Substraction();
System.out.println(s.Subtract(25,3));


 }
}