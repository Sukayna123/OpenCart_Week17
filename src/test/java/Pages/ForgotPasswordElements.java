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

    public WebElement getForgottenPasswordLink() {
        return forgottenPasswordLink;
    }

}
