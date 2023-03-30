package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckoutElements extends MyMethods {
    public CheckoutElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
    @FindBy(xpath = "//a[text()='shopping cart']")
    private WebElement shoppingCartLinkFromSuccessMessage;

    @FindBy(xpath = "//a[text()='Checkout']")
    private WebElement checkOutButtonFromCart;

    @FindBy(xpath = "//h1[text()='Checkout']")
    private WebElement checkOutPageHeader;

    @FindBy(css = "input[value='Continue']")
    private WebElement continueButtonFromCheckoutPage;

    @FindBy(xpath = "//legend[text()='Your Personal Details']")
    private WebElement yourPersonalDetailsHeader;

    @FindBy(css = "input[name='shipping_address']")
    private WebElement myDeliveryAndBillingAddressCheckBox;

    @FindBy(xpath = "(//div[@class='panel-body'])[2]//input[@type='text']")
    private List<WebElement> yourPersonalDetailsElements;

    @FindBy(id="input-payment-password")
    private WebElement passwordYourPersonalDetails;

    @FindBy(id="input-payment-confirm")
    private WebElement confirmPasswordYourPersonalDetails;

    @FindBy(id = "input-payment-country")
    private WebElement selectCountry;

    @FindBy(id = "input-payment-zone")
    private WebElement selectRegion;

    @FindBy(css = "input[name='agree']")
    private WebElement privacyPolicyBox;

    @FindBy(css = "input[id='button-account']")
    private WebElement ContinueButtonFromCheckout;

    @FindBy(css = "input[id='button-register']")
    private WebElement continueButtonBillingDetails;

    @FindBy(css = "input[id='button-shipping-address']")
    private WebElement continueButtonDeliveryDetail;

    @FindBy(css = "input[id='button-shipping-method']")
    private WebElement continueButtonDeliveryMethod;

    @FindBy(xpath = "//strong[text()='Flat Rate']")
    private WebElement flatRate;

    @FindBy(css = "input[name='shipping_method']")
    private WebElement flatRateRadioButton;

    @FindBy(xpath = "//p[text()='Please select the preferred payment method to use on this order.']")
    private WebElement verifyTextForPaymentMethod;

    @FindBy(css = "input[value='bank_transfer']")
    private WebElement bankTransferCheckBox;

    @FindBy(css = "input[name='agree']")
    private WebElement termsAndConditionCheckBoxPaymentMethod;

    @FindBy(css = "input[id='button-payment-method']")
    private WebElement continueButtonPaymentMethod;

    @FindBy(css = "input[id='button-confirm']")
    private WebElement confirmOrderButton;

    @FindBy(xpath = "//h1[text()='Your order has been placed!']")
    private WebElement successMessageForCase17;

    @FindBy(css = "table[class='table table-bordered table-hover']")
    private WebElement correctAndProperDetailsInConfirmOrder;

    @FindBy(xpath = "//h2[text()='Bank Transfer Instructions']")
    private WebElement bankTransferInsFromConfirmOrderStep;

    @FindBy(css = "input[id='button-login']")
    private WebElement loginButtonInCheckOut;

    @FindBy(css = "input[value='existing']")
    private WebElement iWantToUseExistingAddressCheckbox;

    @FindBy(css = "input[id='button-payment-address']")
    private WebElement continueButtonBillingDetailsLogin;

    @FindBy(xpath = "(//input[@value='new'])[2]")
    private WebElement iWantToUseNewAddressCheckBox;

    @FindBy(xpath = "//div[text()='First Name must be between 1 and 32 characters!']")
    private WebElement firstNameWarningMessage;

    @FindBy(xpath = "//div[text()='Last Name must be between 1 and 32 characters!']")
    private WebElement lastNameWarningMessage;

    @FindBy(xpath = "//div[text()='Address 1 must be between 3 and 128 characters!']")
    private WebElement addressWarningMessage;

    @FindBy(xpath = "//div[text()='City must be between 2 and 128 characters!']")
    private WebElement cityWarningMessage;

    @FindBy(id = "button-payment-address")
    private WebElement continueBillingDetails;

    @FindBy(css = "div#content>p")
    private WebElement shoppingCartEmptyMessage;

    public WebElement getContinueButtonBillingDetailsLogin() {
        return continueButtonBillingDetailsLogin;
    }

    public WebElement getLoginButtonInCheckOut() {
        return loginButtonInCheckOut;
    }

    public WebElement getiWantToUseExistingAddressCheckbox() {
        return iWantToUseExistingAddressCheckbox;
    }

    public WebElement getBankTransferInsFromConfirmOrderStep() {
        return bankTransferInsFromConfirmOrderStep;
    }

    public WebElement getCorrectAndProperDetailsInConfirmOrder() {
        return correctAndProperDetailsInConfirmOrder;
    }

    public WebElement getShoppingCartLinkFromSuccessMessage() {
        return shoppingCartLinkFromSuccessMessage;
    }

    public WebElement getCheckOutButtonFromCart() {
        return checkOutButtonFromCart;
    }

    public WebElement getCheckOutPageHeader() {
        return checkOutPageHeader;
    }

    public WebElement getContinueButtonFromCheckoutPage() {
        return continueButtonFromCheckoutPage;
    }

    public WebElement getYourPersonalDetailsHeader() {
        return yourPersonalDetailsHeader;
    }

    public WebElement getMyDeliveryAndBillingAddressCheckBox() {
        return myDeliveryAndBillingAddressCheckBox;
    }

    public List<WebElement> getYourPersonalDetailsElements() {
        return yourPersonalDetailsElements;
    }

    public WebElement getPasswordYourPersonalDetails() {
        return passwordYourPersonalDetails;
    }

    public WebElement getConfirmPasswordYourPersonalDetails() {
        return confirmPasswordYourPersonalDetails;
    }

    public WebElement getSelectCountry() {
        return selectCountry;
    }

    public WebElement getSelectRegion() {
        return selectRegion;
    }

    public WebElement getPrivacyPolicyBox() {
        return privacyPolicyBox;
    }

    public WebElement getContinueButtonFromCheckout() {
        return ContinueButtonFromCheckout;
    }

    public WebElement getContinueButtonBillingDetails() {
        return continueButtonBillingDetails;
    }

    public WebElement getContinueButtonDeliveryDetail() {
        return continueButtonDeliveryDetail;
    }

    public WebElement getContinueButtonDeliveryMethod() {
        return continueButtonDeliveryMethod;
    }

    public WebElement getFlatRate() {
        return flatRate;
    }

    public WebElement getFlatRateRadioButton() {
        return flatRateRadioButton;
    }

    public WebElement getVerifyTextForPaymentMethod() {
        return verifyTextForPaymentMethod;
    }

    public WebElement getBankTransferCheckBox() {
        return bankTransferCheckBox;
    }

    public WebElement getTermsAndConditionCheckBoxPaymentMethod() {
        return termsAndConditionCheckBoxPaymentMethod;
    }

    public WebElement getContinueButtonPaymentMethod() {
        return continueButtonPaymentMethod;
    }

    public WebElement getConfirmOrderButton() {
        return confirmOrderButton;
    }

    public WebElement getSuccessMessageForCase17() {
        return successMessageForCase17;
    }

    public WebElement getiWantToUseNewAddressCheckBox() {
        return iWantToUseNewAddressCheckBox;
    }

    public WebElement getFirstNameWarningMessage() {
        return firstNameWarningMessage;
    }

    public WebElement getLastNameWarningMessage() {
        return lastNameWarningMessage;
    }

    public WebElement getAddressWarningMessage() {
        return addressWarningMessage;
    }

    public WebElement getCityWarningMessage() {
        return cityWarningMessage;
    }

    public WebElement getContinueBillingDetails() {
        return continueBillingDetails;
    }

    public WebElement getShoppingCartEmptyMessage() {
        return shoppingCartEmptyMessage;
    }
}
