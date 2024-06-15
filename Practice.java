class Person
{
	int nic;
	String name;
	private String cellphone;
	private String Nationality;
	String gender;
	String Address;
	String occupation;

	Person()
	{
		nic = 12345;
		name = "Raheel";
		cellphone = "03453839793";
		Nationality="Pakistani";
	}
	
	void setCellPhone(String cellphone)
	{
		this.cellphone = cellphone;
	}

	String getCellPhone()
	{
		return cellphone;
	}
	
	void setNationality(String Nationality)
	{
		this.Nationality=Nationality;
	}
	
	String getNationality()
	{
		return Nationality;
	}
	
	void displayPerson()
	{
		System.out.println("NIC : " + nic);
		System.out.println("Name : " + name);
		System.out.println("CellPhone : " + cellphone);
		System.out.println("Nationality : " + Nationality);
	}
}


class Driver extends Person
{
	
	int did;
	String dcar;
	
	Driver()	
	{
		name="Ameet";
		nic=82993;
		did = 829;
		Address = "Parmar Colony";
		dcar= "Mehran";
		gender="Female";
		occupation="Driver";
	}

	void displayDriver()
	{
		
		System.out.println("Driver ID : " + did);
		System.out.println("Driver Address : " + Address);
		System.out.println("Driver Car : " + dcar);
		System.out.println("Gender : " + gender);
		System.out.println("Occupation : " + occupation);
	}

}

class Student extends Person
{
	
	int sid;
	String sdept;
	double sgpa;
	Student()	
	{
		name="Sahil";
		nic=28332;
		sid = 111;
		sdept = "CS";
		sgpa=3.600;
		gender="Male";
		Address = "Jagdish Colony";
		occupation="Student";
	}

	void displayStudent()
	{
		
		System.out.println("Student ID : " + sid);
		System.out.println("Student Dept : " + sdept);
		System.out.println("Student GPA : " + sgpa);
		System.out.println("Gender : " + gender);
		System.out.println("Student Address : " + Address);
		System.out.println("Occupation : " + occupation);
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
		gender="Male";
		Address = "Sukkur IBA";
		occupation="Teacher";
	}

	void displayTeacher()
	{
		
		System.out.println("Teacher ID : " + tid);
		System.out.println("Teacher Dept : " + tdept);
		System.out.println("Teacher Designation: " + tdesig);
		System.out.println("Gender : " + gender);
		System.out.println("Teacher Address : " + Address);
		System.out.println("Occupation : " + occupation);
	}
}

public class Practice
{

	public static void main(String args[])
	{

		Teacher t = new Teacher();

		t.displayPerson();

		t.displayTeacher();
	
		System.out.println();

		Student s1 = new Student();

		s1.displayPerson();

		s1.displayStudent();
		
		System.out.println();

		Driver d1 = new Driver();

		System.out.println();

		d1.displayPerson();
		
		d1.displayDriver();
		
		System.out.println();

		Person p1= new Person();

		p1.displayPerson();
	
	}
}