package StepDefinitions;

import Pages.ShoppingCartElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

public class TC_SC_018 {
    ShoppingCartElements sc=new ShoppingCartElements();

    @And("Click on Add to Cart button in the displayed Product Display page")
    public void clickOnAddToCartButtonInTheDisplayedProductDisplayPage() {
        sc.clickMethod(sc.getAddToCartButtonAfterClickElement());
    }

    @And("Click on Use Coupon Code section")
    public void clickOnUseCouponCodeSection() {
        sc.clickMethod(sc.getUseCouponCodeLink());
    }

    @When("Don't enter any Coupon code into the Enter your coupon here text field")
    public void donTEnterAnyCouponCodeIntoTheEnterYourCouponHereTextField() {
    }

    @And("Click on Apply Coupon button")
    public void clickOnApplyCouponButton() {
        sc.clickMethod(sc.getApplyCouponLink());
    }

    @And("Click on x option on the displayed warning message")
    public void clickOnXOptionOnTheDisplayedWarningMessage() {
        sc.clickMethod(sc.getCloseWarningMessageButton());
    }

    @Then("Warning message should disappear.")
    public void warningMessageShouldDisappear() {
        try{
            Assert.assertFalse(sc.getPleaseEnterCouponAlertMessage().isDisplayed());
        }
        catch (NoSuchElementException e){
            Assert.assertTrue(true);
        }
    }
}
