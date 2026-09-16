package usingscanner;

import java.util.Scanner;

public class armsscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter Number");
int num = sc.nextInt();
int org = num;
int sum = 0;
while(num!=0) {
	int dig = num%10;
	sum = sum + (dig*dig*dig);
	num=num/10;
}
if(sum==org) {
	System.out.println("ARMS");
}
else {
	System.out.println("NOT ARMS");	
}
	}
}
