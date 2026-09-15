package testthrow.java;

public class Testthrow1 {
static void number(int n) throws IllegalArgumentException{
	try {
		if (n%2 !=0) {
		throw new IllegalArgumentException("Odd number is not allowed "+n);
		}else {
			System.out.println("Even number is "+n);
		}
	}	
	catch(IllegalArgumentException e) {
		System.out.println(e);
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 number(22);
System.out.println("Print");
	}

}
