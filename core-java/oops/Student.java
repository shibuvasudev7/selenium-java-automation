package oops;

class Stud {
int id;
String name;
Stud(int i, String n){
	this.id=i;
	this.name=n;
}
void display() {
	System.out.println(id+ " "+name);

	System.out.println();
}
}
public class Student {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stud s1= new Stud(111, "ASD");
Stud s2= new Stud(121, "ZXC");
s1.display();
s2.display();
	}

}
