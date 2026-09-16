package assesment;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int a = sc.nextInt();
		System.out.println("Enter Second Number :");
		int b = sc.nextInt();
		System.out.println("Enter Third Number :");
		int c = sc.nextInt();
		if(a>b&&a>c) {
			System.out.println("Largest Number ="+a);
		}else {
			if(b>a&&b>c) {
				System.out.println("Largest Number ="+b);
			}else {
				System.out.println("Largest Number ="+c);
			}
		}
		sc.close();
	}

}
