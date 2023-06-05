package test.POM;

import base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PurchasingProduct extends TestUtil {
    private static final String PROCUDT_ID = "add-to-cart-sauce-labs-";


    @Test (dataProvider = "item list")
    public void addItemToTheCart (String itemName){
        WebElement userNameInput = driver.findElement(By.id("user-name"));
        userNameInput.click();
        userNameInput.clear();
        userNameInput.sendKeys("standard_user");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("secret_sauce");

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();

        WebElement itemToBeAdded = driver.findElement(By.id(PROCUDT_ID + itemName));
        itemToBeAdded.click();

        WebElement ShoppingCartBadge = driver.findElement(By.className("shopping_cart_badge"));

        Assert.assertEquals(ShoppingCartBadge.getText(), "1");

    }
    @DataProvider(name = "item list")
    public Object[][] getItems(){
        return new Object[][]{
                {"backpack"},
                  {"fleece-jacket"}
        };
    }
}
