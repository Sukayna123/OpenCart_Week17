package StepDefinitions;

import Pages.ForgotPasswordElements;
import Pages.RegisterElements;
import Utilities.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Collection;
import java.util.LinkedHashMap;

public class TC_FP_021 {
    ForgotPasswordElements fe = new ForgotPasswordElements();
    RegisterElements re = new RegisterElements();

    @And("Click on forgotten password link")
    public void clickOnForgottenPasswordLink() {
        fe.clickMethod(fe.getForgottenPasswordLink());

    }

    @Then("Breadcrumb are displayed")
    public void breadcrumbAreDisplayed() {
        Assert.assertTrue(fe.verifyIsDisplayedMethod(fe.getBreadcrumb()));
    }

    @Then("Check the Breadcrumb links working")
    public void checkTheBreadcrumbLinksWorking() {
        fe.clickMethod(fe.getHomePageBreadcrumbLink());
        String expectedHomePageHeader = "Featured";
        String actualHomePageHeader = fe.getBreadcrumbHeader().getText();
        Assert.assertEquals(actualHomePageHeader, expectedHomePageHeader);
        DriverClass.getDriver().navigate().back();

        fe.clickMethod(fe.getAccountBreadcrumbLink());
        String expectedAccountHeader = "New Customer";
        String actualAccountHeader = fe.getBreadcrumbHeader().getText();
        Assert.assertEquals(actualAccountHeader, expectedAccountHeader);
        DriverClass.getDriver().navigate().back();

        fe.clickMethod(fe.getForgottenPasswordBreadcrumbLink());
        String expectedForgottenPasswordHeader = "Account";
        String actualForgottenPasswordHeader = fe.getBreadcrumbHeader().getText();
        Assert.assertEquals(actualForgottenPasswordHeader, expectedForgottenPasswordHeader);
        DriverClass.getDriver().navigate().back();
    }

    @When("Click on My Account dropdown menu and click on login")
    public void clickOnMyAccountDropdownMenuAndClickOnLogin() {
        re.clickMethod(re.getMyAccount());
        re.clickMethod(re.getLogin());


    }
}
