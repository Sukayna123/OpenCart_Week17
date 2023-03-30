package StepDefinitions;

import Pages.AddToCartElements;
import Pages.SearchElements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TC_SF_001 {
    AddToCartElements ac = new AddToCartElements();
    SearchElements sc = new SearchElements();
    @When("Enter any existing product name into the Search text box field  <iMac>")
    public void enterAnyExistingProductNameIntoTheSearchTextBoxFieldIMac() {
    }

    @Then("Searched product should be displayed in the search results")
    public void searchedProductShouldBeDisplayedInTheSearchResults() {
        for (WebElement element: sc.getListOfElementAfterSearch()){
            Assert.assertTrue(element.getText().contains("iMac"));
        }
    }
}
