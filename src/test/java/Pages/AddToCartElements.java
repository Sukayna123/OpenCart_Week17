package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.support.PageFactory;

public class AddToCartElements extends MyMethods {

    public AddToCartElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }


}
