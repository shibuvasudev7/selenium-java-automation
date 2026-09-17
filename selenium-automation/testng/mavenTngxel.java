package testNGmaven;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mavenTngxel {
	WebDriver driver;
	XSSFWorkbook wk;
	XSSFSheet sheet;
	
	@BeforeTest
	public void beforetest() {
			  driver = new EdgeDriver();
			  driver.get("https://www.saucedemo.com/");
			  driver.manage().window().maximize();
			  System.out.println("Browser Opened");
		  }
	@Test(priority=1)
	public void valid() throws InterruptedException, IOException {
		
		String path = "C:\\Users\\shibu\\Downloads\\Selenium\\Excel\\newswagexcel.xlsx";
		FileInputStream stream = new FileInputStream(path);
		  wk = new XSSFWorkbook(stream);
		  sheet = wk.getSheetAt(0);
		 
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
			Thread.sleep(2000);
			
			String expectedUrl = "https://www.saucedemo.com/inventory.html";
	        String actualUrl = driver.getCurrentUrl();

	        assertEquals(actualUrl, expectedUrl, "Login Failed");

	        System.out.println("Login Successful");
			
	}
	@Test(priority=2)
	public void addprod() throws InterruptedException {
		
		  driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			Thread.sleep(2000);

			
			driver.findElement(By.className("shopping_cart_link")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("checkout")).click();
		  
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
			driver.findElement(By.id("finish")).click();
			
			String msg = driver.findElement(By.className("complete-header")).getText();
			assertEquals(msg,"Thank you for your order!");
			System.out.println("Order Placed Successfully");
			
	}

	@Test(priority=3)
	public void logout() throws InterruptedException {
		  driver.findElement(By.id("react-burger-menu-btn")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("logout_sidebar_link")).click();
		  Thread.sleep(2000);
		  
		  assertTrue(driver.getCurrentUrl().equals("https://www.saucedemo.com/"));

	      System.out.println("Logout Successful");
	}

	@AfterTest
	public void afterTest() {
		  driver.quit();
		  System.out.println("Browser Closed");
	}
}
