package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordElements extends MyMethods {
    public ForgotPasswordElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
