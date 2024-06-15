import animal.DogAnimal;
import animal.CatAnimal;
import fruit.AppleFruit;
import fruit.BananaFruit;
import vehicle.CarVehicle;
import vehicle.BicycleVehicle;

public class PackagePractice {
    public static void main(String[] args) {

        DogAnimal dog = new DogAnimal();
        System.out.println(dog.bark());

        CatAnimal cat = new CatAnimal();
        System.out.println(cat.meow());

        AppleFruit apple = new AppleFruit();
        System.out.println(apple.eat());

        BananaFruit banana = new BananaFruit();
        System.out.println(banana.peel());

        CarVehicle car = new CarVehicle();
        System.out.println(car.drive());

        BicycleVehicle bicycle = new BicycleVehicle();
        System.out.println(bicycle.ride());
    }
}
