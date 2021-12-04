package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.xml.ws.Action;

public class KeyBordEvent {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://extendsclass.com/text-compare.html");

        WebElement sourcetext=driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[5]/pre"));
        Actions action=new Actions(driver);
        Thread.sleep(2000);
        action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();

        WebElement targettext=driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[6]/pre"));
        Thread.sleep(2000);
        action.keyDown(targettext,Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();

    }
}
