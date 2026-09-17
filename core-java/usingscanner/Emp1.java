package usingscanner;

public class Emp1 {
	int id;
	String name;
	char grade;
	double salary;
	public Emp1(int i,String n,char g){
		id=i;
		name=n;
		grade=g;
	}
	Emp1(int i,String n,char g,double s){
		id = i;
		name = n;
		grade = g;
		salary = s;
	}
	public void display() {
		System.out.println(id+ " " +name+ " " +grade+ " " +salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp1 e1 = new  Emp1(150,"ASD",'C');
Emp1 e2 = new Emp1(151,"ZXC",'B');
Emp1 e3 = new Emp1(156,"QWE",'A',15000.22);
e1.display();
e2.display();
e3.display();
	}
}

