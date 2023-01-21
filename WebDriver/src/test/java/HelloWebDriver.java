import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWebDriver {
    public static void main (String[] args){
        WebDriver wd = new ChromeDriver();
        wd.get("/");

    }
}
