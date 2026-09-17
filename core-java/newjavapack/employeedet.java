package newjavapack;


class Employees {
	int id;
	String name;
	char grade;
	double salary;
	void insertDetails(int i,String n, char g,double s) {
		id = i;
	    name = n;
		grade = g;
	    salary =s;
	}
	void displayDetails() { System.out.println(id+" "+name+" "+grade+" "+salary);
	
}
}
	public class employeedet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employees e1 =new Employees();
Employees e2 = new Employees();
e1.insertDetails(10, "SV", 'A', 20000.5);
e2.insertDetails(13, "ASK", 'C', 16000.45);
e1.displayDetails();
e2.displayDetails();
	}

}
