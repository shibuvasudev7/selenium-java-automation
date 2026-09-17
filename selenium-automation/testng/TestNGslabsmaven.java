package testNGmaven;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGslabsmaven {
	WebDriver driver;
@BeforeTest
public void beforetest() {
		  driver = new EdgeDriver();
		  driver.get("https://www.saucedemo.com/");
		  driver.manage().window().maximize();
		  System.out.println("Browser Opened");
	  }
@Test(priority=1)
public void valid() throws InterruptedException {
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();

        assertEquals(actualUrl, expectedUrl, "Login Failed");

        System.out.println("Login Successful");
		
}
@Test(priority=2)
public void addprod() throws InterruptedException{
	  driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.className("shopping_cart_link")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Ashik");
		driver.findElement(By.id("last-name")).sendKeys("Abu");
		driver.findElement(By.id("postal-code")).sendKeys("12345");
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
	


