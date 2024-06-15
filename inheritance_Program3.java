class Person
{
	int nic;
	String name;

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

class Teacher extends Person
{
	int tid;
	String tdept;
	String tdesig;
	
	Teacher()	
	{
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

public class inheritance_Program3
{

	public static void main(String args[])
	{
		//Student s1= new Student();
		//s1.displayStudent();
		
		//Teacher t1= new Teacher();
		//t1.displayTeacher();
		//t1.displayPerson();
	
		s1.nic = 123;
		s1.name = "Shakir";
		s1.sid = 111;
		s1.sdept = "CS";

		/*System.out.println(" NIC : " + s1.nic);
		System.out.println(" Name : " + s1.name);
		System.out.println("Student ID : " + s1.sid);
		System.out.println("Student Dept : " + s1.sdept);*/
				
		
	}





}