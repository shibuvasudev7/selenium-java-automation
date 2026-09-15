package testNGmaven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sunscreen {

	WebDriver driver;
	FileInputStream file;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	@BeforeTest()
	public void before() throws IOException {
		
		driver = new EdgeDriver();
		driver.get("https://weathershopper.pythonanywhere.com/");
		driver.manage().window().maximize();
		System.out.println("Browser Opened");

		file = new FileInputStream("C:\\Users\\shibu\\Downloads\\Selenium\\Excel\\sunscreen.xlsx");
		wb = new XSSFWorkbook(file);
		sheet = wb.getSheetAt(0);
	}
	
	@Test(priority = 1)
	public void test() throws InterruptedException {

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

	    driver.findElement(By.xpath("//button[text()='Buy sunscreens']")).click();
	    Thread.sleep(2000);

	    List<WebElement> names = driver.findElements(By.xpath("//p[@class='font-weight-bold top-space-10']"));
	    List<WebElement> prices = driver.findElements(By.xpath("//p[contains(text(),'Price:')]"));

	    int lowestPrice = Integer.MAX_VALUE;
	    int lowestIndex = 0;

	    for (int i = 0; i < names.size(); i++) {

	        String productName = names.get(i).getText();
	        String priceList = prices.get(i).getText();

	        String priceText = priceList.replace("Price:", "").replace("Rs.", "").trim();
	        int price = Integer.parseInt(priceText);

	        System.out.println("Product : " + productName);
	        System.out.println("Price : " + price);

	        XSSFRow excelRow = sheet.createRow(i + 1);
	        excelRow.createCell(0).setCellValue(productName);
	        excelRow.createCell(1).setCellValue(price);

	        if (price < lowestPrice) {
	            lowestPrice = price;
	            lowestIndex = i;
	        }
	    }

	    System.out.println("Cheapest Product : " + names.get(lowestIndex).getText());
	    System.out.println("Lowest Price : " + lowestPrice);

	    // Click the Add button of the cheapest product
	    names.get(lowestIndex)
	         .findElement(By.xpath("./following::button[1]"))
	         .click();

	    Thread.sleep(2000);

	    String cartCount = driver.findElement(By.xpath("/html/body/nav/ul/button")).getText();

	    System.out.println("Cart : " + cartCount);

	    if (cartCount.contains("1")) {
	        System.out.println("Cheapest Product Added Successfully");
	    } else {
	        System.out.println("Product Not Added");
	    }
	}
		@AfterTest()
		public void after() throws IOException {
			FileOutputStream output = new FileOutputStream("C:\\Users\\shibu\\Downloads\\Selenium\\Excel\\sunscreen.xlsx");
			wb.write(output);
			output.close();
			wb.close();
			driver.quit();
		
	}
	}

