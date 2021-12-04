package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Firsttest {



    public static void main(String[] args) {
        WebDriver driver;
        //System.setProperty("webdriver.chrome.driver","D:\\test automation\\practice codes\\src\\main\\resources\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
//        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("0710644166");
//        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("aludeniya");
//        driver.findElement(By.xpath("//*[@id=\"u_0_h_lF\"]")).click();
        WebElement passwordField = driver.findElement(By.id("password"));
        driver.findElement(with(By.tagName("input")).above(passwordField)).sendKeys("Testing");
        driver.findElement(with(By.tagName("input")).below(passwordField)).click();


    }
}
