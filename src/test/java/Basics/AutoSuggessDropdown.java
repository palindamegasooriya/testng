package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggessDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");

        driver.findElement(By.xpath("//span[text()='From']")).click();
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Sydney");
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);

    }
}

