class Person
{
	int nic;
	String name;
	private String cellphone;

	Person()
	{
		nic = 12345;
		name = "Raheel";
		cellphone = "RRRRRRRR";
	}
	
	void setCellPhone(String cellphone)
	{
		this.cellphone = cellphone;
	}

	String getCellPhone()
	{
		return cellphone;
	}
	
	void displayPerson()
	{
		System.out.println(" NIC : " + nic);
		System.out.println(" Name : " + name);
		System.out.println(" CellPhone : " + cellphone);
		
	}
}

class Student extends Person
{

	
	int sid;
	String sdept;
	
	Student()	
	{
		name="Sahil";
		nic=28332;
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
		name="Faheem";
		nic=27382;
		tid = 11111;
		tdept = "CS";
		tdesig = "AP";
	}

	void displayTeacher()
	{
		
		System.out.println("Teacher ID : " + tid);
		System.out.println("Teacher Dept : " + tdept);
		System.out.println("Teacher Designation: " + tdesig);
	}



}

public class inheritance_Program7
{

	public static void main(String args[])
	{

		Teacher t = new Teacher();
		t.displayPerson();

		System.out.println();
		t.displayTeacher();
	
		System.out.println();

		Student s1 = new Student();
		s1.displayPerson();

		System.out.println();
		s1.displayStudent();
	}





}