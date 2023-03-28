package StepDefinitions;

import Pages.ProductCompareElements;
import Utilities.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TC_PC_001 {
    ProductCompareElements pc=new ProductCompareElements();
    @When("Hover the mouse cursor on Compare this Product option from the displayed Product Display Page")
    public void hoverTheMouseCursorOnCompareThisProductOptionFromTheDisplayedProductDisplayPage() {
        Actions actions=new Actions(DriverClass.getDriver());
        Action action=actions.moveToElement(pc.getCompareProductButtonSingleProduct()).build();
        action.perform();
    }

    @Then("Tool tip with the text Compare this Product should be displayed")
    public void toolTipWithTheTextCompareThisProductShouldBeDisplayed() {
        pc.verifyIsDisplayedMethod(pc.getCompareProductButtonSingleProduct());
    }

    @When("Click Compare this Product option")
    public void clickCompareThisProductOption() {
        pc.clickMethod(pc.getCompareProductButtonSingleProduct());
    }

    @Then("Success message with text Success: You have added Product Name to your product comparison! should be displayed")
    public void successMessageWithTextSuccessYouHaveAddedProductNameToYourProductComparisonShouldBeDisplayed() {
        pc.verifyIsDisplayedMethod(pc.getAddingComparisonSuccessMessage());
    }

    @And("Click on product comparison link from the displayed success message")
    public void clickOnProductComparisonLinkFromTheDisplayedSuccessMessage() {
        pc.clickMethod(pc.getProductComparisonLinkFromMessage());
    }

    @Then("User should be taken to the Product Comparison page with the details of the Product that we have added for comparison.")
    public void userShouldBeTakenToTheProductComparisonPageWithTheDetailsOfTheProductThatWeHaveAddedForComparison() {
        pc.verifyIsDisplayedMethod(pc.getProductComparisonHeader());
        pc.verifyIsDisplayedMethod(pc.getProductDetailsHeaderInComparisonPage());
    }
}
