package mavenslab;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Mavenslabsel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new EdgeDriver();
driver.get("https://www.saucedemo.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.id("user-name")).sendKeys("standard_user");

driver.findElement(By.id("password")).sendKeys("secret_sauce");

driver.findElement(By.id("login-button")).click();

if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")) {
    System.out.println("Login Successful");
} else {
    System.out.println("Login Failed");
}
driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
driver.findElement(By.className("shopping_cart_link")).click();
driver.findElement(By.id("checkout")).click();
Thread.sleep(2000);
driver.findElement(By.id("first-name")).sendKeys("Ashik");
driver.findElement(By.id("last-name")).sendKeys("Abu");
driver.findElement(By.id("postal-code")).sendKeys("12345");
Thread.sleep(2000);
driver.findElement(By.id("continue")).click();
driver.findElement(By.id("finish")).click();
Thread.sleep(2000);
driver.findElement(By.id("back-to-products")).click();
driver.quit();


	}

}
