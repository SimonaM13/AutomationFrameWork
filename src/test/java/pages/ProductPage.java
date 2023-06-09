package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {

    private static final Object PRODUCT_ID ="add-to-cart-sauce-labs-"; ;

    @FindBy(className = "title")
    private WebElement pageTitle;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement userMenuBtn;

    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingCart_container;

    @FindBy(className = "shopping_cart_badge")
    private WebElement shoppingCartBadge;


    public ProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public CheckOutPage addItemToTheCart(String itemName){
        WebElement itemToBeAdded = driver.findElement(By.id(PRODUCT_ID + itemName));
        itemToBeAdded.click();
        return new CheckOutPage(driver);
    }

    public int getItemsInCart(){
        return Integer.parseInt(shoppingCartBadge.getText());
    }
}

