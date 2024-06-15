class Student
{

	private int nic;
	String name;
	int sid;
	private String sdept;

	public void setNic(int nic)
	{
		this.nic=nic;
	}
	
	public int getNic()
	{
		return nic;
	}
		
	public void setDept(String sdept)
	{
		this.sdept=sdept;
	}
	
	public String getDept()
	{
		return sdept;
	}
	
	void displayStudent()
	{
		System.out.println("Student NIC : " + nic);
		System.out.println("Student Name : " + name);
		System.out.println("Student ID : " + sid);
		System.out.println("Student Dept : " + sdept);
		System.out.println("Student Get Nic is  : " + getNic());
		System.out.println("Student Get Department is  : " + getDept());
	}

}

public class inheritance_Program1
{

	public static void main(String args[])
	{
		Student s1= new Student();
		int nic=2393;
		s1.name="Sahil";
		s1.sid=3324;
		String sdept="CS";

		s1.setNic(1234);
		s1.setDept("BBA");
		s1.displayStudent();
	}

}