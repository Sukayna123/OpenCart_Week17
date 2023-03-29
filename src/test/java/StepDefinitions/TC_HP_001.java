package StepDefinitions;

import Pages.ShoppingCartElements;
import Utilities.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC_HP_001 {

    ShoppingCartElements se = new ShoppingCartElements();
    @And("Click on Continue Shopping button in the Shopping Cart Page")
    public void clickOnContinueShoppingButtonInTheShoppingCartPage() {
        se.clickMethod(se.getContinueShoppingButton());
    }

    @Then("User should be taken to Home Page")
    public void userShouldBeTakenToHomePage() {

        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("home"));


    }
}
