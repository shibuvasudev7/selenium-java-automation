package usingscanner;

import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter Name");
String name = sc.nextLine();
System.out.print("Enter Student id ");
int id = sc.nextInt();
System.out.println("Enter Marks for Subject");
System.out.print("Subject 1 ");
int mark1=sc.nextInt();
System.out.print("Subject 2 ");
int mark2 =sc.nextInt();
System.out.print("Subject 3 ");
int mark3 =sc.nextInt();
System.out.print("Subject 4 ");
int mark4=sc.nextInt();
System.out.print("Subject 5 ");
int mark5=sc.nextInt();
int total=mark1+mark2+mark3+mark4+mark5;
double avg = total/5.0;
System.out.println("|nStudent Details:");
System.out.println(" Name :"+name);
System.out.println("ID Number :" +id);
System.out.println("Total Marks :"+total);
System.out.println("Average Marks :"+avg);
int grade =(int)avg/10;
switch(grade) {
case 9 : System.out.println("Grade A ");break;
case 8 : System.out.println("Grade B ");break;
case 7 : System.out.println("Grade C ");break;
case 6 : System.out.println("Grade D ");break;
case 5 : System.out.println("Grade E ");break;
default : System.out.println("Grade F ");break;
}
 
	}

}
