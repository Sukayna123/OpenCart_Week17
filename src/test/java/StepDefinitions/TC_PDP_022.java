package StepDefinitions;

import Pages.ProductDisplayPageElements;
import Utilities.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC_PDP_022 {
    ProductDisplayPageElements pdp = new ProductDisplayPageElements();
//    @And("Click on the Related Products section in the displayed Product Display Page")
//    public void clickOnTheRelatedProductsSectionInTheDisplayedProductDisplayPage() {
//        pdp.verifyIsDisplayedMethod(pdp.getRelatedProductsHeader());
//    }
//
//    @Then("User should see the Product displayed in the Related Products section and is able ot click it and navigate to the Product Display Page of it")
//    public void userShouldSeeTheProductDisplayedInTheRelatedProductsSectionAndIsAbleOtClickItAndNavigateToTheProductDisplayPageOfIt() {
//        String urlBefore = DriverClass.getDriver().getCurrentUrl();
//        pdp.clickMethod(pdp.getRelatedProductsHeader());
//        String urlAfter = DriverClass.getDriver().getCurrentUrl();
//        Assert.assertNotEquals(urlBefore,urlAfter);
//    }
}
