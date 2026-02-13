package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupLoginPage {

    // Signup section
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    private WebElement newUserSignupText;

    @FindBy(name = "name")
    private WebElement signupName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement signupEmail;

    @FindBy(xpath = "//button[text()='Signup']")
    private WebElement signupButton;

    // Login section
    @FindBy(xpath = "//h2[text()='Login to your account']")
    private WebElement loginText;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    private WebElement loginEmail;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    private WebElement loginPassword;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    private WebElement loginErrorMsg;

    public SignupLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Signup actions
    public boolean isNewUserSignupVisible() {
        return newUserSignupText.isDisplayed();
    }

    public void signup(String name, String email) {
        signupName.sendKeys(name);
        signupEmail.sendKeys(email);
        signupButton.click();
    }

    // Login actions
    public boolean isLoginTextVisible() {
        return loginText.isDisplayed();
    }

    public void login(String email, String password) {
        loginEmail.sendKeys(email);
        loginPassword.sendKeys(password);
        loginButton.click();
    }

    public boolean isLoginErrorVisible() {
        return loginErrorMsg.isDisplayed();
    }
}
