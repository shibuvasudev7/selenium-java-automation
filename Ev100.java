package loginTestev100;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ev100 {
	
	WebDriver driver;
	XSSFWorkbook wk;
	@BeforeTest
	public void beforetest() throws InterruptedException {
		  driver = new EdgeDriver();
		  driver.get("https://automationexercise.com/");
 	      driver.manage().window().maximize();
	     Thread.sleep(2000);
	     System.out.println("Browser Opened");
	}
	
	@Test(priority=1)
	@Ignore
	public void signup() throws InterruptedException, IOException {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a ")).click();
		
		String path = "C:\\Users\\shibu\\Downloads\\Selenium\\Excel\\Brix.xlsx";
		FileInputStream stream = new FileInputStream(path);
		   wk = new XSSFWorkbook(stream);
		  XSSFSheet sheet = wk.getSheetAt(0);
		 
		 XSSFRow row = sheet.getRow(0);
	        XSSFCell un = row.getCell(0);
	        String var= un.getStringCellValue();
	        System.out.println(var);
	        
	        XSSFRow rows = sheet.getRow(1);
	        XSSFCell uns = rows.getCell(0);
	        String name = uns.getStringCellValue();
	        System.out.println(name);
	        
	        driver.findElement(By.name("name")).sendKeys(name);
	        Thread.sleep(2000);
	        
	        XSSFRow row1 = sheet.getRow(1);
	        XSSFCell email = row1.getCell(2);
	        String mail = email.getStringCellValue();
	        System.out.println(mail);
	        
	        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys(mail);
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
	        Thread.sleep(2000);
	        
	        driver.findElement(By.id("id_gender1")).click();
	        
	        XSSFRow row2 = sheet.getRow(1);
	        XSSFCell pass = row2.getCell(1);
	        String password = pass.getStringCellValue();
	        System.out.println(password);
	        
	        driver.findElement(By.id("password")).sendKeys(password);
	        Thread.sleep(2000);
	        
	        WebElement day = driver.findElement(By.id("days"));
	        Select selectDay = new Select(day);
	        selectDay.selectByValue("10");
	        
	        WebElement month = driver.findElement(By.id("months"));
	        Select selectMonth = new Select(month);
	        selectMonth.selectByValue("5");
	        
	        WebElement year = driver.findElement(By.id("years"));
	        Select selectYear = new Select(year);
	        selectYear.selectByValue("1990");
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0, 2050)");
	        
	        
	        
	        driver.findElement(By.id("newsletter")).click();
	        driver.findElement(By.id("optin")).click();
	        
	        XSSFSheet sheet1 = wk.getSheetAt(1);
	        XSSFRow row3 = sheet1.getRow(1);
	        XSSFCell Name = row3.getCell(0);
	        String firstName = Name.getStringCellValue();
	        
	        driver.findElement(By.id("first_name")).sendKeys(firstName);
	        Thread.sleep(2000);
	        
	        XSSFRow row4 = sheet1.getRow(1);
	        XSSFCell Last = row4.getCell(1);
	        String lastName = Last.getStringCellValue();
	        
	        driver.findElement(By.id("last_name")).sendKeys(lastName);
	        
	        XSSFRow row5 = sheet1.getRow(1);
	        XSSFCell Company = row5.getCell(2);
	        String companyName = Company.getStringCellValue();

	        driver.findElement(By.id("company")).sendKeys(companyName);
	        
	        XSSFRow row6 = sheet1.getRow(1);
	        XSSFCell Address1 = row6.getCell(3);
	        String address1 = Address1.getStringCellValue();
	        
	        driver.findElement(By.id("address1")).sendKeys(address1);
	        
	        XSSFRow row7 = sheet1.getRow(1);
	        XSSFCell Address2 = row7.getCell(4);
	        String address2 = Address2.getStringCellValue();
	        
	        driver.findElement(By.id("address2")).sendKeys(address2);
	        
	       
	        js.executeScript("window.scrollBy(0, 2050)");
	        
	        WebElement country = driver.findElement(By.id("country"));
	        Select selectCountry = new Select(country);
	        selectCountry.selectByVisibleText("India");
	        
	        XSSFRow row8 = sheet1.getRow(1);
	        XSSFCell State = row8.getCell(5);
	        String stateName = State.getStringCellValue();

	        driver.findElement(By.id("state")).sendKeys(stateName);
	        
	        XSSFRow row9 = sheet1.getRow(1);
	        XSSFCell City = row9.getCell(6);
	        String cityName = City.getStringCellValue();
	        
	        driver.findElement(By.id("city")).sendKeys(cityName);
	        
	        XSSFRow row10 = sheet1.getRow(1);
	        XSSFCell Zipcode = row10.getCell(7);
	        String zipCode = Zipcode.getStringCellValue();
	        
	        driver.findElement(By.id("zipcode")).sendKeys(zipCode);
	        
	        XSSFRow row11 = sheet1.getRow(1);
	        XSSFCell Mobile = row11.getCell(8);
	        String mobileNumber = Mobile.getStringCellValue();

	        driver.findElement(By.id("mobile_number")).sendKeys(mobileNumber);
	        
	        driver.findElement(By.linkText("Create Account")).click();
	} 
	        @Test(priority=2)
	        public void login() throws InterruptedException, IOException {
	        	
	        	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a ")).click();
	        	
	        	String path = "C:\\Users\\shibu\\Downloads\\Selenium\\Excel\\Brix.xlsx";
	    		FileInputStream stream = new FileInputStream(path);
	    		   wk = new XSSFWorkbook(stream);
	    		  XSSFSheet sheet = wk.getSheetAt(0);
	    		 
	    		 XSSFRow row = sheet.getRow(0);
	    	        XSSFCell un = row.getCell(0);
	    	        String var= un.getStringCellValue();
	    	        System.out.println(var);
	    	        
	    	        XSSFRow row1 = sheet.getRow(1);
	    	        XSSFCell email = row1.getCell(2);
	    	        String mail = email.getStringCellValue();
	    	        System.out.println(mail);
	    	        
	    	        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div[1]/form/input[2]")).sendKeys(mail);
//	    	        Thread.sleep(2000);
	        
	        	    XSSFRow row2 = sheet.getRow(1);
	    	        XSSFCell pass = row2.getCell(1);
	    	        String password = pass.getStringCellValue();
	    	        System.out.println(password);
	    	        
	    	        driver.findElement(By.name("password")).sendKeys(password);
//	    	        Thread.sleep(2000);
	        	
	        	driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div[1]/form/button")).click();
	        	
	        }
	        @Test(priority=3)
	        public void addprod() throws InterruptedException {
	        	JavascriptExecutor js = (JavascriptExecutor) driver;
	        	js.executeScript("window.scrollBy(0, 2050)");
	        	
	        	driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[9]/div/div[1]/div[1]/a")).click();
	        	Thread.sleep(2000);
	        	driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[1]/div/div/div[3]/button")).click();
	        	Thread.sleep(2000);
	        js.executeScript("window.scrollBy(0, -2050)");
	        
	        try {
	        	Alert popup = driver.switchTo().alert();
	        	popup.dismiss();
	        }catch(Exception e) {
	        	System.out.println("No alert present");
	        }
	        
	        driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a")).click();
	        Thread.sleep(2000);
 
	        driver.findElement(By.id("search_product")).sendKeys("Tshirt");
	        driver.findElement(By.id("submit_search")).click();
	        driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[4]/div/div[1]/div[1]/a")).click();
	        
	            driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[3]/a")).click();
	            Thread.sleep(2000);
	            
	        	driver.findElement(By.linkText("Proceed To Checkout")).click();
	        	Thread.sleep(2000);
	        	js.executeScript("window.scrollBy(0, 2050)");
	        	driver.findElement(By.name("message")).sendKeys("Please deliver between 9 AM to 5 PM");
	        	Thread.sleep(1000);
	        	driver.findElement(By.linkText("Place Order")).click();
	        	
	        try {
	        	Alert popup = driver.switchTo().alert();
	        	popup.dismiss();
	        }catch(Exception e) {
	        	System.out.println("No alert present");
	        }
	        
	            XSSFSheet sheet1 = wk.getSheetAt(1);
	        	XSSFRow row3 = sheet1.getRow(1);
	        	XSSFCell ccname = row3.getCell(9);
	        	String cardName = ccname.getStringCellValue();
	        	driver.findElement(By.name("name_on_card")).sendKeys(cardName);
	        	
	        	XSSFRow row4 = sheet1.getRow(1);
	        	XSSFCell ccnum = row4.getCell(10);
	        	String cardNumber = ccnum.getStringCellValue();
	        	driver.findElement(By.name("card_number")).sendKeys(cardNumber);
	        	
	        	driver.findElement(By.name("cvc")).sendKeys("123");
	        	driver.findElement(By.name("expiry_month")).sendKeys("12");
	        	driver.findElement(By.name("expiry_year")).sendKeys("2025");
	        	driver.findElement(By.id("submit")).click();
	        	driver.findElement(By.linkText("Download Invoice")).click();
	        	driver.findElement(By.linkText("Continue")).click();
	        	
	        }
	        
	        @Test(priority=4)
	        public void logout() throws InterruptedException {
	        	driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
	        	
	        
	        
	        }
	        @AfterTest
	        public void aftertest() {
	        	
	        	driver.quit();
	        	System.out.println("Browser Closed");
	        }
	        
}