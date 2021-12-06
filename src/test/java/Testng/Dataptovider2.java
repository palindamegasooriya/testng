package Testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataptovider2 {

    @DataProvider
    public Object[][] dataSet()
    {
        //multi dimentional object array

        return new Object[][]{
                {"standard_user","secret_sauce"},
                {"locked_out_user","secret_sauce"},
                {"problem_user","secret_sauce"},
                {"performance_glitch_user","secret_sauce"}


        };


    }

    @Test(dataProvider = "dataSet")
    public void test(String username, String pwd) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(pwd);
        driver.findElement(By.id("login-button")).click();
        driver.close();

    }
}
