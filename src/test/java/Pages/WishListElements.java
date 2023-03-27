package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.support.PageFactory;

public class WishListElements extends MyMethods {
    public WishListElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
