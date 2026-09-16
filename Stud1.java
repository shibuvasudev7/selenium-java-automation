package oops;

 class Stud1 {
	int mark = 450;
}
class Total extends Stud1{
	String name = "ADS";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Total t=new Total();
		System.out.println("STUDENT NAME :"+t.name);
		System.out.println("TOTAL :"+t.mark);

	}

}
