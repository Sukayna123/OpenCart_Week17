package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.support.PageFactory;

public class LoginElements extends MyMethods {
    public LoginElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
