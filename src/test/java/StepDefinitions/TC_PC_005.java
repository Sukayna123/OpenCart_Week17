package StepDefinitions;

import Pages.ProductCompareElements;
import Utilities.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC_PC_005 {

    ProductCompareElements pe = new ProductCompareElements();
    @When("Hover the mouse on Desktops and select Show All Desktops option")
    public void hoverTheMouseOnDesktopsAndSelectShowAllDesktopsOption() {
        Actions actions = new Actions(DriverClass.getDriver());
        Action hoverOver = actions.moveToElement(pe.getDesktopsButton()).build();
        hoverOver.perform();
        pe.clickMethod(pe.getDesktopsButton());
        pe.wait.until(ExpectedConditions.visibilityOf(pe.getShowAllDesktopsButton()));
        pe.clickMethod(pe.getShowAllDesktopsButton());
    }

    @And("Select Grid view")
    public void selectGridView() {
        pe.clickMethod(pe.getGridViewButton());
    }
}
