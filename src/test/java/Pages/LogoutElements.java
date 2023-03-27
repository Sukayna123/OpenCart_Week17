package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.support.PageFactory;

public class LogoutElements extends MyMethods {
    public LogoutElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
