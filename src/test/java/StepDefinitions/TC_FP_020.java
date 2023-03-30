package StepDefinitions;

import Pages.ForgotPasswordElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class TC_FP_020 {

ForgotPasswordElements fp=new ForgotPasswordElements();
    @When("click my account")
    public void clickMyAccount() {
        fp.clickMethod(fp.getMyAccount());
    }

    @And("click login")
    public void clickLogin() {
        fp.clickMethod(fp.getLoginButtonHomePage());
    }

    @And("Click on Forgotten Password option from the Right Column")
    public void clickOnForgottenPasswordOptionFromTheRightColumn() {
fp.setWait(3);
fp.clickMethod(fp.getForgotPasswordRightColumn1());
    }
}
