package StepDefinitions;

import Pages.ProductDisplayPageElements;
import Pages.WishListElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC_WL_004 {

    WishListElements we = new WishListElements();
    ProductDisplayPageElements pde = new ProductDisplayPageElements();
    @And("Select Mac subcategory option from the left side options")
    public void selectMacSubcategoryOptionFromTheLeftSideOptions() {
        pde.clickMethod(pde.getMacButton());
    }

    @And("Click on Add to Wish List option")
    public void clickOnAddToWishListOption() {
        pde.clickMethod(pde.getAddToWishListButton());
    }



    @And("Click on Wish List link in the success message")
    public void clickOnWishListLinkInTheSuccessMessage() {
        pde.clickMethod(pde.getWishListLink());
    }


    @Then("Success message with text - Success: You have added Product Name to your wish list! should be displayed")
    public void successMessageWithTextSuccessYouHaveAddedProductNameToYourWishListShouldBeDisplayed() {
        Assert.assertTrue(pde.verifyIsDisplayedMethod(pde.getWishListSuccessMessage()));
    }

    @Then("Product should be successfully displayed in the My Wish List page")
    public void productShouldBeSuccessfullyDisplayedInTheMyWishListPage() {
        Assert.assertTrue(we.verifyIsDisplayedMethod(we.getProductIMac()));
    }
}
