package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.support.PageFactory;

public class MyAccountElements extends MyMethods {
    public MyAccountElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
