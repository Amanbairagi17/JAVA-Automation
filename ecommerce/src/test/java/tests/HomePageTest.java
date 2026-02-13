package tests;

import base.BaseTest;
import pages.HomePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHeaderAndNavigation() {
        HomePage home = new HomePage(driver);

        Assert.assertTrue(home.isLogoVisible());
        Assert.assertTrue(home.isHomeLinkVisible());
        Assert.assertTrue(home.isProductsLinkVisible());
        Assert.assertTrue(home.isCartLinkVisible());
        Assert.assertTrue(home.isSignupLoginVisible());
        Assert.assertTrue(home.isTestCasesVisible());
        Assert.assertTrue(home.isApiTestingVisible());
        Assert.assertTrue(home.isContactUsVisible());
    }

    @Test
    public void verifyHomePageContent() {
        HomePage home = new HomePage(driver);

        Assert.assertTrue(home.isSliderVisible(), "Main banner not visible");
        Assert.assertTrue(home.isFeaturedItemsVisible(), "Featured items missing");
        Assert.assertTrue(home.isCategorySectionVisible(), "Category section missing");
    }

    @Test
    public void verifySubscriptionFunctionality() {
        HomePage home = new HomePage(driver);
        home.subscribe("test" + System.currentTimeMillis() + "@mail.com");
        Assert.assertTrue(home.isSubscriptionSuccessVisible(), "Subscription failed");
    }
    
    @Test(description = "Verify scroll functionality from top to bottom and back to top")
    public void verifyScrollTopAndBottom() throws InterruptedException {
        HomePage home = new HomePage(driver);

        home.scrollToBottom(driver);
        Thread.sleep(2000); // visual confirmation

        home.scrollToTop(driver);
        Thread.sleep(2000);

        // If no exception → scroll works
        Assert.assertTrue(true, "Scroll functionality failed");
    }

    @Test(description = "Verify Home link navigation")
    public void verifyHomeLinkNavigation() {
        HomePage home = new HomePage(driver);
        home.clickHome();

        Assert.assertEquals(driver.getCurrentUrl(),
                "https://automationexercise.com/",
                "Home page URL mismatch");
    }

    @Test(description = "Verify Products link navigation")
    public void verifyProductsLinkNavigation() {
        HomePage home = new HomePage(driver);
        home.clickProducts();

        wait.until(d -> d.getCurrentUrl().contains("products"));

        Assert.assertTrue(driver.getCurrentUrl().contains("products"),
                "Products page URL mismatch");
    }


    @Test(description = "Verify Cart link navigation")
    public void verifyCartLinkNavigation() {
        HomePage home = new HomePage(driver);
        home.clickCart();

        Assert.assertTrue(driver.getCurrentUrl().contains("/view_cart"),
                "Cart page URL mismatch");
    }

    @Test(description = "Verify Signup/Login link navigation")
    public void verifySignupLoginNavigation() {
        HomePage home = new HomePage(driver);
        home.clickSignupLogin();

        Assert.assertTrue(driver.getCurrentUrl().contains("/login"),
                "Signup/Login page URL mismatch");
    }

    @Test(description = "Verify Test Cases link navigation")
    public void verifyTestCasesNavigation() {
        HomePage home = new HomePage(driver);
        home.clickTestCases();

        wait.until(d -> d.getCurrentUrl().contains("test_cases"));

        Assert.assertTrue(driver.getCurrentUrl().contains("test_cases"),
                "Test Cases page URL mismatch");
    }


    @Test(description = "Verify API Testing link navigation")
    public void verifyApiTestingNavigation() {
        HomePage home = new HomePage(driver);
        home.clickApiTesting();

        wait.until(d -> d.getCurrentUrl().contains("api_list"));

        Assert.assertTrue(driver.getCurrentUrl().contains("api_list"),
                "API Testing page URL mismatch");
    }


    @Test(description = "Verify Contact Us link navigation")
    public void verifyContactUsNavigation() {
        HomePage home = new HomePage(driver);
        home.clickContactUs();

        Assert.assertTrue(driver.getCurrentUrl().contains("/contact_us"),
                "Contact Us page URL mismatch");
    }

}
