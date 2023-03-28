package StepDefinitions;

import Pages.LogoutElements;
import Utilities.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC_LG_004 {
    LogoutElements le = new LogoutElements();

    @When("Logout")
    public void logout() {
        le.clickMethod(le.getMyAccount());
        le.clickMethod(le.getLogout());
    }

    @And("Click Browser back button")
    public void clickBrowserBackButton() {
        DriverClass.getDriver().navigate().back();
    }

    @Then("User should be logged out")
    public void userShouldBeLoggedOut() {
        le.clickMethod(le.getMyAccount());
        le.clickMethod(le.getMyAccountButton());
        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("login"));
    }


}
