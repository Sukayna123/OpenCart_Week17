package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayPageElements extends MyMethods {
    public ProductDisplayPageElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(css = "img[class='img-responsive']")
    private WebElement singleProductAfterSearch;

    @FindBy(css = "div>h3")
    private WebElement relatedProductsHeader;

    @FindBy(xpath = "//a[text()='Description']")
    private WebElement descriptionTab;

    @FindBy(css = ".tab-content")
    private WebElement descriptionText;

    public WebElement getDescriptionText() {
        return descriptionText;
    }

    public WebElement getDescriptionTab() {
        return descriptionTab;
    }

    public WebElement getSingleProductAfterSearch() {
        return singleProductAfterSearch;
    }

    public WebElement getRelatedProductsHeader() {
        return relatedProductsHeader;
    }
}
