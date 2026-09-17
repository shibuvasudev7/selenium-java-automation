package testoopsprgm;
class Person{
	private String name;
	private int age;
	private String country;
	public String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	String getCountry() {
		return country;
	}
	public void setName(String newName) {
		name = newName;
	}
	void setAge(int newAge) {
		age = newAge;
	}
	void setTotal (String newCountry) {
		country = newCountry;
	}
}
public class EncapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p = new Person();
p.setName("ABS");
p.setAge(26);
p.setTotal("India");

System.out.println("Name : "+p.getName());
System.out.println("Age :"+p.getAge());
System.out.println("Total :"+p.getCountry());
	}

}
