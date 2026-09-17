package testNGmaven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Guru99 {

	WebDriver driver;
	FileInputStream file;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	String a;
	String b;
	
	@BeforeTest
	public void before() throws IOException, InterruptedException {
		
		driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/V4/index.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
        Thread.sleep(2000);
	}
	@Test(priority = 1)
	@Ignore
	public void t1() throws IOException, InterruptedException {
		driver.findElement(By.linkText("here")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("emailid")).sendKeys("shibuvasudev50@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void t2() throws IOException, InterruptedException {

	    file = new FileInputStream("C:\\Users\\shibu\\Downloads\\Selenium\\Excel\\guru99.xlsx");
	    wb = new XSSFWorkbook(file);
	    sheet = wb.getSheetAt(0);

	    // Read Manager Username
	    XSSFRow row = sheet.getRow(1);
	    XSSFCell cell = row.getCell(0);
	    a = cell.getStringCellValue();
	    System.out.println("Manager Username : " + a);

	    // Read Manager Password
	    XSSFCell cell1 = row.getCell(1);
	    b = cell1.getStringCellValue();
	    System.out.println("Manager Password : " + b);

	    // Login
	    driver.findElement(By.name("uid")).sendKeys(a);
	    Thread.sleep(1000);

	    driver.findElement(By.name("password")).sendKeys(b);
	    Thread.sleep(1000);

	    driver.findElement(By.name("btnLogin")).click();
	    Thread.sleep(2000);

	    // Verify Manager Login
	    if (driver.getPageSource().contains("Manger Id")) {

	        sheet.getRow(1).createCell(2).setCellValue("Test Passed");
	        System.out.println("Manager Login : PASS");

	    } else {

	        sheet.getRow(1).createCell(2).setCellValue("Test Failed");
	        System.out.println("Manager Login : FAIL");
	    }

	    // Scroll down before clicking Log out
	    driver.findElement(By.linkText("Log out")).getLocation();

	    JavascriptExecutor ja=(JavascriptExecutor)driver; 

        Thread.sleep(2000);
        
        ja.executeScript("window.scroll(0,2050)");


	    Thread.sleep(1000);


	    WebElement logout = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[15]/a"));

	    Actions act = new Actions(driver);
	    act.moveToElement(logout).click().perform();
	    
	    Thread.sleep(1000);

//	    driver.switchTo().alert().accept();
//
//	    Thread.sleep(2000);

	    // Open login page again
	    driver.get("https://demo.guru99.com/V4/index.php");
	    Thread.sleep(2000);

	    // Read second user username
	    XSSFRow row2 = sheet.getRow(2);
	    XSSFCell cell2 = row2.getCell(0);
	    a = cell2.getStringCellValue();

	    System.out.println("User Username : " + a);

	    // Read second user password
	    XSSFCell cell3 = row2.getCell(1);
	    b = cell3.getStringCellValue();

	    System.out.println("User Password : " + b);

	    // Login with second user
	    driver.findElement(By.name("uid")).sendKeys(a);
	    Thread.sleep(1000);

	    driver.findElement(By.name("password")).sendKeys(b);
	    Thread.sleep(1000);

	    driver.findElement(By.name("btnLogin")).click();

	    Thread.sleep(2000);

	    // Verify invalid login
	    try {

	        driver.switchTo().alert().accept();

	        sheet.getRow(2).createCell(2).setCellValue("Test Failed");

	        System.out.println("Invalid Login : Login Failed as Expected");

	    } catch (Exception e) {

	        sheet.getRow(2).createCell(2).setCellValue("Test Passed");

	        System.out.println("Invalid Login : Unexpected Login");
	    }
	}
	
	@AfterTest
		public void close() throws IOException {
		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\shibu\\Downloads\\Selenium\\Excel\\guru99.xlsx");
		wb.write(fileOut);
		fileOut.close();
		file.close();
		wb.close();
		driver.quit();
		
	}
	}
