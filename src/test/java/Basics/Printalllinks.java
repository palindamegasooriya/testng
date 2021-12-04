package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Printalllinks {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");


        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());

        for(int i=0; i<allLinks.size();i++)
        {
            System.out.println("Links on page are:"+allLinks.get(i).getAttribute("href"));
            System.out.println("Links on page are:"+allLinks.get(i).getText());
        }
    }
}
