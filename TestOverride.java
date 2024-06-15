class Maths {
	
	public void display()
	{
		System.out.println("Hello I am display method of Maths");
	}
}

class Algebra extends Maths {
	
	public void display()
	{
		System.out.println("Hello I am display method of Algebra");
	}
}

class TestOverride {
	public static void main(String args[]){
		Maths obj = new Algebra();
		obj.display();
	
		obj= new Maths();
		obj.display();
	}
}