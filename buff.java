package newjavapack;

import java.io.*;

public class buff {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(r);
System.out.println("Enter Your Name");
String name = br.readLine();
System.out.println("Enter Your Class");
String clas = br.readLine();
System.out.println("Welcome"+name +clas);

	}

}