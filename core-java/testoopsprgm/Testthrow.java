package testoopsprgm;

public class Testthrow {
static void validate(int age) throws ArithmeticException {
	if(age<18) {
		throw new ArithmeticException("not valid");
	}else{
		System.out.println("Welcome to Vote");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
validate(15);
System.out.println("rest of the code");
	}

}
