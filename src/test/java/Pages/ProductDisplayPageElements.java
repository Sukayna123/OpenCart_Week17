package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import freemarker.ext.jsp.TaglibFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayPageElements extends MyMethods {
    public ProductDisplayPageElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(name = "search")
    public WebElement inputBox;

//    @FindBy(xpath = "//button[@class='btn btn-default btn-lg'")
//    public WebElement searchIcon;


    @FindBy(css = "button[class='btn btn-default btn-lg']")
    private WebElement searchIconButton;

    @FindBy(xpath = "//img[@class='img-responsive']")
    public WebElement singleProductDisplayed;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/h1")
    public WebElement productName;

    @FindBy(xpath = "//li[text()='Brands ']")
    public WebElement brandName;

    @FindBy(xpath = "//li[text()='Product Code: Product 14']")
    public WebElement productCode;

    public WebElement getInputBox() {
        return inputBox;
    }

//    public WebElement getSearchIcon() {
//        return searchIcon;
//    }

    public WebElement getSingleProductDisplayed() {
        return singleProductDisplayed;
    }

    public WebElement getProductName() {
        return productName;
    }

    public WebElement getBrandName() {
        return brandName;
    }

    public WebElement getProductCode() {
        return productCode;
    }

    public WebElement getSearchIconButton() {
        return searchIconButton;
    }
}
