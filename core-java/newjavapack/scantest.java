package newjavapack;

import java.util.Scanner;

public class scantest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner o= new Scanner(System.in);
System.out.println("User Name");
String username = o.nextLine();
System.out.println("User id");
int id = o.nextInt();
System.out.println("Sal");
double sal = o.nextDouble();
System.out.println("User Name :"+username);
System.out.println("User Id :"+id);
System.out.println("Salary :"+sal);
	}

}
