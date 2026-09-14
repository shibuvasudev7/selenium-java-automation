package Seleniumtest;




import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class selscreenshot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.msedge.driver", "C:\\\\Users\\\\shibu\\\\Downloads\\\\Selenium\\\\edge driver\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		 TakesScreenshot screenshot = (TakesScreenshot)driver;
		    
		    File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
		    String destinationPath = "C:\\Users\\shibu\\Downloads\\Selenium\\Screenshot sel\\login.png";
		    try {
		    	FileHandler.copy(sourcefile, new File (destinationPath));
		    	System.out.println("Screenshot Login Save to : "+destinationPath);
		    }catch(IOException e) {
		    	System.out.println("Failed to Save Screenshot :"+e.getMessage());
		    }
		    driver.findElement(By.id("user-name")).sendKeys("standard_user");
			Thread.sleep(2000);
			
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(2000);
			
			driver.findElement(By.id("login-button")).click();
			
			File home = screenshot.getScreenshotAs(OutputType.FILE);
		    String destinationPathhome = "C:\\Users\\shibu\\Downloads\\Selenium\\Screenshot sel\\home.png";
		    try {
		    	FileHandler.copy(home, new File (destinationPathhome));
		    	System.out.println("Screenshot Home Save to : "+destinationPathhome);
		    }catch(IOException e) {
		    	System.out.println("Failed to Save  Screenshot :"+e.getMessage());
		    }
		    

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
			
			File cart = screenshot.getScreenshotAs(OutputType.FILE);
		    String destinationPathcart = "C:\\Users\\shibu\\Downloads\\Selenium\\Screenshot sel\\cart.png";
		    try {
		    	FileHandler.copy(cart, new File (destinationPathcart));
		    	System.out.println("Screenshot Cart Save to : "+destinationPathcart);
		    }catch(IOException e) {
		    	System.out.println("Failed to Save Cart Screenshot :"+e.getMessage());
		    }
			
			driver.findElement(By.id("checkout")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("first-name")).sendKeys("Ashik");
			Thread.sleep(2000);
			driver.findElement(By.id("last-name")).sendKeys("Abu");
			Thread.sleep(2000);
			driver.findElement(By.id("postal-code")).sendKeys("12345");
			Thread.sleep(2000);
			
			File details = screenshot.getScreenshotAs(OutputType.FILE);
		    String destinationPathdetails = "C:\\Users\\shibu\\Downloads\\Selenium\\Screenshot sel\\details.png";
		    try {
		    	FileHandler.copy(details, new File (destinationPathdetails));
		    	System.out.println("Screenshot details Save to : "+destinationPathdetails);
		    }catch(IOException e) {
		    	System.out.println("Failed to Save details Screenshot :"+e.getMessage());
		    }
			
			driver.findElement(By.id("continue")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("finish")).click();
			Thread.sleep(2000);
			File checkout = screenshot.getScreenshotAs(OutputType.FILE);
		    String destinationPathcheckout = "C:\\Users\\shibu\\Downloads\\Selenium\\Screenshot sel\\checkout.png";
		    try {
		    	FileHandler.copy(checkout, new File (destinationPathcheckout));
		    	System.out.println("Screenshot checkout Save to : "+destinationPathcheckout);
		    }catch(IOException e) {
		    	System.out.println("Failed to Save checkout Screenshot :"+e.getMessage());
		    }
			driver.findElement(By.id("back-to-products")).click();
			Thread.sleep(2000);
			
			driver.quit();
			
	}
}
