package newjavapack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testbuffis {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter ID");
int id = Integer.parseInt(br.readLine());
System.out.println("Enter Gender(M/F)");
char gender = (char)br.read();
br.readLine();
System.out.println("Enter Name");
String name = br.readLine();
System.out.println("ID:"+id);
System.out.println("Gender:"+gender);
System.out.println("Name:"+name);

	}

}
