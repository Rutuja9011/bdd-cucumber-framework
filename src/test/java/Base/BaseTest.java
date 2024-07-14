package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected static WebDriver driver;

    public static void initialize() {
        
        driver = new ChromeDriver();
    }

    public static void quit() {
        if (driver != null) {
            driver.quit();
        }
    }
}

