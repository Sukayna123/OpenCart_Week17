package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListElements extends MyMethods {
    public WishListElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
    @FindBy(css = "div.list-group>:nth-child(5)")
    private WebElement wishListButtonFromRightColumn;

    @FindBy(css = "ul.breadcrumb>li:nth-child(3)>a")
    private WebElement wishListTextFromBreadCrumb;

    public WebElement getWishListButtonFromRightColumn() {
        return wishListButtonFromRightColumn;
    }

    public WebElement getWishListTextFromBreadCrumb() {
        return wishListTextFromBreadCrumb;
    }

}
