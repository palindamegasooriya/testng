package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class MethodOfWebDriverInterface {

    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.navigate().to("https://www.google.lk/");
        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        String url=driver.getCurrentUrl();
        System.out.println(url);

        String title=driver.getTitle();
        System.out.println(title);

        String pagesource=driver.getPageSource();
        System.out.println(pagesource);

         driver.findElement(By.id("user-name")).sendKeys("standard_user");
         driver.findElement(By.id("password")).sendKeys("secret_sauce");
         driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
         List<WebElement> webelements =driver.findElements(By.xpath("//div[@class=\'inventory_list\']/div"));
        System.out.println(webelements);


        driver.close();

    }
}
