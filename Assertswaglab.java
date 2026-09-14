package Junitn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assertswaglab {

	WebDriver driver;

@Before
public void before() {
	driver= new EdgeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
}
@Test
public void logintest() throws InterruptedException{
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	String expectedUrl="https://www.saucedemo.com/inventory.html";
	String actualUrl = driver.getCurrentUrl();
	
	assertEquals("User should be redirected to Inventory page",expectedUrl,actualUrl);
	System.out.println("assertEquals Passed : User redirected to Inventory page");
	
	assertNotEquals("User should not be the login page","https://www.saucedemo.com/",actualUrl);
	System.out.println("assertNotEquals Passed: User is not on the Login page");
	
	WebElement inventoryContainer = driver.findElement(By.id("inventory_container"));
    assertTrue("Inventory container should be displayed", inventoryContainer.isDisplayed());
    System.out.println("assertTrue is Passed : Inventory container is Dislayed");
    
    WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
    assertFalse("Menu button should not be selected by default", menuButton.isSelected());
    System.out.println("assertFalse is Passed : Menu Button not selected by Default");
    
    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    driver.findElement(By.className("shopping_cart_link")).click();
    
    WebElement product = driver.findElement(By.className("inventory_item_name"));
    assertEquals("Sauce Labs Backpack",product.getText());
    System.out.println("Product Verified");
    driver.findElement(By.id("checkout")).click();
    
    driver.findElement(By.id("first-name")).sendKeys("Ashik");
	driver.findElement(By.id("last-name")).sendKeys("Abu");
	driver.findElement(By.id("postal-code")).sendKeys("12345");
	driver.findElement(By.id("continue")).click();
	WebElement overview = driver.findElement(By.className("summary_info"));
	assertTrue("Overview is displayed",overview.isDisplayed());
	System.out.println("Overview Page is Displayed");
	
	driver.findElement(By.id("finish")).click();
	WebElement finish = driver.findElement(By.className("checkout_complete_container"));
	assertEquals("Success",finish.getText());
	System.out.println("Product Purchased successfully");
	driver.findElement(By.id("back-to-products")).click();
    
}
@After
public void after() {
	driver.quit();
}
}
