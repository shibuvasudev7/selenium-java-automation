package oops;
interface Printable{
	void print();
	
}
interface Showable {
	void show();
	
}

public class Multiple implements Printable,Showable{
	public void print() {System.out.println("HELLO");}
	public void show() {System.out.println("WELCOME");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple a = new Multiple ();
		
		a.print();
		a.show();

	}

}
