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

    public WebElement getContinueShoppingButton() {
        return continueShoppingButton;
    }
}
