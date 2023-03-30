package StepDefinitions;

import Pages.WishListElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TC_WL_008 {
    WishListElements wl = new WishListElements();

    @And("Click on Wish List option from the Right Column options")
    public void clickOnWishListOptionFromTheRightColumnOptions() {
        wl.clickMethod(wl.getWishListButtonFromRightColumn());
    }

    @Then("User should be taken to My Wish List page")
    public void userShouldBeTakenToMyWishListPage() {
        wl.verifyIsDisplayedMethod(wl.getWishListTextFromBreadCrumb());
    }
}
