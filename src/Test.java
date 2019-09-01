import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {
    protected static WebDriver driver;
    public static void main(String[]args){
        //Setting a path to access the crome webdriver
        System.setProperty("webdriver.chrome.driver","src\\BrowserDrivers\\chromedriver.exe");

        //open the browser
        driver=new ChromeDriver();

        // to maximise the browser window screen
        driver.manage().window().fullscreen();
        // set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        //open the website
        driver.get("https://demo.nopcommerce.com/");

        //click on register button
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        //enter the first name
        driver.findElement(By.id("FirstName")).sendKeys("Manoj");
        //enter the last name
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Vaghasiya");

        //enter the email address
        driver.findElement(By.name("Email")).sendKeys("mlv_x@yahoo.com");
        //close the browser window
        //driver.close();
        //driver.quit();
        // to enter the password
        driver.findElement(By.name("Password")).sendKeys("Jash2006");
        // to enter confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Jash2006");
        // to click on register to finish the registration
        driver.findElement(By.name("register-button")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       //to close the browser
        driver.quit();


    }
}
