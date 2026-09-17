package oops;

public class Book {
	String title;
	String author;
	double price;
	Book(String t,String a){
		title = t;
		author = a;
	}
	Book(String t,String a, double p){
		title = t;
		author = a;
		price = p;
	}
	void display() {
		System.out.println("TITLE : "+title);
		System.out.println("AUTHOR :"+author);
		System.out.println("PRICE  :"+price);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book b1 =new Book("BOOK 1","Auth 1");
Book b2 =new Book ("BOOK 1 ","Auth 1",205.30 );
b1.display();
b2.display();
	}

}
