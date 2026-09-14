package jUnitMaven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class JunitMavenpet {
	WebDriver driver;
	 @Before
	    public void before() throws Exception {

	        driver = new EdgeDriver();


	        System.out.println("Browser Opened");

	        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	        driver.manage().window().maximize();

	        Thread.sleep(2000);

	        String expectedTitle = "JPetStore Demo";
	        String actualTitle = driver.getTitle();

	        assertEquals(expectedTitle, actualTitle);

	        System.out.println("Home Page Verified Successfully");
	    }

	    @Test
	    public void test() throws Exception {

	    	 driver.findElement(By.linkText("Sign In")).click();
	         System.out.println("Sign In Page Opened");

	         assertTrue(driver.findElement(By.name("username")).isDisplayed());

	         driver.findElement(By.linkText("Register Now!")).click();
	         System.out.println("Registration Page Opened");
	         
	         assertTrue(driver.findElement(By.name("account.firstName")).isDisplayed());

	         Thread.sleep(2000);
	         
	        driver.findElement(By.name("username")).sendKeys("Ashiq123");
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
	        
	        System.out.println("User Details Entered Successfully");

	        Thread.sleep(2000);
	        WebElement lang = driver.findElement(By.xpath("/html/body/div[2]/div/form/table[3]/tbody/tr[1]/td[2]/select"));
	        Select l = new Select(lang);
	        l.selectByIndex(0);

	        WebElement cate = driver.findElement(By.xpath("/html/body/div[2]/div/form/table[3]/tbody/tr[2]/td[2]/select"));
	        Select c = new Select(cate);
	        c.selectByIndex(2);
	        
	        driver.findElement(By.name("account.listOption")).click();
	        driver.findElement(By.name("account.bannerOption")).click();


	        System.out.println("Preferences Selected");
	        
	        Thread.sleep(2000);
	        driver.findElement(By.name("newAccount")).click();
	        
	        System.out.println("Register Button Clicked");
	        
	        assertTrue(driver.findElement(By.linkText("Sign In")).isDisplayed());

	        
	        System.out.println("Registration Successful");
	    }

	    @After
	    public void after() {

	        driver.quit();
	        System.out.println("Browser Closed");
	    }

}
