package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleRadioButton {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.singaporeair.com/en_UK/lk/home#/book/bookflight");


        //Click on Radio Button
        WebElement radio1= driver.findElement(By.id("bookFlights"));
        WebElement radio2= driver.findElement(By.id("redeemFlights"));
        radio1.click();
        radio2.click();
        System.out.println(radio1.isSelected());
        System.out.println(radio2.isSelected());

        //count number of Radio Button.
        System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());


    }
}
