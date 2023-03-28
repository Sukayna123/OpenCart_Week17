package StepDefinitions;

import Pages.ForgotPasswordElements;
import Pages.RegisterElements;
import Utilities.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_FP_004 {
    RegisterElements re=new RegisterElements();
    ForgotPasswordElements fo=new ForgotPasswordElements();
    @Given("Navigate to the Login page")
    public void navigateToTheLoginPage() {
        DriverClass.getDriver().get("https://opencart.abstracta.us/index.php?route=account/login");
    }

    @When("I click on Forgotten Password link from Login page")
    public void iClickOnForgottenPasswordLinkFromLoginPage() {
        fo.clickMethod(fo.getForgottenPasswordLink());
    }

    @And("Enter registered email address into the E-mail Address field")
    public void enterRegisteredEmailAddressIntoTheEMailAddressField() {
        re.sendKeysMethod(re.getEmail(),"technoS@gmail.com");
    }

    @And("Enter with old credentials")
    public void enterWithOldCredentials() {
        re.sendKeysMethod(re.getEmail(), "technoS@gmail.com");
        re.sendKeysMethod(re.getPassword(), "batch07");
    }

    @And("Click on Login button after forgot password")
    public void clickOnLoginButtonAfterForgotPassword() {
        re.clickMethod(re.getLoginButton());
    }

    @Then("User should be logged in")
    public void userShouldBeLoggedIn() {
        fo.verifyIsDisplayedMethod(fo.getMyAccountHeader());
    }
}
