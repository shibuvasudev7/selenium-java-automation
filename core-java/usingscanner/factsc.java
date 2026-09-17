package usingscanner;

import java.util.Scanner;

public class factsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number");
int num=sc.nextInt();
int fact = 1;
for(int n=1; n<=num; n++ )
{
	fact=fact*n;
}
System.out.println("Factorial Number of " + num + "is :"+fact);
	}

}
