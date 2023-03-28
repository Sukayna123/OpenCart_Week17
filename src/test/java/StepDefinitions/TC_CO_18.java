package StepDefinitions;

import Pages.CheckoutElements;
import Pages.RegisterElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_CO_18 {
    RegisterElements re = new RegisterElements();
    CheckoutElements co=new CheckoutElements();
    @And("Enter credentials of existing account in the Returning Customer section of the displayed Checkout page")
    public void enterCredentialsOfExistingAccountInTheReturningCustomerSectionOfTheDisplayedCheckoutPage() {
        re.sendKeysMethod(re.getEmail(), "technoS@gmail.com");
        re.sendKeysMethod(re.getPassword(), "batch07");
    }

    @And("Click on Login button")
    public void clickOnLoginButton() {
        co.clickMethod(co.getLoginButtonInCheckOut());
    }

    @Then("User should be logged in and taken to Billing Details section")
    public void userShouldBeLoggedInAndTakenToBillingDetailsSection() {
        co.verifyIsDisplayedMethod(co.getiWantToUseExistingAddressCheckbox());
    }

    @And("I want to use an existing address checkbox should be displayed as selected by default")
    public void iWantToUseAnExistingAddressCheckboxShouldBeDisplayedAsSelectedByDefault() {
        co.isSelectedMethod(co.getiWantToUseExistingAddressCheckbox());
    }

    @When("Click on Continue button in BillingDetails after Login")
    public void clickOnContinueButtonInBillingDetailsAfterLogin() {
        co.clickMethod(co.getContinueButtonBillingDetailsLogin());
    }

    @And("I want to use an existing address radio button should be displayed as selected by default")
    public void iWantToUseAnExistingAddressRadioButtonShouldBeDisplayedAsSelectedByDefault() {
        co.isSelectedMethod(co.getiWantToUseExistingAddressCheckbox());
    }
}
