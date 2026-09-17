package testoopsprgm;

interface Shape {
	double getArea();}
class Rectangle implements Shape{
 double length;
 double width;

Rectangle (double l, double w){
length = l;
width = w;
}

public double getArea() {
	return length*width;
}
}
class Circle implements Shape {
     double radius;
	Circle (double r){
		radius = r;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}
class Triangle implements Shape {
	double height;
	double base;
	Triangle (double h, double b){
		height = h;
		base = b;
	}
	public double getArea() {
		return 0.5*base*height;
	}	
	}

public class testhier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Rectangle rec = new Rectangle(10,5);
  Circle cir = new Circle(15);
  Triangle tri = new Triangle (5,10);
  
double recArea = rec.getArea();
double cirArea = cir.getArea();
double triArea = tri.getArea();

  System.out.println("Rectangle Area: " + recArea);
  System.out.println("Circle Area: " + cirArea);
  System.out.println("Triangle Area: " + triArea);
}

	}

