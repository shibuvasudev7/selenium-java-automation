package Seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testsel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shibu\\Downloads\\Selenium\\Chrome driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
		
		//	String title=driver.getTitle();   
//	System.out.println("Title: " + title);
//	
//	String url=driver.getCurrentUrl();
//	System.out.println("url =" + url);
//	
//	Thread.sleep(2000);
//	
//	driver.navigate().to("https://google.com");
//	Thread.sleep(2000);
//	driver.navigate().back();
//	Thread.sleep(2000);
//	driver.navigate().forward();
//	Thread.sleep(2000);
//	driver.navigate().refresh();
//	Thread.sleep(2000);
//	driver.quit();     
	}

}
