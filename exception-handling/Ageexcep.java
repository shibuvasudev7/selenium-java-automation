package testthrow.java;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String s) {
		super(s);
	}
}

public class Ageexcep {
static void validateage(int age)throws InvalidAgeException{
	if(age<18) {
		throw new InvalidAgeException("Not Eligible for Voting");
	}else
	{
		System.out.println("Eligible for Voting");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	validateage(17);
}catch(InvalidAgeException ia) {
	System.out.println("Error :"+ia.getMessage());
	}

}}
