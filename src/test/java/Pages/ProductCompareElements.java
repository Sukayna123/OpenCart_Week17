package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCompareElements extends MyMethods {
    public ProductCompareElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
    @FindBy(css = "button[data-toggle='tooltip']:nth-child(3)")
    private WebElement compareProductButtonSingleProduct;

    @FindBy(css = "div[class='alert alert-success alert-dismissible']")
    private WebElement addingComparisonSuccessMessage;

    @FindBy(xpath = "//a[text()='product comparison']")
    private WebElement productComparisonLinkFromMessage;

    @FindBy(xpath = "//h1[text()='Product Comparison']")
    private WebElement productComparisonHeader;

    @FindBy(xpath = "//strong[text()='Product Details']")
    private WebElement ProductDetailsHeaderInComparisonPage;

    public WebElement getCompareProductButtonSingleProduct() {
        return compareProductButtonSingleProduct;
    }

    public WebElement getAddingComparisonSuccessMessage() {
        return addingComparisonSuccessMessage;
    }

    public WebElement getProductComparisonLinkFromMessage() {
        return productComparisonLinkFromMessage;
    }

    public WebElement getProductComparisonHeader() {
        return productComparisonHeader;
    }

    public WebElement getProductDetailsHeaderInComparisonPage() {
        return ProductDetailsHeaderInComparisonPage;
    }
}
