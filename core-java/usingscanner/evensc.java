package usingscanner;

import java.util.Scanner;

public class evensc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number");
int num=sc.nextInt();
int sum = 0;
for(int n=2; n<=num; n+=2)
{
	sum=sum+n;
	System.out.println(n);
}
System.out.println("Sum of the Numbers is :"+sum);
	}

}
