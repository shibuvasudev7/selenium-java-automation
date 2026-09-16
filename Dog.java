package oops;

public class Dog {
	String name;
	String color;
	char grade;
	Dog(String n,String c){
		name=n;
		color=c;
	}
	Dog(String n, String c,char g){
		name = n;
		color = c;
		grade = g;
	}
	void display() {
		System.out.println(name+" " +color+ " " +grade);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d1=new Dog("ABC","Red");
Dog d2 =new Dog("ASD", "Black",'A');
d1.display();
d2.display();
	}

}
