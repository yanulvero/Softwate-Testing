package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class AutomatedTestDriver {

    private static WebDriver driver;

    private AutomatedTestDriver() {};

    public static WebDriver GetDriver(String browser) {
        if(driver == null) {
            switch (browser) {
                case "Edge":
                {EdgeOptions options = new EdgeOptions();
                    options.addArguments("--start-fullscreen");
                    driver = new EdgeDriver(options);}
                break;

                default:
                {ChromeOptions options = new ChromeOptions();
                    options.addArguments("--start-fullscreen");
                    driver = new ChromeDriver(options);}
                break;
            }
        }
        return driver;
    }

    public static void CloseDriver() {
        if(driver !=null)
            driver.quit();
        driver = null;
    }

}
