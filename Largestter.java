package assesment;

import java.util.Scanner;

public class Largestter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		int c= sc.nextInt();
		int ln=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("Largest Number ="+ln);
	}

}
