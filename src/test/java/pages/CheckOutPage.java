package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class CheckOutPage extends BasePage{

        //Elements
        @FindBy(className = "shopping_cart_badge")
        private WebElement shoppingCartBadge;

        @FindBy(id = "cart_contents_container")
        private WebElement cartContainer;

        @FindBy(id = "checkout")
        private WebElement checkoutButton;

        @FindBy(id = "first-name")
        private WebElement firstNameInput;

        @FindBy(id = "last-name")
        private WebElement lastNameInput;

        @FindBy(id = "postal-code")
        private WebElement postalCodeInput;

        @FindBy(id = "continue")
        private WebElement continueButton;

        @FindBy(id = "checkout_summary_container")
        private WebElement confirmationPage;

        @FindBy(id = "finish")
        private WebElement finishButton;

        @FindBy(id = "checkout_complete_container")
        private WebElement checkOutComplete;

        //Method
        public void checkOutProcess(){
            shoppingCartBadge.click();
            cartContainer.isDisplayed();
            checkoutButton.click();

            firstNameInput.click();
            firstNameInput.clear();
            firstNameInput.sendKeys("Simona");

            lastNameInput.click();
            lastNameInput.clear();
            lastNameInput.sendKeys("Milanova");

            postalCodeInput.click();
            postalCodeInput.clear();
            postalCodeInput.sendKeys("4000");

            continueButton.click();

            confirmationPage.isDisplayed();

            finishButton.click();

            checkOutComplete.isDisplayed();


        }

        //constructor
        public CheckOutPage(WebDriver driver) {
            super(driver);
            PageFactory.initElements(driver, this);
        }
    }
