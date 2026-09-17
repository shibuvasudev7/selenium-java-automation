package eXelTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwrite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String pth = "C:\\Users\\shibu\\Downloads\\Selenium\\Excel\\Writeexcel.xlsx";
		FileInputStream stm = new FileInputStream(pth);
		XSSFWorkbook  wbk = new XSSFWorkbook(stm);
		XSSFSheet  sht = wbk.getSheetAt(0);
		int lastRow = sht.getLastRowNum();
		
		for(int i=0;i<=lastRow;i++) {
			 XSSFRow row = sht.getRow(i);
		        XSSFCell cell = row.getCell(1);
		        cell.setCellValue("Text Excel1");
		}
		stm.close();

//		FileOutputStream fos = new FileOutputStream(path);
		  FileOutputStream fos = new FileOutputStream(pth);
		wbk.write(fos);
		fos.close();
		wbk.close();
	}
	

}
