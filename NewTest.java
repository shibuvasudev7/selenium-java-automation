package testngpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
	TakesScreenshot ss;
	
  @Test(priority=1)
  public void valid() throws InterruptedException, IOException {
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[2]/div")).isDisplayed()){
		System.out.println("Login Successful");
		
		ss=(TakesScreenshot)driver;
		File sourcefile = ss.getScreenshotAs(OutputType.FILE);
		String destvalid= "C:\\Users\\shibu\\Downloads\\Selenium\\Screenshot sel\\SwaglabTestNg\\Success.png";
		FileHandler.copy(sourcefile, new File (destvalid));
  }else {
	  System.out.println("Login Failed");
	  
	  ss=(TakesScreenshot)driver;
		File sourcefile = ss.getScreenshotAs(OutputType.FILE);
		String destvalid= "C:\\Users\\shibu\\Downloads\\Selenium\\Screenshot sel\\SwaglabTestNg\\Failed.png";
		FileHandler.copy(sourcefile, new File (destvalid));
  }
  }
  @Test(priority=2)
  public void addprod() throws InterruptedException, IOException{
	  driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.className("shopping_cart_link")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Ashik");
		driver.findElement(By.id("last-name")).sendKeys("Abu");
		driver.findElement(By.id("postal-code")).sendKeys("12345");
		Thread.sleep(2000);
		
		 ss=(TakesScreenshot)driver;
			File sourcefile = ss.getScreenshotAs(OutputType.FILE);
			String destvalid= "C:\\Users\\shibu\\Downloads\\Selenium\\Screenshot sel\\SwaglabTestNg\\Invalid Details.png";
			FileHandler.copy(sourcefile, new File (destvalid));
			
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("finish")).click();
			
			ss=(TakesScreenshot)driver;
			File src = ss.getScreenshotAs(OutputType.FILE);
			String dest= "C:\\Users\\shibu\\Downloads\\Selenium\\Screenshot sel\\SwaglabTestNg\\Invalid purchase successful.png";
			FileHandler.copy(src, new File (dest));
			driver.findElement(By.id("back-to-products")).click();
			
  }
  @Test(priority=3)
  public void logout() throws InterruptedException, IOException {
	  driver.findElement(By.id("react-burger-menu-btn")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("logout_sidebar_link")).click();
	  Thread.sleep(2000);
	  if(driver.findElement(By.id("login-button")).isDisplayed()) {
		  System.out.println("Logout Successful");
		  ss=(TakesScreenshot)driver;
			File sourcefile = ss.getScreenshotAs(OutputType.FILE);
			String destvalid= "C:\\Users\\shibu\\Downloads\\Selenium\\Screenshot sel\\SwaglabTestNg\\Logout.png";
			FileHandler.copy(sourcefile, new File (destvalid));
		  
	  }else {
		  System.out.println("Logout failed");
		  ss=(TakesScreenshot)driver;
			File sourcefile = ss.getScreenshotAs(OutputType.FILE);
			String destvalid= "C:\\Users\\shibu\\Downloads\\Selenium\\Screenshot sel\\SwaglabTestNg\\Logout Failed.png";
			FileHandler.copy(sourcefile, new File (destvalid));
	  }
	  
  }
@Test(priority=4)
	public void invalid() throws InterruptedException, IOException {
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("Invalidpass");
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	if(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3")).isDisplayed()) {
		System.out.println("Invalid Login Passed");
		 ss=(TakesScreenshot)driver;
			File sourcefile = ss.getScreenshotAs(OutputType.FILE);
			String destvalid= "C:\\Users\\shibu\\Downloads\\Selenium\\Screenshot sel\\SwaglabTestNg\\Invalid Success.png";
			FileHandler.copy(sourcefile, new File (destvalid));
	}else {
		System.out.println("Invalid Login Failed");
		  
		  ss=(TakesScreenshot)driver;
			File sourcefile = ss.getScreenshotAs(OutputType.FILE);
			String destvalid= "C:\\Users\\shibu\\Downloads\\Selenium\\Screenshot sel\\SwaglabTestNg\\Invalid Failed.png";
			FileHandler.copy(sourcefile, new File (destvalid));
	}
	
}
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new EdgeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  System.out.println("Browser Opened");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  System.out.println("Browser Closed");
  }

}
