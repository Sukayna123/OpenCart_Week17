package StepDefinitions;

import Pages.ProductCompareElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC_PC_010 {
    ProductCompareElements pc = new ProductCompareElements();

    @And("Click on Product compare link")
    public void clickOnProductCompareLink() {
        pc.clickMethod(pc.getProductCompareLink());
    }

    @Then("User should be see You have not chosen any products to compare message on the page")
    public void userShouldBeSeeYouHaveNotChosenAnyProductsToCompareMessageOnThePage() {
        Assert.assertNotSame(pc.getProductComparisonHeader().getText(), "You have not chosen any products to compare.");
    }
}
