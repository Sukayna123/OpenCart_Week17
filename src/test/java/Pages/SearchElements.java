package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.support.PageFactory;

public class SearchElements extends MyMethods {
    public SearchElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
