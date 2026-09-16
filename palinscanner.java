package usingscanner;

import java.util.Scanner;

public class palinscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
System.out.println("Enter Number");
int n=s.nextInt();
int org = n;
int rev = 0;
while (n!=0) {
	int dig = n % 10;
	rev = rev*10 + dig;
	n = n/10;
}
if(rev==org) {
	System.out.println("PALIN");
}
else {
	System.out.println("NOT PALIN");
}
	}

}
