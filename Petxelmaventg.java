package testNGmaven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Petxelmaventg {
	WebDriver driver;
	XSSFWorkbook wk;
	XSSFSheet sheet;

	@BeforeTest
	public void beforeng() {
		 driver = new EdgeDriver();
		 driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		 driver.manage().window().maximize();
		 System.out.println("Browser Opened");
		}

	@Test(priority=1)
	public void registration() {
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.linkText("Register Now!")).click();
		System.out.println("Registration Page Opened");
	}

	@Test(priority=2)
	public void userdetails() throws IOException, InterruptedException {
		
		String path = "C:\\Users\\shibu\\Downloads\\Selenium\\Excel\\petstore.xlsx";
		FileInputStream stream = new FileInputStream(path);
		  wk = new XSSFWorkbook(stream);
		  sheet = wk.getSheetAt(0);
		 
		 XSSFRow row = sheet.getRow(0);
	        XSSFCell un = row.getCell(0);
	        String var= un.getStringCellValue();
	        System.out.println(var);
	        
	        XSSFRow rows = sheet.getRow(2);
	        XSSFCell uns = rows.getCell(0);
	        String user = uns.getStringCellValue();
	        System.out.println(user);
		 driver.findElement(By.name("username")).sendKeys(user);
		 Thread.sleep(2000);
		 
		 XSSFRow row1 = sheet.getRow(2);
	        XSSFCell ps = row1.getCell(1);
	        String pass1 = ps.getStringCellValue();
	        System.out.println(pass1);
		    driver.findElement(By.name("password")).sendKeys(pass1);   
		    Thread.sleep(2000);
		    
		    XSSFRow row2 = sheet.getRow(2);
	        XSSFCell ps2 = row2.getCell(2);
	        String pass2 = ps2.getStringCellValue();
	        System.out.println(pass2);
		    driver.findElement(By.name("repeatedPassword")).sendKeys(pass2);
		    Thread.sleep(2000);
		    
		    XSSFRow row3 = sheet.getRow(2);
	        XSSFCell fn = row3.getCell(3);
	        String fnm = fn.getStringCellValue();
	        System.out.println(fnm);
		    driver.findElement(By.name("account.firstName")).sendKeys(fnm);
		    Thread.sleep(2000);
		    
		    XSSFRow row4 = sheet.getRow(2);
	        XSSFCell ln = row4.getCell(4);
	        String lnm = ln.getStringCellValue();
	        System.out.println(lnm);
		    driver.findElement(By.name("account.lastName")).sendKeys(lnm);
		    Thread.sleep(2000);
		    
		    XSSFRow row5 = sheet.getRow(2);
	        XSSFCell em = row5.getCell(5);
	        String email = em.getStringCellValue();
	        System.out.println(email);
		    driver.findElement(By.name("account.email")).sendKeys(email);
		    Thread.sleep(2000);
		    
		    XSSFRow row6 = sheet.getRow(1);
	        XSSFCell pn = row6.getCell(6);
	        String pne = pn.getStringCellValue();
	        System.out.println(pne);
		    driver.findElement(By.name("account.phone")).sendKeys(pne);
		    Thread.sleep(2000);
		    
		    XSSFRow row7 = sheet.getRow(2);
	        XSSFCell ad1 = row7.getCell(7);
	        String ads1 = ad1.getStringCellValue();
	        System.out.println(ads1);
		    driver.findElement(By.name("account.address1")).sendKeys(ads1);
		    Thread.sleep(2000);
		    
		    XSSFRow row8 = sheet.getRow(2);
	        XSSFCell ad2 = row8.getCell(8);
	        String ads2 = ad2.getStringCellValue();
	        System.out.println(ads2);
		    driver.findElement(By.name("account.address2")).sendKeys(ads2);
		    Thread.sleep(2000);
		    
		    XSSFRow row9 = sheet.getRow(2);
	        XSSFCell ct = row9.getCell(9);
	        String city = ct.getStringCellValue();
	        System.out.println(city);
		    driver.findElement(By.name("account.city")).sendKeys(city);
		    Thread.sleep(2000);
		    
		    XSSFRow row10 = sheet.getRow(2);
	        XSSFCell ste = row10.getCell(10);
	        String state = ste.getStringCellValue();
	        System.out.println(state);
	        driver.findElement(By.name("account.state")).sendKeys(state);
	        Thread.sleep(2000);
	        
	        XSSFRow row11 = sheet.getRow(2);
	        XSSFCell zp = row11.getCell(11);
	        String zip = zp.getStringCellValue();
	        System.out.println(zip);
		    driver.findElement(By.name("account.zip")).sendKeys(zip);
		    Thread.sleep(2000);
		    
		    XSSFRow row12 = sheet.getRow(2);
	        XSSFCell cty = row12.getCell(12);
	        String cntry = cty.getStringCellValue();
	        System.out.println(cntry);
		    driver.findElement(By.name("account.country")).sendKeys(cntry);
		    
		    Thread.sleep(2000);
		    
		    System.out.println("User Details Entered");
	}

	@Test(priority=3)
	public void pref() throws InterruptedException {
		

		  WebElement lang = driver.findElement(By.xpath("/html/body/div[2]/div/form/table[3]/tbody/tr[1]/td[2]/select"));
		  Select l = new Select(lang);
		  l.selectByIndex(0);
		  Thread.sleep(2000);
		  WebElement cate = driver.findElement(By.xpath("/html/body/div[2]/div/form/table[3]/tbody/tr[2]/td[2]/select"));
		  Select c = new Select(cate);
		  c.selectByIndex(3);
		  Thread.sleep(2000);
		  driver.findElement(By.name("account.listOption")).click();
		  driver.findElement(By.name("account.bannerOption")).click();
		  System.out.println("Preference is Selected");
		  Thread.sleep(2000);
	}

	@Test(priority=4)
	public void createaccount() {
		
		  driver.findElement(By.name("newAccount")).click();
		  System.out.println("New Account Created");
	}

	@AfterTest
	public void after() {
		driver.quit();
		System.out.println("Browser Closed");
	}
}
