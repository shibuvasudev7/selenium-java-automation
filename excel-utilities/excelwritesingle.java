package eXelTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelwritesingle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String pth = "C:\\Users\\shibu\\Downloads\\Selenium\\Excel\\Writeexcel.xlsx";
		FileInputStream stm = new FileInputStream(pth);
		XSSFWorkbook  wbk = new XSSFWorkbook(stm);
		XSSFSheet  sht = wbk.getSheetAt(0);
		
		XSSFRow row = sht.createRow(0);
		
		 XSSFCell cell = row.createCell(0);
	        cell.setCellValue("First Name");

	        XSSFCell cell1 = row.createCell(1);
	        cell1.setCellValue("Last Name");
	        
	        XSSFCell cell2 = row.createCell(2);
	        cell2.setCellValue("Address");
	        
	        XSSFCell cell3 = row.createCell(3);
	        cell3.setCellValue("City");
	        
	        XSSFCell cell4 = row.createCell(4);
	        cell4.setCellValue("State");
	        
	        XSSFCell cell5 = row.createCell(5);
	        cell5.setCellValue("Zip Code");

	        XSSFCell cell6 = row.createCell(6);
	        cell6.setCellValue("Phone #");

	        XSSFCell cell7 = row.createCell(7);
	        cell7.setCellValue("SSN");

	        XSSFCell cell8 = row.createCell(8);
	        cell8.setCellValue("Username");

	        XSSFCell cell9 = row.createCell(9);
	        cell9.setCellValue("Password");

	        XSSFCell cell10 = row.createCell(10);
	        cell10.setCellValue("Confirm");
	        
	        
	        XSSFRow row1 = sht.createRow(1);

	        XSSFCell dt1 = row1.createCell(0);
	        dt1.setCellValue("Arjun");

	        XSSFCell dt2 = row1.createCell(1);
	        dt2.setCellValue("Nair");

	        XSSFCell dt3 = row1.createCell(2);
	        dt3.setCellValue("12 MG Road");

	        XSSFCell dt4 = row1.createCell(3);
	        dt4.setCellValue("Thiruvananthapuram");

	        XSSFCell dt5 = row1.createCell(4);
	        dt5.setCellValue("Kerala");

	        XSSFCell dt6 = row1.createCell(5);
	        dt6.setCellValue("695001");

	        XSSFCell dt7 = row1.createCell(6);
	        dt7.setCellValue("9876543210");

	        XSSFCell dt8 = row1.createCell(7);
	        dt8.setCellValue("456-78-9012");

	        XSSFCell dt9 = row1.createCell(8);
	        dt9.setCellValue("arjunnair123");

	        XSSFCell dt10 = row1.createCell(9);
	        dt10.setCellValue("Arjun@123");

	        XSSFCell dt11 = row1.createCell(10);
	        dt11.setCellValue("Arjun@123");

	        FileOutputStream fos = new FileOutputStream(pth);
	        wbk.write(fos);
		
		System.out.println("Data Entered Successfully");

	}

}
