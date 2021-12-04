package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");


        //Select dropdown
        WebElement dropdown =driver.findElement(By.name("employees_c"));
        Select select=new Select(dropdown);

        select.selectByValue("level1");
        Thread.sleep(2000);

        select.selectByIndex(5);
        Thread.sleep(2000);

        select.selectByVisibleText("11 - 50 employees");
    }
}
