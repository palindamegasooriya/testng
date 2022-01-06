package PageObjectTest;
import Pageobjectpages.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

    private static WebDriver driver = null;

    public static void main(String[] args) {
        //WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.lk/");

        //Enter search in text
        GoogleSearchPage.text_box_search(driver).sendKeys("Automation step by step");

        //Click button
        GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);

    }
}
