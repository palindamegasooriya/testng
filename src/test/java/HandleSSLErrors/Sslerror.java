package HandleSSLErrors;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Sslerror {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        //Global profile
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setAcceptInsecureCerts(true);

        ChromeOptions coptions = new ChromeOptions();
        coptions.merge(dc);

        WebDriver driver = new ChromeDriver(coptions);
        driver.get("https://expired.badssl.com/");


    }
}
