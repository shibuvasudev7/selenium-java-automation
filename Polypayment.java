package assesment;
interface Payment{
	void payAmount();
}
class CreditCardPayment implements Payment{
	public void payAmount() {
		System.out.println("Paid by Credit Card");
	}
}
class UPIPayment implements Payment{
	public void payAmount() {
		System.out.println("Paid by UPI");
	}
}
public class Polypayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Payment p;
p=new CreditCardPayment();
p.payAmount();

p=new UPIPayment();
p.payAmount();
	}

}
