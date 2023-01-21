import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OnlinerTester {

    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserStart() {driver = new ChromeDriver();}

    @Test
    public void tryBuyNow(){
        driver.get("https://catalog.onliner.by/compare/iphone14+iphone13");
        //WebElement buynow =driver.findElement(By.xpath("//*[@id='product-table']/tbody[2]/tr/th[3]/div/a"));
        WebElement buynow =driver.findElement(By.xpath("//th/div/a[@data-key='iphone14']"));
        buynow.click();
        Assert.assertEquals(driver.getCurrentUrl().toString(),"https://catalog.onliner.by/compare/iphone13".toString());
    }
    @AfterMethod(alwaysRun=true)
    public void browserTeasrDown()
    { driver.quit();}
}
