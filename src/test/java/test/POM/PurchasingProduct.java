package test.POM;

import base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CheckOutPage;
import pages.LoginPage;
import pages.ProductPage;

public class PurchasingProduct extends TestUtil {

    @Test
    public void addItemToTheCart() {
        LoginPage loginTest = new LoginPage(driver);
        ProductPage productPage = loginTest.successfulLoginSauceDemo("standard_user", "secret_sauce");

        productPage.addItemToTheCart("backpack");
        Assert.assertEquals(productPage.getItemsInCart(), 1);

        productPage.addItemToTheCart("bike-light");
        Assert.assertEquals(productPage.getItemsInCart(), 2);
    }
}
