package testNGmaven;

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

public class Blazetg {
	WebDriver driver;
	XSSFWorkbook wk;
	XSSFSheet sheet;
	
	@BeforeTest
	public void before() throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	
	@Test()
	public void test() throws IOException, InterruptedException {
		String path = "C:\\Users\\shibu\\Downloads\\Selenium\\Excel\\blaze.xlsx";
		FileInputStream stream = new FileInputStream(path);
		  wk = new XSSFWorkbook(stream);
		  sheet = wk.getSheetAt(0);
		  
		driver.findElement(By.linkText("Phones")).click();
		driver.findElement(By.linkText("Iphone 6 32gb")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Add to cart")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.id("cartur")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Place Order")).click();
		Thread.sleep(2000);
		
		 XSSFRow row = sheet.getRow(0);
	        XSSFCell un = row.getCell(0);
	        String var= un.getStringCellValue();
	        System.out.println(var);
	        
	        XSSFRow row1 = sheet.getRow(1);
	        XSSFCell nme = row1.getCell(1);
	        String name = nme.getStringCellValue();
	        System.out.println(name);
		driver.findElement(By.id("name")).sendKeys(name);
		Thread.sleep(2000);
		
		XSSFRow row2 = sheet.getRow(1);
        XSSFCell cnty = row2.getCell(2);
        String country = cnty.getStringCellValue();
        System.out.println(country);
        driver.findElement(By.id("country")).sendKeys(country);
        Thread.sleep(2000);
        
        XSSFRow row3 = sheet.getRow(1);
        XSSFCell cty = row3.getCell(3);
        String city = cty.getStringCellValue();
        System.out.println(city);
        driver.findElement(By.id("city")).sendKeys(city);
        Thread.sleep(2000);
        
        XSSFRow row4 = sheet.getRow(1);
        XSSFCell crd = row4.getCell(4);
        String cc = crd.getStringCellValue();
        System.out.println(cc);
    	driver.findElement(By.id("card")).sendKeys(cc);
    	Thread.sleep(2000);
    	
    	XSSFRow row5 = sheet.getRow(1);
        XSSFCell mnt = row5.getCell(5);
        String month = mnt.getStringCellValue();
        System.out.println(month);
    	driver.findElement(By.id("month")).sendKeys(month);
    	Thread.sleep(2000);
    	
    	XSSFRow row6 = sheet.getRow(1);
        XSSFCell yr = row6.getCell(6);
        String year = yr.getStringCellValue();
        System.out.println(year);
    	driver.findElement(By.id("year")).sendKeys(year);
    	Thread.sleep(2000);
    	
        driver.findElement(By.linkText("Purchase")).click();
        driver.findElement(By.linkText("OK")).click();
        Thread.sleep(2000);
		
	}
	@AfterTest
	public void after() {
		driver.quit();
	}

}
