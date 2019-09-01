import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHR {
    protected static WebDriver driver;
    public static void main(String[]args){
        //setting up a path to access crome webdriver
        System.setProperty("webdriver.chrome.driver","src\\BrowserDrivers\\chromedriver.exe");
        //open the browser
        driver= new ChromeDriver();
        // maximise the browser window screen
        driver.manage().window().fullscreen();
        // set implictly wait for driver object
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        // to open the website
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //click on username
        driver.findElement(By.id("txtUsername")).sendKeys("Admin ");
        // to enter the password
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        // to click on LOGIN button
        driver.findElement(By.className("button")).click();
        // to logout click on welcome admin
        driver.findElement(By.id("welcome")).click();
        //select logout and click

        //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.linkText("Logout")).click();


    }
}
