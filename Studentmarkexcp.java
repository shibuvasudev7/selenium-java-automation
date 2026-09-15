package testthrow.java;

class InvalidMarkException extends Exception{
	public InvalidMarkException(String s) {
		super(s);
	}
}
public class Studentmarkexcp {

	static void validatemarks(int marks) throws InvalidMarkException {
		if (marks<0|| marks>100) {
			throw new InvalidMarkException("Invalid Marks!!!");
		}else {
			System.out.println("Valid Marks :"+marks);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	validatemarks(75);
	validatemarks(110);
}catch (InvalidMarkException i) {
	System.out.println("Error :"+i.getMessage());
}
	}

}
