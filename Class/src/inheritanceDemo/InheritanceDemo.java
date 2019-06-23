package inheritanceDemo;

public class InheritanceDemo {
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.start();
		bike.makeSound();
		
		Car car = new Car();
		car.start();
		car.makeSound();
	}
	
}
