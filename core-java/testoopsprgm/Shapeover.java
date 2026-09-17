package testoopsprgm;
class Shape2 {
	double getArea() {
		return 0;
	}
	double getPerimeter() {
		return 0;
	}
}
class Rectangle2 extends Shape2{
 double length;
 double width;

Rectangle2 (double l, double w){
length = l;
width = w;
}

public double getArea() {
	return length*width;
}
public double getPerimeter() {
	return 2*(length+width);
}
}
class Circle2 extends Shape2 {
     double radius;
	Circle2 (double r){
		radius = r;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public double getPerimeter() {
		return 2* 3.14* radius;
		
	}
}
class Triangle2 extends Shape2 {
	double side1;
	double side2;
	double side3;
	double height;
	double base;
	Triangle2 (double s1,double s2,double s3,double h, double b){
		side1=s1;
		side2=s2;
		side3 = s3;
		height = h;
		base = b;
	}
	public double getArea() {
		return 0.5*base*height;
	}	
	public double getPerimeter() {
		return side1+side2+side3;
	}
}


public class Shapeover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle2 r = new Rectangle2 (12,6);
      System.out.println("Area of Rectangle is ="+r.getArea());
      System.out.println("Perimeter of Rectangle is ="+r.getPerimeter());
      
      Circle2 c =new Circle2 (6);
      System.out.println("\nArea of Circle is ="+c.getArea());
      System.out.println("Perimeter of Circle is ="+c.getPerimeter());
      
      Triangle2 t =new Triangle2(2,3,4,5,6);
      System.out.println("\nArea of Triangle ="+t.getArea());
      System.out.println("Paerimeter of Triangle is ="+t.getPerimeter());
	}
}

