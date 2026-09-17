package usingscanner;

import java.util.Scanner;

public class primesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Limit");
int limit = sc.nextInt();
for(int n=2; n<=limit; n++) {
	boolean isPrime = true;
	for(int a=2; a<=n/2; a++)
	{
		if(n % a == 0) {
			isPrime = false;
			break;
		}
	}
	if(isPrime) {
		System.out.println(n);
	}
}
	}

}
