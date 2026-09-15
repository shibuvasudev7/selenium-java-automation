package testthrow.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	readFile("C:\\Users\\shibu\\eclipse-workspace\\Demo.txt.txt");
}
catch (FileNotFoundException e) {
	System.out.println("Error" +e.getMessage());
}

finally {
	System.out.println("Program Ended");
	}
}
	private static void readFile(String Demo)throws FileNotFoundException  {
		File f = new File(Demo);
		// TODO Auto-generated method stub
		Scanner s =new Scanner(f);
	while(s.hasNextLine()) {
		System.out.println(s.nextLine());
	}
	s.close();
	}
	

}
