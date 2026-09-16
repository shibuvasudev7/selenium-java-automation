package assesment;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number :");
int n = sc.nextInt();
int r = 0;
while(n!=0) {
	int digit=n%10;
	r= r*10+digit;
	n=n/10;
}
System.out.println("Reverse Number ="+r);
	}

}
