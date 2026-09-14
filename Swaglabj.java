package Junitn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Swaglabj {
	WebDriver driver ;
	
	
	@Test
	public void test() throws InterruptedException {
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);	
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("continue-shopping")).click();
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		Thread.sleep(2000);
        je.executeScript("window.scroll(0,2050)");
        Thread.sleep(2000);
        
        je.executeScript("window.scrollBy(0,-500)");
        Thread.sleep(2000);
        
        je.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[6]/div[1]/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("first-name")).sendKeys("Ashik");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("Abu");
		Thread.sleep(2000);
		driver.findElement(By.id("postal-code")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);
		
	}
	@Before
	public void before() throws InterruptedException {
		
      	driver= new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	
		
		
		
	}
	@After
	public void after() { 
		driver.quit();		
		//driver.close();
    }
	
}
