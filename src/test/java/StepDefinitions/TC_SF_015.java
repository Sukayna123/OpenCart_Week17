package StepDefinitions;

import Pages.SearchElements;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC_SF_015 {
    SearchElements sc = new SearchElements();
    @Then("The selected number of products should be displayed in the current search page")
    public void theSelectedNumberOfProductsShouldBeDisplayedInTheCurrentSearchPage() {
        Assert.assertNotEquals(sc.getListOfElementAfterSearch().size(), sc.getShowDropDownButton().size());
    }
}
