package testoopsprgm;

public class Recur {
static int count = 2;
static void p() {
	count++;
	if(count<=5)
	{
		System.out.println("Hello" +" "+count);
		p();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
p();
	}

}
