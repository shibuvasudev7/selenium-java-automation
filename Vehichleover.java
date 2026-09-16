package testoopsprgm;
class Vehichle{
	void startEngine() {
		System.out.println("Vehichle is Starting...");
	}
	void stopEngine() {
		System.out.println("Vehichle is Stopped...");
	}
}
class Car extends Vehichle{
	void startEngine() {
		System.out.println("Car Engine is Start with a Key...");
	}
	void stopEngine() {
		System.out.println("Car Engine Stopped when Key is turned off...");
	}
}
class Motorcycle extends Vehichle{
	void startEngine() {
		System.out.println("Motorcycle engine started with a kick-start... ");
	}
	void stopEngine() {
		System.out.println("Motorcycle engine stopped when ignition is turned off...");
	}
}
public class Vehichleover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehichle v1= new Car();
		System.out.println("Car Actions...");
		v1.startEngine();
		v1.stopEngine();
		
		Vehichle v2 = new Motorcycle();
		System.out.println("\nMotorcycle Actions...");
		v2.startEngine();
		v2.stopEngine();
	}
}
