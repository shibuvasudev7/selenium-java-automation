package testoopsprgm;
class Animal{
	void sound() {
		System.out.println("Animal Making Sound...");
	}
}
class Bird extends Animal{
	void sound() {
		System.out.println("Bird is Making Sound...");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("Cat is Making Sound...");
	}
}
public class Animaltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Bird b = new Bird();
		Cat c = new Cat();
		a.sound();
		b.sound();
		c.sound();
	}

}
