package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordElements extends MyMethods {
    public ForgotPasswordElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Forgotten Password']")
    private WebElement forgottenPasswordLink;

    @FindBy(css = "#content>h2:nth-child(1)")
    private WebElement myAccountHeader;

    public WebElement getMyAccountHeader() {
        return myAccountHeader;
    }

    @FindBy(css = "ul.breadcrumb")
    private WebElement breadcrumb;

    @FindBy(css = "ul.breadcrumb>li>a")
    private WebElement homePageBreadcrumbLink;

    @FindBy(linkText = "Account")
    private WebElement accountBreadcrumbLink;

    @FindBy(linkText = "Forgotten Password")
    private WebElement forgottenPasswordBreadcrumbLink;

    @FindBy(css = "div[id='content']>h1,h2,h3")
    private WebElement breadcrumbHeader;


    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement myAccount;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginButtonHomePage;
    @FindBy(xpath ="//div[@class='list-group']//a[3]"  )
    public WebElement forgotPasswordRightColumn1;



    public WebElement getForgottenPasswordLink() {
        return forgottenPasswordLink;
    }

    public WebElement getBreadcrumb() {
        return breadcrumb;
    }

    public WebElement getHomePageBreadcrumbLink() {
        return homePageBreadcrumbLink;
    }

    public WebElement getAccountBreadcrumbLink() {
        return accountBreadcrumbLink;
    }

    public WebElement getForgottenPasswordBreadcrumbLink() {
        return forgottenPasswordBreadcrumbLink;
    }

    public WebElement getBreadcrumbHeader() {
        return breadcrumbHeader;
    }


    public WebElement getMyAccount() {
        return myAccount;
    }

    public WebElement getLoginButtonHomePage() {
        return loginButtonHomePage;
    }

    public WebElement getForgotPasswordRightColumn1() {
        return forgotPasswordRightColumn1;
    }
}
