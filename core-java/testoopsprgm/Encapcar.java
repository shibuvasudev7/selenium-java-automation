package testoopsprgm;
class Carr{
	private String company_name;
	private String model_name;
	private int year;
	private double milage;
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name=company_name;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name=model_name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year =year;
		}
	public double getMilage() {
		return milage;
	}
	
}
public class Encapcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Carr c = new Carr();
c.setCompany_name("BMW");
c.setModel_name("X5");
c.setYear(2024);

String company_name = c.getCompany_name();
String model_name = c.getModel_name();
int year = c.getYear();
double milage = c.getMilage();


System.out.println("Company Name :"+company_name);
System.out.println("Model Name :"+model_name);
System.out.println("Year :"+year);
System.out.println("Milage :"+milage);
	}

}
