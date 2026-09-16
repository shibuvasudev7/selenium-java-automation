package testoopsprgm;

public class Testexecption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a =10;
	int b = 0;
	System.out.println(a/b);
	int arr[] = {1,2,3};
	System.out.println(arr[5]);
}
catch(ArithmeticException e) {
	System.out.println("Canot Divided by 0");
}
catch (ArrayIndexOutOfBoundsException e) {
	System.out.println(e);
}
finally {
	System.out.println("finally always print");
System.out.println("rest of the code");
}
}}