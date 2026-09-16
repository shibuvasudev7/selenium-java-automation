package newjavapack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class empdetail {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Employee Details");
		System.out.println("------------------------------");
		System.out.println("Employee ID");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Employee Name");
		String name = br.readLine();
		System.out.println("Department");
		String dep = br.readLine();
		System.out.println("Employee Salary");
		double salary = Double.parseDouble(br.readLine());
		System.out.println("Employee ID : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Department ;"+dep);
		System.out.println("Employee Salary :"+salary);
		
	}

}
