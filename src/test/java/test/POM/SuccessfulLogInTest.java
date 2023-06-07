package test.POM;

import base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class SuccessfulLogInTest extends TestUtil {

    //Gets the username & password from correctUser.csv
    @Test(dataProvider = "UserCredentials")
    public void successfulLogin(String username, String password) throws InvalidSelectorException {

        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.successfulLoginSauceDemo(username, password);
        WebElement titleMessage = driver.findElement(By.className("app_logo"));
        Assert.assertTrue(titleMessage.isDisplayed());
    }
}

