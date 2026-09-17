package testngpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pettestng {
WebDriver driver;
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
public void userdetails() {
	
	 driver.findElement(By.name("username")).sendKeys("Ashiq");
	    driver.findElement(By.name("password")).sendKeys("12345");   
	    driver.findElement(By.name("repeatedPassword")).sendKeys("12345");
	    
	    driver.findElement(By.name("account.firstName")).sendKeys("Ashiq");
	    driver.findElement(By.name("account.lastName")).sendKeys("Abu");
	    driver.findElement(By.name("account.email")).sendKeys("ashiqa123@gmail.com");
	    driver.findElement(By.name("account.phone")).sendKeys("9632587410");
	    
	    driver.findElement(By.name("account.address1")).sendKeys("145 Main Street");
	    driver.findElement(By.name("account.address2")).sendKeys("Beach Road");
	    driver.findElement(By.name("account.city")).sendKeys("Trivandrum");
	    driver.findElement(By.name("account.state")).sendKeys("Kerala");
	    driver.findElement(By.name("account.zip")).sendKeys("698563");
	    driver.findElement(By.name("account.country")).sendKeys("India");
	    
	    System.out.println("User Details Entered");
}

@Test(priority=3)
public void pref() {
	

	  WebElement lang = driver.findElement(By.xpath("/html/body/div[2]/div/form/table[3]/tbody/tr[1]/td[2]/select"));
	  Select l = new Select(lang);
	  l.selectByIndex(0);
	  WebElement cate = driver.findElement(By.xpath("/html/body/div[2]/div/form/table[3]/tbody/tr[2]/td[2]/select"));
	  Select c = new Select(cate);
	  c.selectByIndex(3);
	  driver.findElement(By.name("account.listOption")).click();
	  driver.findElement(By.name("account.bannerOption")).click();
	  System.out.println("Preference is Selected");
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