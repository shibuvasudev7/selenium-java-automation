package testoopsprgm;
class Animall{
        void eat() {
        	System.out.println("Animal is Eating...");
        }
		void sound() {
			System.out.println("Animal Making Sound...");
		}
}
class Lion extends Animall{
	void eat() {
		System.out.println("Lion Eats Meat..");
	}
	void sound() {
		System.out.println("Lion Roars...");
	}
}
class Tiger extends Animall{
	void eat() {
		System.out.println("\nTiger Eats Meat..."); 
		
	}
	void sound() {
		System.out.println("Tiger Growls...");
	}
}
class Panther extends Animall{
	void eat() {
		System.out.println("\nPanther Eats Meat...");
	}
	void sound() {
		System.out.println("Panther Purr...");
	}
}
public class Animaleatsound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Lion l = new Lion();
Tiger t = new Tiger();
Panther p = new Panther();
l.eat();
l.sound();
t.eat();
t.sound();
p.eat();
p.sound();
	}

}
