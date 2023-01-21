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
import page.ProductPage;
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
    public void CheckFunctionBuyNow() {
        boolean itemIsOrdered = new PhonePage(driver).openPage("honor/honorx6464blue").BuyPhoneByShop("3467").itemIsOrdered("HONOR X6 4GB/64GB с NFC (синий)");
        Assert.assertTrue(itemIsOrdered);
    }

    @Test
    public void RemoveAllComparingPhone()
    {
        new ComparingPage(driver).openPage("iphone14+iphone13").removeALlItemFromComparingList();

        Assert.assertEquals(driver.getCurrentUrl().toString(),"https://catalog.onliner.by/".toString());
    }
//    @Test
//    public void AddProductToBusketByFounder()
//    {
//        PhonePage phonePage =new ProductPage(driver)
//                .openPage()
//                .FoundButton()
//                .InputLine("Iphone 14 128GB полуночный")
//                .OpenSelectedProduct()
//                .BuyPhoneByShop()
//                        .
//
//        Assert.assertEquals(driver.getCurrentUrl().toString(),"https://catalog.onliner.by/".toString());
//    }

    @AfterMethod(alwaysRun=true)
    public void browserTeasrDown()
    { driver.quit();
        driver = null;}


}


