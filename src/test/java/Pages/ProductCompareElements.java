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

    @FindBy(css = "#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(1) > div > a")
    private WebElement showAllDesktopsButton;

    @FindBy(id = "grid-view")
    private WebElement gridViewButton;

    @FindBy(linkText = "Desktops")
    private WebElement desktopsButton;


    @FindBy(id = "list-view")
    public WebElement ListViewButton;

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

    public WebElement getShowAllDesktopsButton() {
        return showAllDesktopsButton;
    }

    public WebElement getGridViewButton() {
        return gridViewButton;
    }

    public WebElement getDesktopsButton() {
        return desktopsButton;
    }

    public WebElement getListViewButton() {
        return ListViewButton;
    }
}
