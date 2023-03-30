package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import freemarker.ext.jsp.TaglibFactory;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.ref.WeakReference;

public class ProductDisplayPageElements extends MyMethods {
    public ProductDisplayPageElements() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='search']")
    public WebElement inputBoxHomePage;
    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    public WebElement searchIcon;

    @FindBy(xpath = "//div[@class='caption']//a[1]")
    public WebElement productFromProductDisplay;

    @FindBy(xpath = "//div[@class='button-group']//button[1]")
    public WebElement addToCartButtonProductDisplayPage;

    @FindBy(xpath = "//div[@id='cart']//button")
    public WebElement cartBlackButtonTopOfPage;

    @FindBy(linkText = "http://opencart.abstracta.us:80/index.php?route=product/product&amp;product_id=41&amp;search=iMac")
    public WebElement productNameFromProductDisplayPage;
}
