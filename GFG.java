interface Person {
	int id= 38;
	void print();
}

class Student implements Person {
	int id= 63;
	public void print()
	{
		System.out.print("Sahil" + id);
	}
}

class GFG {
	public static void main(String args[]){
		Student s = new Student();
		s.print();

		System.out.println();
		System.out.println("ID : " + s.id);
	}
}