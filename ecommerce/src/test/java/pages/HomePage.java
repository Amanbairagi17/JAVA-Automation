package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    // Logo
    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    private WebElement logo;

    // Header links
    @FindBy(xpath = "//a[text()=' Home']")
    private WebElement homeLink;

    @FindBy(xpath = "//a[text()=' Products']")
    private WebElement productsLink;

    @FindBy(xpath = "//a[text()=' Cart']")
    private WebElement cartLink;

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    private WebElement signupLoginLink;

    @FindBy(xpath = "//a[text()=' Test Cases']")
    private WebElement testCasesLink;

    @FindBy(xpath = "//a[text()=' API Testing']")
    private WebElement apiTestingLink;

    @FindBy(xpath = "//a[text()=' Contact us']")
    private WebElement contactUsLink;

    // Banner
    @FindBy(id = "slider-carousel")
    private WebElement mainSlider;

    // Featured products
    @FindBy(xpath = "//h2[text()='Features Items']")
    private WebElement featuredItems;

    // Category sidebar
    @FindBy(xpath = "//h2[text()='Category']")
    private WebElement categorySection;

    // Subscription
    @FindBy(id = "susbscribe_email")
    private WebElement subscriptionEmail;

    @FindBy(id = "subscribe")
    private WebElement subscribeBtn;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    private WebElement subscriptionSuccessMsg;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean isLogoVisible() { return logo.isDisplayed(); }
    public boolean isHomeLinkVisible() { return homeLink.isDisplayed(); }
    public boolean isProductsLinkVisible() { return productsLink.isDisplayed(); }
    public boolean isCartLinkVisible() { return cartLink.isDisplayed(); }
    public boolean isSignupLoginVisible() { return signupLoginLink.isDisplayed(); }
    public boolean isTestCasesVisible() { return testCasesLink.isDisplayed(); }
    public boolean isApiTestingVisible() { return apiTestingLink.isDisplayed(); }
    public boolean isContactUsVisible() { return contactUsLink.isDisplayed(); }
    public boolean isSliderVisible() { return mainSlider.isDisplayed(); }
    public boolean isFeaturedItemsVisible() { return featuredItems.isDisplayed(); }
    public boolean isCategorySectionVisible() { return categorySection.isDisplayed(); }

    public void subscribe(String email) {
        subscriptionEmail.sendKeys(email);
        subscribeBtn.click();
    }

    public boolean isSubscriptionSuccessVisible() {
        return subscriptionSuccessMsg.isDisplayed();
    }

    public void scrollToBottom(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollToTop(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");
    }

    public void clickHome() {
        homeLink.click();
    }

    public void clickProducts() {
        productsLink.click();
    }

    public void clickCart() {
        cartLink.click();
    }

    public void clickSignupLogin() {
        signupLoginLink.click();
    }

    public void clickTestCases() {
        testCasesLink.click();
    }

    public void clickApiTesting() {
        apiTestingLink.click();
    }

    public void clickContactUs() {
        contactUsLink.click();
    }

}

