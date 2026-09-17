package excelJunit;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Exceljunitslab {
	
	WebDriver driver;

	@Before
	public void before() throws InterruptedException {
		
      	driver= new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void test() throws IOException, InterruptedException {
		String path = "C:\\Users\\shibu\\Downloads\\Selenium\\Excel\\newswagexcel.xlsx";
		FileInputStream stream = new FileInputStream(path);
		 XSSFWorkbook wk = new XSSFWorkbook(stream);
		 XSSFSheet sheet = wk.getSheetAt(0);
		 
		 XSSFRow row = sheet.getRow(0);
	        XSSFCell un = row.getCell(0);
	        String var= un.getStringCellValue();
	        System.out.println(var);
	        
	        XSSFRow rows = sheet.getRow(1);
	        XSSFCell uns = rows.getCell(0);
	        String user = uns.getStringCellValue();
	        System.out.println(user);
	        
	        driver.findElement(By.id("user-name")).sendKeys(user);
			Thread.sleep(2000);	
			
			XSSFRow row1 = sheet.getRow(1);
	        XSSFCell ps = row1.getCell(1);
	        String pass = ps.getStringCellValue();
	        System.out.println(pass);
	        
	        driver.findElement(By.id("password")).sendKeys(pass);
			Thread.sleep(2000);
			
			
					driver.findElement(By.id("login-button")).click();
					
					driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
					Thread.sleep(2000);
					
					driver.findElement(By.className("shopping_cart_link")).click();
					Thread.sleep(2000);
					driver.findElement(By.id("checkout")).click();
					Thread.sleep(2000);
					
					XSSFRow row2 = sheet.getRow(1);
			        XSSFCell nf = row2.getCell(2);
			        String fn = nf.getStringCellValue();
			        Thread.sleep(2000);
			        System.out.println(fn);
			        driver.findElement(By.id("first-name")).sendKeys(fn);
					Thread.sleep(2000);
					
					XSSFRow row3 = sheet.getRow(1);
			        XSSFCell nl = row3.getCell(3);
			        String ln = nl.getStringCellValue();
			        System.out.println(ln);
			        driver.findElement(By.id("last-name")).sendKeys(ln);
					Thread.sleep(2000);
					
					XSSFRow row4 = sheet.getRow(1);
			        XSSFCell pst = row4.getCell(4);
			        String pstl = pst.getStringCellValue();
			        System.out.println(pstl);
			        driver.findElement(By.id("postal-code")).sendKeys(pstl);
					Thread.sleep(2000);
					
					
					driver.findElement(By.id("continue")).click();
					Thread.sleep(2000);
					driver.findElement(By.id("finish")).click();
					Thread.sleep(2000);
					driver.findElement(By.id("back-to-products")).click();
					Thread.sleep(2000);
		
	}
	@After
	public void after() {
		driver.quit();
		}
}
