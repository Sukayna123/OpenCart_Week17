package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartElements extends MyMethods {
    public ShoppingCartElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
