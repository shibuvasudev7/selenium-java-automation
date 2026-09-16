package assesment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Testarithexcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
try {
	int a= sc.nextInt();
	int b = sc.nextInt();
	System.out.println(a/b);
}catch (ArithmeticException a) {
	System.out.println("Cannot Divided By 0");
}catch(InputMismatchException i) {
	System.out.println("Invalid Input");
}
	}

}
