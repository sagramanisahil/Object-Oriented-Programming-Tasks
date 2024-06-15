class Mobile {
	String brand;
	String model;
	String color;

public Mobile(String  brand, String model, String color){
	this.brand = brand;
	this.model = model;
	this.color = color;
}

public void changeColor(String newcolor){
	this.color=newcolor;
	return newcolor;
}
	
class Program {
	public static void main(String[] args){

	Mobile mobile1= new Mobile("IPHONE", "15 Pro", "Blue"); 
	Mobile mobile2= new Mobile("Vivo", "V21", "White"); 
	Mobile mobile3= new Mobile("Oppo", "F1s", "Black"); 

	mobile1.changeColor("White");
	mobile2.changeColor("Blue");
	mobile3.changeColor("Black");
	









	}
}