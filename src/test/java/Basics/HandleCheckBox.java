package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HandleCheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");

        //Scroll down page to particuler element
        WebElement radio=driver.findElement(By.id("doi0"));
        Actions action = new Actions(driver);
        action.moveToElement(radio);
        action.perform();

        //Click on check box
        driver.findElement(By.name("interest_market_c")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("interest_market_c")).click();

        //count number of check boxex.
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
    }
}
