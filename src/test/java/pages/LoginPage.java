package pages;

import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    //Elements

    @FindBy(id="user-name")
    private WebElement userNameInput;

    @FindBy(id= "password")
    private WebElement passwordInput;

    @FindBy(id= "login-button")
    private WebElement loginBtn;

    //Methods
    public ProductPage successfulLoginSauceDemo(String username, String password) throws InvalidSelectorException {
        userNameInput.click();
        userNameInput.clear();
        userNameInput.sendKeys(username);

        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);

        loginBtn.click();

        return new ProductPage(driver);
    }


    //constructor
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

}
