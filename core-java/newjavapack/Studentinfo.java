package newjavapack;
class Students {
	int id ;
	String name;
	void insertRecord(int i,String n) {
		id = i;
		name=n;
		
	}
	void displayInfo() { System.out.println(id+" "+name);}
}
public class Studentinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Students s1 = new Students();
Students s2 = new Students();
s1.insertRecord(111, "SV");
s2.insertRecord(222,"DA");
s1.displayInfo();
s2.displayInfo();
	}

}
