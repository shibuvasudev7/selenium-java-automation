package assesment;

class Account {
	int iR = 5;
    void calculateInterest(double amount) {
    	double intrest = (amount*iR)/100;
        System.out.println("Interest in Account = " + intrest);
    }
}

class SavingsAccount extends Account {
	int iR=7;
    void calculateInterest(double amount) {
        double intrest = (amount*iR)/100;
    	System.out.println("Savings Interest = " + intrest);
    }
}

public class Overrideacc {

    public static void main(String[] args) {
  double amount = 100000;

        Account a = new Account();
        SavingsAccount s = new SavingsAccount();

        a.calculateInterest(amount);
        s.calculateInterest(amount);

    }
}