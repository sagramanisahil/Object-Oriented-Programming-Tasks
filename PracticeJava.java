class Student{
	int id;
	String name;
	int year;

public Student(int id, String name, int year){
		this.id = id;
		this.name = name;
		this.year = year;
}

public void display(){
	System.out.println("Student ID : " + id);	
	System.out.println("Student Name :  " + name);	
	System.out.println("Student Year : " + year);	
	}
}

class BSStudent extends Student{
	double gpa;
	int award;

	BSStudent(int id, String name, int year, double gpa, int award){
		super(id,name,year);
		this.gpa = gpa;
		this.award = award;
	}

public void Award(){
	System.out.println("Award Information");
	super.display();

	System.out.println("GPA is : " + gpa);
	System.out.println("Award is : " + award);
	}
}

class MSStudent extends BSStudent{
	int publication;
	String specialization;

	MSStudent(int id, String name, int year,double gpa, int award,int publication, String specialization){
		super(id,name,year,gpa,award);
		this.publication = publication;
		this.specialization = specialization;
	}

public void publication(){
		super.display();
		System.out.println("Publication are : " + publication);
		System.out.println("Specialization is : " + specialization);
	}
}

class PracticeJava{
	public static void main(String args[]){
		BSStudent bs = new BSStudent(123,"Sahil",2016,3.6,2);
		MSStudent ms = new MSStudent(456,"Ahmed",2022,3.4,5,4,"AI");

		System.out.println();

		System.out.println("BS Student Information");
		bs.display();
		bs.Award();

		
		System.out.println();

		System.out.println("MS Student Information");
		ms.display();
		ms.publication();
	}
}

		