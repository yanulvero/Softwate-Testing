package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.ComparingPage;
import page.PhonePage;
public class OnlinerTester {

    private WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void browserStart() {driver = new ChromeDriver(); driver.manage().window().maximize();}

    @Test
    public void RemoveOneComparingPhone(){
        new ComparingPage(driver).openPage("iphone14+iphone13").removeItemFromComparingList("iphone14");
        Assert.assertEquals(driver.getCurrentUrl().toString(),"https://catalog.onliner.by/compare/iphone13".toString());
    }

    @Test
    public void CheckFunctoinBuyNow() {
        boolean itemIsOrdered = new PhonePage(driver).openPage("honor/honorx6464blue").BuyPhoneByShop("3467").itemIsOrdered("HONOR X6 4GB/64GB с NFC (синий)");
        Assert.assertTrue(itemIsOrdered);
    }
    @AfterMethod(alwaysRun=true)
    public void browserTeasrDown()
    { driver.quit();
        driver = null;}


}
