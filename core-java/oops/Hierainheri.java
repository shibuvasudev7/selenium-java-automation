package oops;
class Animal2 {
	void eat() {
		System.out.println("Eating...");
	}
}
class Dog3 extends Animal2 {
	void bark() {
		System.out.println("Dog is Barking...");
	}
}
class Cat1 extends Animal2 {
	void meow () {
		System.out.println("Cat is Meowing...");
	}
}
public class Hierainheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog3 d= new Dog3();
		d.eat();
		d.bark();
		
Cat1 c= new Cat1();
c.eat();
c.meow();
	}

}
