package oops;

public class Cat{
	String name;
	int age;
	Cat(){
		name ="UnKnown";
		age=0;	
	}
	 public static void main(String[] args) {
		 Cat c=new Cat();
		String n=c.name;
		 int a= c.age;
		 System.out.println("Name :"+n);
		 System.out.println("Age :"+a);
		 
	 }
}