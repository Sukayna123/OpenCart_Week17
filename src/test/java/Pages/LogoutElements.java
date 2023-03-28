package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutElements extends MyMethods {
    public LogoutElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccount;

    @FindBy(xpath = "(//a[text()='Logout'])[1]")
    private WebElement logout;

    @FindBy (xpath = "(//ul[@class='dropdown-menu dropdown-menu-right']//a)[1]")
    private WebElement myAccountButton;

    public WebElement getMyAccount() {
        return myAccount;
    }

    public WebElement getLogout() {
        return logout;
    }

    public WebElement getMyAccountButton() {
        return myAccountButton;
    }
}
