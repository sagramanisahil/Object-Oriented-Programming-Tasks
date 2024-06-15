public class Program1{
	public static void main(String[] args){
		Student st1= new Student();
		st1.studentInfo();
	}
}

class Student{
		String name;
		double CGPA;
		int id;
		Student(String name, double CGPA, int id){
			this.name=name;
			this.CGPA=CGPA;
			this.id=id;
		}
		
		void studentInfo(){
			System.out.println("name"+name+"CGPA"+CGPA+"ID"+id);

		}
		
		void updateCGPA(double CGPA){
			this.CGPA=CGPA;
		}
	}
