package StepDefinitions;

import Pages.CheckoutElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC_CO_013 {
    CheckoutElements ce = new CheckoutElements();

    @And("Select I want to use a new address radio option")
    public void selectIWantToUseANewAddressRadioOption() {
        ce.clickMethod(ce.getiWantToUseNewAddressCheckBox());
    }

    @Then("Warning messages should be displayed for all mandatory fields in Delivery Details section")
    public void warningMessagesShouldBeDisplayedForAllMandatoryFieldsInDeliveryDetailsSection() {
        Assert.assertTrue(ce.verifyIsDisplayedMethod(ce.getFirstNameWarningMessage()));
        Assert.assertTrue(ce.verifyIsDisplayedMethod(ce.getLastNameWarningMessage()));
        Assert.assertTrue(ce.verifyIsDisplayedMethod(ce.getAddressWarningMessage()));
        Assert.assertTrue(ce.verifyIsDisplayedMethod(ce.getCityWarningMessage()));

    }

    @And("Click on Continue button in Billing Details")
    public void clickOnContinueButtonInBillingDetails() {
        ce.clickMethod(ce.getContinueBillingDetails());

    }
}
