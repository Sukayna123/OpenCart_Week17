package StepDefinitions;

import Pages.ProductCompareElements;
import Utilities.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TC_PC_004 {
    ProductCompareElements pc=new ProductCompareElements();
    @When("Hover the mouse on any Menu say Desktops and select Show All Desktops option")
    public void hoverTheMouseOnAnyMenuSayDesktopsAndSelectShowAllDesktopsOption() {

       // Actions actions=new Actions(DriverClass.getDriver());
       // Action hoverOverElement=actions.moveToElement(pc.getDesktopsButton()).build();
       // pc.hoverOver(pc.getDesktopButtonHomePAge());
        pc.clickMethod(pc.getDesktopsButton());
        pc.clickMethod(pc.getShowAllDesktopsButton());
    }

    @And("In the displayed Desktops category page, select List View option")
    public void inTheDisplayedDesktopsCategoryPageSelectListViewOption() {
        pc.clickMethod(pc.getListViewButton());
    }

    @And("Hover the mouse cursor on Compare this Product option available on the Product that is displayed in the Product Category page")
    public void hoverTheMouseCursorOnCompareThisProductOptionAvailableOnTheProductThatIsDisplayedInTheProductCategoryPage() {
        pc.hoverOver(pc.getCompareThisProductButton());
    }

    @And("Select Compare this Product option")
    public void selectCompareThisProductOption() {
        pc.clickMethod(pc.getCompareThisProductButton());
    }

    @Then("click on product comparison link from the displayed success message")
    public void clickOnProductComparisonLinkFromTheDisplayedSuccessMessage() {
        pc.clickMethod(pc.getProductComparisonLinkFromMessage());
    }
}
