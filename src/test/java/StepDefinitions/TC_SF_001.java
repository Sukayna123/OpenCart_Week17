package StepDefinitions;

import Pages.SearchElements;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TC_SF_001 {
    SearchElements sc = new SearchElements();

    @Then("Searched product should be displayed in the search results")
    public void searchedProductShouldBeDisplayedInTheSearchResults() {

        for (WebElement element : sc.getListOfElementAfterSearch()) {
            Assert.assertTrue(element.getText().contains("iMac"));
        }
    }
}