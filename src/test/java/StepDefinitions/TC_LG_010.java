package StepDefinitions;

import Utilities.DriverClass;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC_LG_010 {
    @Then("User should be see Account Logout Page")
    public void userShouldBeSeeAccountLogoutPage() {
        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("logout"));
    }
}
