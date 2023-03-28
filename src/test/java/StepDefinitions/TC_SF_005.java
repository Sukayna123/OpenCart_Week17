package StepDefinitions;

import Pages.SearchElements;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC_SF_005 {
    SearchElements se=new SearchElements();
    @Then("More than one products should be displayed in the search results page")
    public void moreThanOneProductsShouldBeDisplayedInTheSearchResultsPage() {
        Assert.assertTrue(se.getListOfElementAfterSearch().size()>1);
    }
}
