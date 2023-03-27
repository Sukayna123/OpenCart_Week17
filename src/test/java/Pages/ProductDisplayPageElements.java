package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayPageElements extends MyMethods {
    public ProductDisplayPageElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
