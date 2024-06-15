class Person
{
	int nic;
	String name;
	private String cellphone;

	Person()
	{
		nic = 12345;
		name = "Sadaf";
	}
	
	void displayPerson()
	{
		System.out.println(" NIC : " + nic);
		System.out.println(" Name : " + name);
		
	}



}


class Student extends Person
{

	
	int sid;
	String sdept;
	
	Student()	
	{
		
		sid = 111;
		sdept = "CS";
	}

	void displayStudent()
	{
		
		System.out.println("Student ID : " + sid);
		System.out.println("Student Dept : " + sdept);
	}

}

class Teacher
{

	int nic;
	String name;
	int tid;
	String tdept;
	String tdesig;
	
	Teacher()	
	{
		nic = 54321;
		name = "Raheel";
		tid = 11111;
		tdept = "CS";
		tdesig = "AP";
	}

	void displayTeacher()
	{
		System.out.println("Teacher NIC : " + nic);
		System.out.println("Teacher Name : " + name);
		System.out.println("Teacher ID : " + tid);
		System.out.println("Teacher Dept : " + tdept);
		System.out.println("Teacher Designation: " + tdesig);
	}



}

public class inheritance_Program5
{

	public static void main(String args[])
	{
		
		Person p = new Person();
		p.displayPerson();
		
		//p.sid = 12345;
		System.out.println();

		Student s1= new Student();
		//s1.displayStudent();
		System.out.println();

		s1.nic = 123;
		s1.name = "Shakir";
		s1.sid = 111;
		s1.sdept = "CS";

		System.out.println();
		s1.displayPerson();

		System.out.println();
		s1.displayStudent();
			
	}

}