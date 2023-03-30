package StepDefinitions;

import Pages.CheckoutElements;
import Pages.SearchElements;
import Pages.ShoppingCartElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC_SC_010 {

    SearchElements se = new SearchElements();
    CheckoutElements ce = new CheckoutElements();

    ShoppingCartElements sce = new ShoppingCartElements();
    @And("Click on the Product displayed in the Search results")
    public void clickOnTheProductDisplayedInTheSearchResults() {
        se.clickMethod(se.getProduct());

    }

    @And("Click on Add to Cart button displayed Product Display page")
    public void clickOnAddToCartButtonDisplayedProductDisplayPage() {
        se.clickMethod(se.getAddToCartButton());
    }

    @And("Click on the Remove icon option")
    public void clickOnTheRemoveIconOption() {
        sce.clickMethod(sce.getRemoveButton());
    }

    @Then("Product should be removed from the Shopping Cart page")
    public void productShouldBeRemovedFromTheShoppingCartPage() {
        Assert.assertTrue(ce.verifyIsDisplayedMethod(ce.getShoppingCartEmptyMessage()));
    }
}
