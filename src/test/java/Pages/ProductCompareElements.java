package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.support.PageFactory;

public class ProductCompareElements extends MyMethods {
    public ProductCompareElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
