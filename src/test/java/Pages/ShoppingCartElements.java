package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartElements extends MyMethods {
    public ShoppingCartElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(css = "a.btn.btn-default")
    private WebElement continueShoppingButton;

    @FindBy(css = "div > span > button.btn.btn-danger")
    private WebElement removeButton;

    @FindBy(css = "button[id='button-cart']")
    private WebElement addToCartButtonAfterClickElement;

    @FindBy(css = "a.accordion-toggle")
    private WebElement useCouponCodeLink;

    @FindBy(css = "input[id='button-coupon']")
    private WebElement applyCouponLink;

    @FindBy(css = "button.close")
    private WebElement closeWarningMessageButton;

    @FindBy(css = "div.alert.alert-danger.alert-dismissible")
    private WebElement pleaseEnterCouponAlertMessage;

    public WebElement getAddToCartButtonAfterClickElement() {
        return addToCartButtonAfterClickElement;
    }

    public WebElement getUseCouponCodeLink() {
        return useCouponCodeLink;
    }

    public WebElement getApplyCouponLink() {
        return applyCouponLink;
    }

    public WebElement getCloseWarningMessageButton() {
        return closeWarningMessageButton;
    }

    public WebElement getPleaseEnterCouponAlertMessage() {
        return pleaseEnterCouponAlertMessage;
    }

    public WebElement getContinueShoppingButton() {
        return continueShoppingButton;
    }

    public WebElement getRemoveButton() {
        return removeButton;
    }

}
