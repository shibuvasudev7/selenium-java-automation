package testNGmaven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logintest {

    WebDriver driver;

    String username = "Ashiq17";
    String pass = "12345";

    @BeforeTest
    public void before() {

        driver = new EdgeDriver();
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        driver.manage().window().maximize();

        System.out.println("Browser Opened");
    }

    @Test(priority = 1)
    public void register() {

        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.linkText("Register Now!")).click();

        System.out.println("Registration Page Opened");
    }

    @Test(priority = 2)
    public void userdetails() throws InterruptedException {

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(pass);
        driver.findElement(By.name("repeatedPassword")).sendKeys(pass);

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

        Thread.sleep(2000);

        System.out.println("User Details Entered");
    }

    @Test(priority = 3)
    public void pref() throws InterruptedException {

        WebElement lang = driver.findElement(By.xpath("/html/body/div[2]/div/form/table[3]/tbody/tr[1]/td[2]/select"));
        Select l = new Select(lang);
        l.selectByIndex(0);

        Thread.sleep(2000);

        WebElement cate = driver.findElement(By.xpath("/html/body/div[2]/div/form/table[3]/tbody/tr[2]/td[2]/select"));
        Select c = new Select(cate);
        c.selectByIndex(3);

        Thread.sleep(2000);

        driver.findElement(By.name("account.listOption")).click();
        driver.findElement(By.name("account.bannerOption")).click();

        System.out.println("Preferences Selected");

        Thread.sleep(2000);

        driver.findElement(By.name("newAccount")).click();

        System.out.println("New Account Created");
    }

    @Test(priority = 4)
    public void login() throws InterruptedException, IOException {

        driver.findElement(By.linkText("Sign In")).click();

        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(username);

        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(pass);

        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[2]/div/form/input")).click();

        String status;

        if (driver.findElement(By.id("WelcomeContent")).isDisplayed()) {
            status = "PASS";
            System.out.println("Login Successful");
        } else {
            status = "FAIL";
            System.out.println("Login Failed");
        }

        String pth = "C:\\Users\\shibu\\Downloads\\Selenium\\Excel\\petstore.xlsx";

        FileInputStream stm = new FileInputStream(pth);
        XSSFWorkbook wbk = new XSSFWorkbook(stm);
        XSSFSheet sht = wbk.getSheetAt(1);

        int rowNum = sht.getLastRowNum() + 1;

        XSSFRow row = sht.createRow(rowNum);

        row.createCell(0).setCellValue(username);
        row.createCell(1).setCellValue(pass);
        row.createCell(2).setCellValue(status);

        FileOutputStream fos = new FileOutputStream(pth);

        wbk.write(fos);

        fos.close();
        wbk.close();
        stm.close();

        System.out.println("Username : " + username);
        System.out.println("Password : " + pass);
        System.out.println("Status : " + status);
        System.out.println("Data Written to Excel Successfully");

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/a[4]/img")).click();
        driver.findElement(By.linkText("Sign Out")).click();

        System.out.println("Logout Successful");
    }

    @AfterTest
    public void after() {

        driver.quit();

        System.out.println("Browser Closed");
    }
}