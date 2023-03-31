package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchElements extends MyMethods {
    public SearchElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
    @FindBy(css = "div[class='product-thumb']")
    private List<WebElement> listOfElementAfterSearch;

    @FindBy(css = "select[class='form-control']")
    private List<WebElement> showDropDownButton;

    @FindBy(css = "div.image>a")
    private WebElement product;

    @FindBy(id = "button-cart")
    private WebElement addToCartButton;

    public List<WebElement> getListOfElementAfterSearch() {
        return listOfElementAfterSearch;
    }

    public List<WebElement> getShowDropDownButton() {
        return showDropDownButton;
    }

    public WebElement getProduct() {
        return product;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }
}
