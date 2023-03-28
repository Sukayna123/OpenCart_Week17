package StepDefinitions;

import Pages.AddToCartElements;
import Pages.CheckoutElements;
import Utilities.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class TC_CO_017 {
    AddToCartElements atc = new AddToCartElements();
    CheckoutElements co = new CheckoutElements();
    @When("Enter any existing Product name into the Search text box field {string}")
    public void enterAnyExistingProductNameIntoTheSearchTextBoxField(String product) {
        atc.sendKeysMethod(atc.getSearchBox(), product);
    }

    @And("Click on Add to Cart button on the Product displayed in the Search results")
    public void clickOnAddToCartButtonOnTheProductDisplayedInTheSearchResults() {
        atc.clickMethod(atc.getAddToCartSingleProduct());
    }

    @And("Click on the Shopping cart! link in the displayed success message")
    public void clickOnTheShoppingCartLinkInTheDisplayedSuccessMessage() {
        co.clickMethod(co.getShoppingCartLinkFromSuccessMessage());
    }

    @When("Click on Checkout button in the Shopping Cart page")
    public void clickOnCheckoutButtonInTheShoppingCartPage() {
        co.clickMethod(co.getCheckOutButtonFromCart());
    }

    @Then("Checkout Page should be displayed")
    public void checkoutPageShouldBeDisplayed() {
        co.verifyIsDisplayedMethod(co.getCheckOutPageHeader());
    }

    @And("Select Register Account option in the New Customer section of the displayed Checkout page")
    public void selectRegisterAccountOptionInTheNewCustomerSectionOfTheDisplayedCheckoutPage() {
    }

    @When("Click on Continue button in CheckoutOptions")
    public void clickOnContinueButtonInCheckoutOptions() {
        co.clickMethod(co.getContinueButtonFromCheckoutPage());
    }

    @Then("User should be taken to Billing Details section")
    public void userShouldBeTakenToBillingDetailsSection() {
        co.verifyIsDisplayedMethod(co.getYourPersonalDetailsHeader());
    }

    @And("My delivery and billing addresses are the same checkbox should be displayed as selected by default")
    public void myDeliveryAndBillingAddressesAreTheSameCheckboxShouldBeDisplayedAsSelectedByDefault() {
        co.isSelectedMethod(co.getMyDeliveryAndBillingAddressCheckBox());
    }

    @And("Enter details into all the fields")
    public void enterDetailsIntoAllTheFields() {
        List<String> yourPersonalInfo=new ArrayList<>(List.of("john","doe","jdoerk2@hotmail.com","123456","techno valley","123 Main St","Berkshire","NewYork",
                "34567"));
        List<WebElement> infoElements=co.getYourPersonalDetailsElements();
        for (int i = 0; i < infoElements.size(); i++) {
            co.sendKeysMethod(infoElements.get(i),yourPersonalInfo.get(i));
        }
        Select country=new Select(co.getSelectCountry());
        country.selectByVisibleText("United States");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Select region=new Select(co.getSelectRegion());
        region.selectByIndex(3);
        Actions actions=new Actions(DriverClass.getDriver());
        Action move=actions.moveToElement(co.getPasswordYourPersonalDetails()).build();
        move.perform();
        co.sendKeysMethod(co.getPasswordYourPersonalDetails(),"12345");
        co.sendKeysMethod(co.getConfirmPasswordYourPersonalDetails(),"12345");


        co.clickMethod(co.getPrivacyPolicyBox());


    }

    @When("Click on Continue button in BillingDetails")
    public void clickOnContinueButtonInBillingDetails() {
        co.clickMethod(co.getContinueButtonBillingDetails());
    }

    @And("Click on Continue button in Delivery Details")
    public void clickOnContinueButtonInDeliveryDetails() {
        co.clickMethod(co.getContinueButtonDeliveryDetail());
    }

    @Then("User should be taken to Delivery Method section")
    public void userShouldBeTakenToDeliveryMethodSection() {
        co.verifyIsDisplayedMethod(co.getFlatRate());
    }

    @And("Flat Shipping Rate 5dollar radio button should be displayed as selected by default")
    public void flatShippingRateDollarRadioButtonShouldBeDisplayedAsSelectedByDefault() {
        co.isSelectedMethod(co.getFlatRateRadioButton());
    }

    @When("Click on Continue button in Delivery Method")
    public void clickOnContinueButtonInDeliveryMethod() {
        co.clickMethod(co.getContinueButtonDeliveryMethod());
    }

    @Then("User should be taken to Payment Method section")
    public void userShouldBeTakenToPaymentMethodSection() {
        co.verifyIsDisplayedMethod(co.getVerifyTextForPaymentMethod());
    }

    @And("Bank Transfer radio button should be displayed as selected by default")
    public void bankTransferRadioButtonShouldBeDisplayedAsSelectedByDefault() {
        co.isSelectedMethod(co.getBankTransferCheckBox());
    }

    @When("Select Terms and Conditions checkbox")
    public void selectTermsAndConditionsCheckbox() {
        co.clickMethod(co.getTermsAndConditionCheckBoxPaymentMethod());
    }

    @And("Click on Continue button in Payment Method")
    public void clickOnContinueButtonInPaymentMethod() {
        co.clickMethod(co.getContinueButtonPaymentMethod());
    }

    @Then("User should be taken to Confirm Order section")
    public void userShouldBeTakenToConfirmOrderSection() {
        co.verifyIsDisplayedMethod(co.getBankTransferInsFromConfirmOrderStep());
    }

    @And("Correct and Proper details should be displayed in the Confirm Order section")
    public void correctAndProperDetailsShouldBeDisplayedInTheConfirmOrderSection() {
        co.verifyIsDisplayedMethod(co.getCorrectAndProperDetailsInConfirmOrder());
    }

    @When("Click on Confirm Order button in Confirm Order")
    public void clickOnConfirmOrderButtonInConfirmOrder() {
        co.clickMethod(co.getConfirmOrderButton());
    }

    @Then("Order should be placed and User should be taken to Success page \\(Proper details should be displayed in the Order Success page)")
    public void orderShouldBePlacedAndUserShouldBeTakenToSuccessPageProperDetailsShouldBeDisplayedInTheOrderSuccessPage() {
        co.verifyIsDisplayedMethod(co.getSuccessMessageForCase17());
    }
}
