package testoopsprgm;

interface Drawable {
	void draw();
}
class Rectangle1 implements Drawable{
	public void draw()
	{ System.out.println("Drawing Rectangle...");
	}
}
class Circle1 implements Drawable{
	public void draw()
	{ System.out.println("\nDrawing Circle...");
	}
}
class Triangle1 implements Drawable{
	public void draw()
	{ System.out.println("\nDrawing Triangle...");
	}
}
public class Testmultidraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle1 r = new Rectangle1();
Circle1 c = new Circle1();
Triangle1 t = new Triangle1();
r.draw();
c.draw();
t.draw();
	}

}
