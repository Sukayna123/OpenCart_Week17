package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartElements extends MyMethods {

    public AddToCartElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
    @FindBy(css = "input[type='text']")
    private WebElement searchBox;

    @FindBy(css = "button[class='btn btn-default btn-lg']")
    private WebElement searchIconButton;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    private WebElement addToCartSingleProduct;

    @FindBy (css = "div[class='alert alert-success alert-dismissible']")
    private WebElement successMessageAfterAddToCart;

    @FindBy(id = "cart-total")
    private WebElement blackCartButton;

    @FindBy(css = "p>a>strong")
    private WebElement viewCartButton;

    @FindBy(xpath = "(//a[text()='iMac'])[2]")
    private WebElement elementInTheCart;

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getSearchIconButton() {
        return searchIconButton;
    }

    public WebElement getAddToCartSingleProduct() {
        return addToCartSingleProduct;
    }

    public WebElement getSuccessMessageAfterAddToCart() {
        return successMessageAfterAddToCart;
    }

    public WebElement getBlackCartButton() {
        return blackCartButton;
    }

    public WebElement getViewCartButton() {
        return viewCartButton;
    }

    public WebElement getElementInTheCart() {
        return elementInTheCart;
    }

}
