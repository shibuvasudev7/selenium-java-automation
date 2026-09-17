package assesment;
abstract class Employee {
    String name;
    
    Employee(String name) {
        this.name = name;
    }
       abstract double calculateSalary();
}
    class Emp01 extends Employee{
    	double salary ;
    	Emp01(String name,double salary){
    		super(name);
    		this.salary=salary;
    	}
    	double calculateSalary() {
    		return salary+(salary*0.20);
    	}
    }
    class Emp02 extends Employee{
    	double salary;
    	Emp02(String name,double salary){
    		super(name);
    		this.salary=salary;
    	}
    	double calculateSalary() {
    		return salary+(salary*0.10);
    	}
    }
public class Empabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp01 emp01 = new Emp01("SV",45000);
Emp02 emp02 = new Emp02("ASD",24000);
System.out.println("Emp01 Salary ="+emp01.calculateSalary());
System.out.println("EMP02 Salary ="+emp02.calculateSalary());
	}

}

