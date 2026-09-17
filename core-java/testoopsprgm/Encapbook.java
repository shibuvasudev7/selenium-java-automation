package testoopsprgm;
class Book{
	private String title;
	private String author;
	private double price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String t) {
		title=t;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String a) {
		author = a;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double p) {
		price = p;
	}
	public void applydiscount(double per) {
		if (per>0 && per<=100) {
			price = price-(price*(per/100));
		}
	}
}
public class Encapbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book b = new Book();
b.setTitle("JAVA");
b.setAuthor("James Gosling");
b.setPrice(49.99);

b.applydiscount(10);

String t = b.getTitle();
String a = b.getAuthor();
double p =b.getPrice();

System.out.println("Book Details");
System.out.println("-----------------");
System.out.println("TITLE : "+t);
System.out.println("AUTHOR : "+a);
System.out.println("PRICE : "+p);
	}

}
