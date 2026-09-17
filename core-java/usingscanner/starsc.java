package usingscanner;

import java.util.Scanner;

public class starsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number");
int n=sc.nextInt();
System.out.println("Pattern Printing : ");
for(int a=1; a<=n; a++)
{
	for(int b=2;b<=a; b++) {
		System.out.print("*");

 }
	System.out.println();
}
	}

}
