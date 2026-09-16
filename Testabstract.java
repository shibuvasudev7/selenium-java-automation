package testoopsprgm;
abstract class Animaal{
abstract void animalsound();
void sleep(){
		System.out.println("Zzzzz...");
	}
}
class Birds extends Animaal{
	void animalsound() {
		System.out.println("Bird is Making Sound...");
	}
}
class Cats extends Animaal{
	void animalsound() {
		System.out.println("\nCat is Making Sound...");
	}
}
public class Testabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Birds b = new Birds();
		Cats c = new Cats();

		b.animalsound();
		b.sleep();
		
		c.animalsound();
		c.sleep();
	}

}

