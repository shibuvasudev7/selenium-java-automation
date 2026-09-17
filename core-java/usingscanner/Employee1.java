package usingscanner;

public class Employee1 {
	int id;
	String name;
	String depart;
	Employee1(int i,String n, String d){
		id=i;
		name=n;
		depart=d;
	}
	void display() {
		System.out.println(id+ " " +name+ " " +depart);}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee1 e1=new Employee1(120,"SV","QA");
Employee1 e2=new Employee1(150,"ASD","QA");
e1.display();
e2.display();
	}
}


