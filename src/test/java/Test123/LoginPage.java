package Test123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private String password= "SuperSecretPassword!";

    @FindBy(id = "h2")
    private WebElement header;

    @FindBy(css = "[name='username']")
    private WebElement usernameTextbox;

    @FindBy(css = "[name='password']")
    private WebElement passwordTextbox;

    @FindBy(css = "[type='submit'][class='radius']")
    private WebElement loginButton;

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginAs(String username) {
        usernameTextbox.sendKeys(username);
        passwordTextbox.sendKeys(password);
        loginButton.click();
    }
}