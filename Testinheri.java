package oops;
class Animal{
	void eat ()
	{ System.out.println("Eating...");
	}
	}
	class Dog1 extends Animal {
		void bark ()
		{
			System.out.println("Barking....");
		}
}
public class Testinheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog1 d=new Dog1();
d.bark();
d.eat();
	}
}
