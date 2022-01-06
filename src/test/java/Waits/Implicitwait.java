package Waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Implicitwait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        //Implicitly wait until 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement electronics = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));

        //Creating object of an Actions class
        Actions action = new Actions(driver);

        //Performing the mouse hover action on the target element.
        action.moveToElement(electronics).perform();

        WebElement cellphone = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));

        //This is not good practice
        //Thread.sleep(2000);

        cellphone.click();
    }
}
