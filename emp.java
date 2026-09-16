package oops;

 class Emp2 {
float sal = 40000;
}
class Prog extends Emp2 {
	int bonus =10000;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Prog p = new Prog();
System.out.println("Prog Sal Is :"+p.sal);
System.out.println("Prog Bonus is :"+p.bonus);
	}
}


