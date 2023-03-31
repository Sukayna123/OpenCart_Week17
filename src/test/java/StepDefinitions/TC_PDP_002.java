package StepDefinitions;

import Pages.ProductDisplayPageElements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_PDP_002 {
    ProductDisplayPageElements pd=new ProductDisplayPageElements();
    @When("Enter any existing {string} into the Search box")
    public void enterAnyExistingIntoTheSearchBox(String product) {
        pd.sendKeysMethod(pd.getInputBox(),product);
        pd.setWait(2);
        pd.clickMethod(pd.getSearchIconButton());
        pd.clickMethod(pd.getSingleProductDisplayed());

    }

    @Then("Check the Product Name, Brand and Product Code in the displayed Product Display Page")
    public void checkTheProductNameBrandAndProductCodeInTheDisplayedProductDisplayPage() {

        pd.verifyIsDisplayedMethod(pd.getProductName());
        pd.verifyIsDisplayedMethod(pd.getBrandName());
        pd.verifyIsDisplayedMethod(pd.getProductCode());

    }
}
