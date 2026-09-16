package usingscanner;

import java.util.Scanner;

public class fibnosc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter Number");
int n=sc.nextInt();
int a=1;
int b=2;
System.out.print(a + " " + b);
for(int i=3; i<n; i++)
{
	int c=a+b;
	System.out.print(" " + c);
	a=b;
	b=c;
}
	
	}

}
