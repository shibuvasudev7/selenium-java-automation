package testthrow.java;
class InvalidProductException extends Exception{
	public InvalidProductException(String s) {
		System.out.println(s);
	}
}
public class Customexceptin {
	
	void productCheck(int weight) throws InvalidProductException{
		if(weight<100) {
			throw new InvalidProductException("Product Invalid");
		}else {
			System.out.println("Product Valid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customexceptin ce =new Customexceptin();
try {
	ce.productCheck(994);
}catch (InvalidProductException iv){
//	System.out.println("Product Valid");
	System.out.println(iv.getMessage());
}
	}

}
