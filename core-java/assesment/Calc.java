package assesment;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number :");
int a = sc.nextInt();
System.out.println("Enter Second Number :");
int b = sc.nextInt();
System.out.println("Enter Symbols :");
char ch = sc.next().charAt(0);
  
  switch(ch) {
  case'+' : System.out.println("Result :"+(a+b));break;
  case'-' : System.out.println("Result :"+(a-b));break;
  case '*' :System.out.println("Result :"+(a*b));break;
  case'/' : 
	  if(b!=0) 
	  {
		  System.out.println("Result :"+(a/b));
	  }else {
		  System.out.println("Cannot Divided by 0");break;
	  }
  default : System.out.println("Invalid Symbols");
	  }
	  sc.close();
  }
	}


