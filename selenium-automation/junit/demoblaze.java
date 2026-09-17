package Junitn;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class demoblaze {

	WebDriver driver;
	JavascriptExecutor je;
	
	@Before
	public void before() throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
@Test
    public void assersionegtest() throws InterruptedException {
	String expectedTitle = "STORE";
	String actualTitle = driver.getTitle();
	assertEquals("Page should be matched",expectedTitle,actualTitle);
		System.out.println("Page is matched "+actualTitle);

		je = (JavascriptExecutor)driver;
	
		 je.executeScript("window.scrollBy(0,500)");
	        Thread.sleep(2000);
		
	boolean isElementDisplayed = actualTitle.isEmpty();
	assertFalse("Title should not be Empty",isElementDisplayed);
	System.out.println("Title is not Empty");
	
	WebElement mobilelink = driver.findElement(By.linkText("Phones"));
	assertNotNull("Phones link should not be Null ",mobilelink);
	System.out.println("Phones link is Valid");
	
	WebElement category = driver.findElement(By.linkText("CATEGORIES"));
	String title = category.getAttribute("home");
	assertNull("Element should be Null",title);
	System.out.println("Null Element is Null");
	
	driver.findElement(By.className("card-title")).click();
	driver.findElement(By.linkText("Add to cart")).click();
	driver.findElement(By.id("cartur")).click();
	driver.findElement(By.linkText("Place Order")).click();
	driver.findElement(By.id("name")).sendKeys("Ashik");
	driver.findElement(By.id("country")).sendKeys("India");
	driver.findElement(By.id("city")).sendKeys("TVM");
	driver.findElement(By.id("card")).sendKeys("123456987012");
	driver.findElement(By.id("month")).sendKeys("JUNE");
	driver.findElement(By.id("year")).sendKeys("2026");
    driver.findElement(By.linkText("Purchase")).click();
    driver.findElement(By.linkText("OK")).click();
    Thread.sleep(2000);
    }
	
	@After
	public void after() {
		driver.quit();
	}
	
	
	
}
