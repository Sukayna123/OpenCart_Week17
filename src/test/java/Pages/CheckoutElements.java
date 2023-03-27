package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.support.PageFactory;

public class CheckoutElements extends MyMethods {
    public CheckoutElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
