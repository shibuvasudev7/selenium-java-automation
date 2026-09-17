package eXelTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Exelswaglabs {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
  
		System.setProperty("webdriver.msedge.driver", "C:\\\\Users\\\\shibu\\\\Downloads\\\\Selenium\\\\edge driver\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
//		String path = "‪C:\\Users\\shibu\\Downloads\\Selenium\\Excelswaglabs.xlsx";
		String path = "C:\\Users\\shibu\\Downloads\\Selenium\\Excel\\newswagexcel.xlsx";
		FileInputStream stream = new FileInputStream(path);
		 XSSFWorkbook wk = new XSSFWorkbook(stream);
		// XSSFSheet sheet = wk.getSheet("Demo");
		 XSSFSheet sheet = wk.getSheetAt(0);
		 XSSFRow row = sheet.getRow(0);
	        XSSFCell un = row.getCell(0);
	        String var= un.getStringCellValue();
	        System.out.println(var);
	        
		 XSSFRow rows = sheet.getRow(1);
	        XSSFCell uns = rows.getCell(0);
	        String user = uns.getStringCellValue();
//	        System.out.println(user);
	        
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys(user);
			Thread.sleep(2000);
			
			 XSSFRow row1 = sheet.getRow(1);
		        XSSFCell ps = row1.getCell(1);
		        String pass = ps.getStringCellValue();
		        System.out.println(pass);
		        
		        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys(pass);
				Thread.sleep(2000);
		
				driver.findElement(By.id("login-button")).click();
				
				driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.className("shopping_cart_link")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("checkout")).click();
				Thread.sleep(2000);
				
//				try {
				XSSFRow row2 = sheet.getRow(1);
		        XSSFCell nf = row2.getCell(2);
		        String fn = nf.getStringCellValue();
		        Thread.sleep(2000);
		        System.out.println(fn);
		        driver.findElement(By.id("first-name")).sendKeys(fn);
				Thread.sleep(2000);
//				}
//				catch(NullPointerException e) {
//					System.out.println("NullPointerException");
//				}
				
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
				driver.quit();
//				
	}

}
