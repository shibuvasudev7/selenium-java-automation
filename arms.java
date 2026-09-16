package newjavapack;

public class arms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 120;
int org = n;
int sum = 0;
while(n!=0) {
	int dig = n%10;
	sum = sum+(dig*dig*dig);
	n =n/10;
}
if(sum==org)
{
	System.out.println("Arms");
	
}else
{
	System.out.println("Non Arms");
}
	}

}
