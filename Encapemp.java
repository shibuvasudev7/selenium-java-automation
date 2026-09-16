package testoopsprgm;
class Empl{
	private String empname;
	private int empid;
	private double empsalary;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String newEmp) {
		empname=newEmp;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int newId) {
		empid = newId;
	}
	public double getSalary() {
		return empsalary;
	}
	public void setSalary(double newSalary) {
		empsalary= newSalary;
	}
	public String getformattedsal() {
		return String.format("$%.2f",empsalary);
	}
}
public class Encapemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Empl e = new Empl();
e.setEmpname("ASD");
e.setEmpid(101);
e.setSalary(4900.25);
	String newEmp = e.getEmpname();
	int newId = e.getEmpid();
	String getformattedsal= e.getformattedsal();
	
	System.out.println("EMPLOYEE DETAILS");
	System.out.println("--------------------"	);
	System.out.println("Emp Name : "+newEmp);
	System.out.println("Emp ID : "+newId);
	System.out.println("Salary  :"+getformattedsal);
	
	}

}
