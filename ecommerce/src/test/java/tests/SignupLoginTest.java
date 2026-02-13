package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignupLoginPage;

public class SignupLoginTest extends BaseTest {

    @Test(description = "Verify New User Signup navigation")
    public void verifySignupNavigation() {
        HomePage home = new HomePage(driver);
        home.clickSignupLogin();

        SignupLoginPage signupLogin = new SignupLoginPage(driver);
        Assert.assertTrue(signupLogin.isNewUserSignupVisible(),
                "New User Signup text not visible");
    }

    @Test(description = "Verify user signup form submission")
    public void verifyUserSignup() {
        HomePage home = new HomePage(driver);
        home.clickSignupLogin();

        SignupLoginPage signupLogin = new SignupLoginPage(driver);
        signupLogin.signup(
                "TestUser",
                "test" + System.currentTimeMillis() + "@mail.com"
        );
    }

    @Test(description = "Verify login with invalid credentials")
    public void verifyInvalidLogin() {
        HomePage home = new HomePage(driver);
        home.clickSignupLogin();

        SignupLoginPage signupLogin = new SignupLoginPage(driver);
        signupLogin.login("wrong@mail.com", "wrong123");

        Assert.assertTrue(signupLogin.isLoginErrorVisible(),
                "Error message not displayed");
    }
}
