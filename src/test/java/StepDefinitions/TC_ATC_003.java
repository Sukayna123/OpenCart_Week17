package StepDefinitions;

import Pages.AddToCartElements;
import Utilities.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC_ATC_003 {
    AddToCartElements atc = new AddToCartElements();
    @Given("Navigate to Application")
    public void navigateToApplication() {
        DriverClass.getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
    }

    @When("Enter any existing Product name into the Search text box field as  {string}")
    public void enterAnyExistingProductNameIntoTheSearchTextBoxFieldAs(String product) {
        atc.sendKeysMethod(atc.getSearchBox(), product);
    }

    @And("Click on the button having search icon")
    public void clickOnTheButtonHavingSearchIcon() {
        atc.clickMethod(atc.getSearchIconButton());
    }

    @And("Click on Add to Cart option on the product that is displayed in the Search Results")
    public void clickOnAddToCartOptionOnTheProductThatIsDisplayedInTheSearchResults() {
        atc.clickMethod(atc.getAddToCartSingleProduct());
    }

    @Then("Success message with text - Success: You have added Product Name to your shopping cart! should be displayed")
    public void successMessageWithTextSuccessYouHaveAddedProductNameToYourShoppingCartShouldBeDisplayed() {
        atc.verifyIsDisplayedMethod(atc.getSuccessMessageAfterAddToCart());
    }

    @And("Click on Cart button which is in black color beside the search icon button on the top of the page")
    public void clickOnCartButtonWhichIsInBlackColorBesideTheSearchIconButtonOnTheTopOfThePage() {
        atc.clickMethod(atc.getBlackCartButton());
    }

    @And("Click on View Cart option in the displayed box")
    public void clickOnViewCartOptionInTheDisplayedBox() {
        atc.clickMethod(atc.getViewCartButton());
    }

    @Then("Product should be successfully displayed in the Shopping Cart page a {string}")
    public void productShouldBeSuccessfullyDisplayedInTheShoppingCartPageA(String product) {
        Assert.assertEquals(atc.getElementInTheCart().getText(), product);
    }
}
