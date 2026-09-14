package Junitn;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;



public class Petstore {
WebDriver driver;
TakesScreenshot petstore;
@Before
public void before() throws  IOException, Exception {
  	driver= new EdgeDriver();
  	Thread.sleep(2000);
  	
  	driver.get("https://petstore.octoperf.com/actions/Catalog.action");
  	Thread.sleep(2000);
  	
  	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	petstore=(TakesScreenshot)driver;

	
	File landing = petstore.getScreenshotAs(OutputType.FILE);
    String destinationPathlanding = "C:\\Users\\shibu\\Downloads\\Selenium\\Screenshot sel\\petstore\\landing.png";
    try {
    	FileHandler.copy(landing, new File (destinationPathlanding));
    	System.out.println("Screenshot Landing Save to : "+ destinationPathlanding);
    }catch(NullPointerException e) {
    	System.out.println("Failed to Save Landing Screenshot :"+e.getMessage());
    }
}


@Test
public void test() throws IOException {
	
	driver.findElement(By.linkText("Sign In")).click();
	
	petstore=(TakesScreenshot)driver;
	File login = petstore.getScreenshotAs(OutputType.FILE);
    String destinationPathlogin = "C:\\Users\\shibu\\Downloads\\Selenium\\Screenshot sel\\petstore\\login.png";
    try {
    	FileHandler.copy(login, new File (destinationPathlogin));
    	System.out.println("Screenshot Login Save to : "+destinationPathlogin);
    }catch(NullPointerException e) {
    	System.out.println("Failed to Save Login Screenshot :"+e.getMessage());
    }
    
    driver.findElement(By.linkText("Register Now!")).click();
    
    petstore=(TakesScreenshot)driver;
	File reg = petstore.getScreenshotAs(OutputType.FILE);
    String destinationPathreg = "C:\\Users\\shibu\\Downloads\\Selenium\\Screenshot sel\\petstore\\Reg.png";
    try {
    	FileHandler.copy(reg, new File (destinationPathreg));
    	System.out.println("Screenshot Register Save to : "+destinationPathreg);
    }catch(IOException e) {
    	System.out.println("Failed to Save Register Screenshot :"+e.getMessage());
    }
    
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
  WebElement lang = driver.findElement(By.xpath("/html/body/div[2]/div/form/table[3]/tbody/tr[1]/td[2]/select"));
  Select l = new Select(lang);
  l.selectByIndex(0);
  WebElement cate = driver.findElement(By.xpath("/html/body/div[2]/div/form/table[3]/tbody/tr[2]/td[2]/select"));
  Select c = new Select(cate);
  c.selectByIndex(2);
  driver.findElement(By.name("account.listOption")).click();
  driver.findElement(By.name("account.bannerOption")).click();
  
  petstore=(TakesScreenshot)driver;
	File detail = petstore.getScreenshotAs(OutputType.FILE);
   String destinationPathdetail = "C:\\Users\\shibu\\Downloads\\Selenium\\Screenshot sel\\petstore\\Details.png";
   try {
   	FileHandler.copy(detail, new File (destinationPathdetail));
   	System.out.println("Screenshot Details Save to : "+destinationPathdetail);
   }catch(IOException e) {
   	System.out.println("Failed to Save Details Screenshot :"+e.getMessage());
   } 
  
  driver.findElement(By.name("newAccount")).click();
  
}

@After
public void after() {
	driver.quit();
}
}
