package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

        //switch to child frame
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("/html/body/button")).click();

        //handle alert popup
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Palinda");
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        driver.switchTo().alert().accept();

        //switch to parent frame
        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());

    }
}
