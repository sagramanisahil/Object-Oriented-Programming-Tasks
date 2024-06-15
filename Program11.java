class Architect {
	String brand;
	String model;
	String color;

public Architect(){
	brand="House";
	model= "20*30";
	color="Yellow";
}

public Architect(String  brand, String model, String color){
	this.brand = brand;
	this.model = model;
	this.color = color;
}

public void changeColor(String newcolor){
	this.color=newcolor;
	System.out.println("The Color of "+ model +"and" + brand+ "is now "+ newcolor+".");
	}
}

	
class Program11 {
	public static void main(String[] args){

	Architect architect1= new Architect("Home", "50*50", "Blue"); 
	Architect architect2= new Architect("Flat", "30*20", "White"); 
	Architect architect3= new Architect("Banglow", "100*100", "Black"); 

	architect1.changeColor("White");
	architect2.changeColor("Blue");
	architect3.changeColor("Black");

	}
}