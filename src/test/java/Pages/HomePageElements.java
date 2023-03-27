package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements extends MyMethods {
    public HomePageElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
