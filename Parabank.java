package testNGmaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Parabank {

	WebDriver driver;

	@BeforeTest
	public void before() {

		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		System.out.println("Browser Opened");
	}

	@Test(priority = 1)
	@Ignore
	public void reg() throws InterruptedException, IOException {
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);

		String pth = "C:\\Users\\shibu\\Downloads\\Selenium\\Excel\\Writeexcel.xlsx";
		FileInputStream stm = new FileInputStream(pth);
		XSSFWorkbook wbk = new XSSFWorkbook(stm);
		XSSFSheet sht = wbk.getSheetAt(0);

		XSSFRow row = sht.getRow(0);
		XSSFCell un = row.getCell(0);
		String var = un.getStringCellValue();
		System.out.println(var);

		XSSFRow row1 = sht.getRow(1);
		XSSFCell dt1 = row1.getCell(0);
		String fsn = dt1.getStringCellValue();
		System.out.println(fsn);
		driver.findElement(By.id("customer.firstName")).sendKeys(fsn);

		XSSFRow row2 = sht.getRow(1);
		XSSFCell dt2 = row2.getCell(1);
		String lsn = dt2.getStringCellValue();
		System.out.println(lsn);
		driver.findElement(By.id("customer.lastName")).sendKeys(lsn);

		XSSFRow row3 = sht.getRow(1);
		XSSFCell dt3 = row3.getCell(2);
		String address = dt3.getStringCellValue();
		System.out.println(address);
		driver.findElement(By.id("customer.address.street")).sendKeys(address);

		XSSFRow row4 = sht.getRow(1);
		XSSFCell dt4 = row4.getCell(3);
		String city = dt4.getStringCellValue();
		System.out.println(city);
		driver.findElement(By.id("customer.address.city")).sendKeys(city);

		XSSFRow row5 = sht.getRow(1);
		XSSFCell dt5 = row5.getCell(4);
		String state = dt5.getStringCellValue();
		System.out.println(state);
		driver.findElement(By.id("customer.address.state")).sendKeys(state);

		XSSFRow row6 = sht.getRow(1);
		XSSFCell dt6 = row6.getCell(5);
		String zipcode = dt6.getStringCellValue();
		System.out.println(zipcode);
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(zipcode);

		XSSFRow row7 = sht.getRow(1);
		XSSFCell dt7 = row7.getCell(6);
		String phone = dt7.getStringCellValue();
		System.out.println(phone);
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(phone);

		XSSFRow row8 = sht.getRow(1);
		XSSFCell dt8 = row8.getCell(7);
		String ssn = dt8.getStringCellValue();
		System.out.println(ssn);
		driver.findElement(By.id("customer.ssn")).sendKeys(ssn);

		XSSFRow row9 = sht.getRow(1);
		XSSFCell dt9 = row9.getCell(8);
		String username = dt9.getStringCellValue();
		System.out.println(username);
		driver.findElement(By.id("customer.username")).sendKeys(username);

		XSSFRow row10 = sht.getRow(1);
		XSSFCell dt10 = row10.getCell(9);
		String password = dt10.getStringCellValue();
		System.out.println(password);
		driver.findElement(By.id("customer.password")).sendKeys(password);

		XSSFRow row11 = sht.getRow(1);
		XSSFCell dt11 = row11.getCell(10);
		String confirm = dt11.getStringCellValue();
		System.out.println(confirm);
		driver.findElement(By.id("repeatedPassword")).sendKeys(confirm);

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input")).click();

		System.out.println("Registration Completed");
	}

	@Test(priority = 2)
	public void login() throws IOException, InterruptedException {

		String pth = "C:\\Users\\shibu\\Downloads\\Selenium\\Excel\\Writeexcel.xlsx";
		FileInputStream stm = new FileInputStream(pth);
		XSSFWorkbook wbk = new XSSFWorkbook(stm);
		XSSFSheet sht = wbk.getSheetAt(0);

		XSSFRow row9 = sht.getRow(1);
		XSSFCell dt9 = row9.getCell(8);
		String username = dt9.getStringCellValue();
		System.out.println(username);
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);

		XSSFRow row10 = sht.getRow(1);
		XSSFCell dt10 = row10.getCell(9);
		String password = dt10.getStringCellValue();
		System.out.println(password);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input")).click();

		System.out.println("Login Successful");
	}

	@Test(priority = 3)
	public void ac() throws InterruptedException {

		driver.findElement(By.linkText("Open New Account")).click();

		WebElement acnt = driver.findElement(By.id("type"));
		Select a = new Select(acnt);
		a.selectByIndex(0);
		Thread.sleep(2000);

		WebElement dpct = driver.findElement(By.id("fromAccountId"));
		Select d = new Select(dpct);
		d.selectByIndex(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/div/input")).click();

		System.out.println("Account Creation  Completed");
	}

	@Test(priority = 4)
	public void transfer() throws InterruptedException  {

		driver.findElement(By.linkText("Transfer Funds")).click();
		driver.findElement(By.id("amount")).sendKeys("10");

		try {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			 
			         WebElement fac = wait.until(ExpectedConditions.elementToBeClickable(By.id("fromAccountId")));
			     	Select fa = new Select(fac);
//			     	fa.selectByVisibleText("18339");
			     	fa.selectByIndex(0);
//			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/div[1]/select[1]/option[1]")).click();
			 System.out.println("From Account dropdown selected successfully");
		} catch (NoSuchElementException e) {
		    System.out.println("Unable to select From Account dropdown: " + e.getMessage());
		}

		WebElement tac = driver.findElement(
				By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/div[1]/select[2]"));
		Select ta = new Select(tac);
		ta.selectByIndex(0);
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/div[2]/input")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);

		System.out.println("Amount Transfered Completed");
	}

	@Test(priority = 5)
	public void history() throws InterruptedException {

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[1]/a")).click();

		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByIndex(7);

		WebElement type = driver.findElement(By.id("transactionType"));
		Select ty = new Select(type);
		ty.selectByIndex(1);
		Thread.sleep(3000);

		try {
		    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/a")).click();
		    System.out.println("Transaction link clicked successfully");
		} catch (NoSuchElementException e) {
		    System.out.println("Unable to click transaction link: " + e.getMessage());
		}
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/table/tbody/tr/td[2]/a")).click();
		Thread.sleep(2000);
		System.out.println("Transaction Details");
		driver.findElement(By.linkText("Log Out")).click();
		System.out.println("Logged Out");
	}

	@AfterTest()
	public void after() throws IOException {

		String pth = "C:\\Users\\shibu\\Downloads\\Selenium\\Excel\\Writeexcel.xlsx";
		FileInputStream stm = new FileInputStream(pth);
		XSSFWorkbook wbk = new XSSFWorkbook(stm);
		XSSFSheet sht = wbk.getSheetAt(0);

		XSSFRow row = sht.getRow(0);
		XSSFCell un = row.getCell(1);
		String var = un.getStringCellValue();
		System.out.println(var);

		XSSFCell dt12 = row.createCell(12);
		dt12.setCellValue("pass");

		FileOutputStream fos = new FileOutputStream(pth);
		wbk.write(fos);

		driver.quit();
	}

}