package testthrow.java;

class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException(String s) {
		System.out.println(s);
	}
}
class Bankaccount {
double balance = 12000.25;
double min_bal = 1000;
public void withdraw(double amount) {
	if(amount>balance) {
		throw new InsufficientBalanceException("Insufficeient Balance");
	}
	if((balance-amount)<min_bal) {
		throw new InsufficientBalanceException("Cannot Manintain Min Bal :"+min_bal);
	}
	balance-=amount;
	System.out.println("Withdraw Successful...");
	System.out.println("Withdrawn Amount : "+amount); 
	System.out.println("Current Balance : "+balance);
}}
public class Bankthrow{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bankaccount b=new Bankaccount();
b.withdraw(2500);
	}
}

