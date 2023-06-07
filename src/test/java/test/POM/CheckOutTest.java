package test.POM;

import base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.LoginPage;
import pages.ProductPage;

import java.io.IOException;

public class CheckOutTest extends TestUtil {

    @Test
    public void checkOut() throws IOException {

        LoginPage loginTest = new LoginPage(driver);

        ProductPage productPage = loginTest.successfulLoginSauceDemo("standard_user", "secret_sauce");

        productPage.addItemToTheCart("backpack");

        productPage.addItemToTheCart("bike-light");

        // Go to checkout
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        checkOutPage.checkOutProcess();

    }
}
