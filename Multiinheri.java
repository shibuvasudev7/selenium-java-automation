package oops;

interface printable {
void print ();
}
class Multiinheri implements printable{
public	void print() {
		System.out.println("hello");}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Multiinheri obj =new Multiinheri ();
obj.print();

	}
}
