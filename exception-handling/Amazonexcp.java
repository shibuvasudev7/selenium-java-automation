package testthrow.java;
class OutOfStockException extends Exception{
	public OutOfStockException(String s) {
		super(s);
	}
}
public class Amazonexcp {
static void productstocks(int available,int requested)throws OutOfStockException{
	if(available<requested) {
		
	throw new OutOfStockException("Out Of Stock..");
}else {
	System.out.println("Order Placed Successfully");
}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int available =5;
		int requested =1;
		
try {
	productstocks(available,requested);
}catch(OutOfStockException o) {
	System.out.println(o.getMessage());
}
	}

}
