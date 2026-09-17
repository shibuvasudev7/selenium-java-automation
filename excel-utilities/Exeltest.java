package eXelTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exeltest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//FileInputStream fs= new FileInputStream("‪C:\\Users\\shibu\\Downloads\\Workbook1.xlsx");
		FileInputStream fs = new FileInputStream("C:\\Users\\shibu\\Downloads\\Workbook1.xlsx");
		 XSSFWorkbook wb=new XSSFWorkbook(fs);
		 XSSFSheet sheet = wb.getSheetAt(2);
		 for (int i = 1; i <= 4; i++) {

	            XSSFRow row = sheet.getRow(i);

	            XSSFCell name = row.getCell(0);
	            XSSFCell pass = row.getCell(1);

	            System.out.println(name + " " + pass);
	}

}
}
