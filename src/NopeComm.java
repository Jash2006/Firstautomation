import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NopeComm {
    protected static WebDriver driver;
    public static void main(String[]args){
        //setting a path to access the crome webdriver
        System.setProperty("webdriver.chrome.driver","src\\BrowserDrivers\\chromedriver.exe");
        //open the browser
        driver= new ChromeDriver();
        // to maximise the browser window screen
        driver.manage().window().fullscreen();
        // set implicitly wait driver object
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // to open the website
        driver.get("https://demo.nopcommerce.com/");
        // to click on login
        driver.findElement(By.className("ico-login")).click();
        // to enter the email
        driver.findElement(By.id("Email")).sendKeys("mlv_x@yahoo.com");
        // to enter the password
        driver.findElement(By.id("Password")).sendKeys("Jash2006");

        // to click on LOGIN button
        driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
        // to click on nopp commerce logo
        driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).click();
        // to select the Apple macbook image
        driver.findElement(By.xpath("//img[@title=\"Show details for Apple MacBook Pro 13-inch\"]")).click();
        // to select email a friend
        driver.findElement(By.xpath("//input[@value=\"Email a friend\"]")).click();
        // to enter friend's name
        driver.findElement(By.id("FriendEmail")).sendKeys("manoj.vaghasiya2007@gmail.com");
        // to enter personal message to friend
        driver.findElement(By.id("PersonalMessage")).sendKeys("Thanks");
        // to click on SEND EMAIL button
        driver.findElement(By.xpath("//input[@value='Send email']")).click();
        //to close the browser
        driver.close();
    }
}

