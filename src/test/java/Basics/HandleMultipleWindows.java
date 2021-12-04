package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandleMultipleWindows {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/ap/?ir=1");
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[5]/div/div[2]/div/div[1]/div/div[1]/div/a")).click();

        Set<String> windowhandles=driver.getWindowHandles();;
        System.out.println(windowhandles);

        Iterator<String> itorator = windowhandles.iterator();
        String parentwindow = itorator.next();
        String childwindow = itorator.next();

        //to go to child window
        driver.switchTo().window(childwindow);

        driver.findElement(By.name("UserFirstName")).sendKeys("palinda");
        driver.findElement(By.name("UserLastName")).sendKeys("Megasooriya");

        //go to parent window
        driver.switchTo().window(parentwindow);
    }
}
