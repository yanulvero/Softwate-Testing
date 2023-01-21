package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import wait.CustomConditions;

public class ProductPage extends AbstractPage {
    private static final String FIRST_URL_PATH = "https://catalog.onliner.by/mobile/";
    @FindBy(className = "product-aside__offers-list")
    private WebElement foundButton;
    private WebElement productButton;
    private String url;

    public ProductPage( WebDriver driver ) {
        super(driver);

    }

    public ProductPage BuyPhoneByShop(String shopKey) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", driver.findElement(By.xpath("//div/a[@data-shop-id='" + shopKey + "'][1]")));
        return new ProductPage(this.driver);
    }
    public ProductPage FoundButton()
    {
        foundButton =driver.findElement(By.xpath("//*[@class='fast-search__input']"));
        foundButton.click();
        return this;
    }
    public ProductPage InputLine(String inputLine)
    {
        foundButton.getAttribute(inputLine);
        return this;
    }
    public PhonePage OpenSelectedProduct()
    {
        productButton=driver.findElement(By.xpath("//li[@class = 'search__result'][1]"));
        productButton.click();
        return new PhonePage(driver);
    }

    @Override
    protected AbstractPage openPage(String params) {
        throw new RuntimeException("Please check your step twice");
    }

    @Override
    public ProductPage openPage() {
        this.url = FIRST_URL_PATH;
        driver.get(url);
        new WebDriverWait(this.driver, Duration.ofSeconds(10)).until(CustomConditions.jQueryAJAXsCompleted());
        return this;
    }

}
