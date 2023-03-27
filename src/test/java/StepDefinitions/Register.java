package StepDefinitions;

import Pages.RegisterElements;
import Utilities.DriverClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;

public class Register {

    RegisterElements re = new RegisterElements();
    @Given("Navigate to web site")
    public void navigateToWebSite() {
        DriverClass.getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");

    }

    @When("Click on My Account dropdown menu")
    public void clickOnMyAccountDropdownMenu() {
        re.clickMethod(re.getMyAccount());
    }

    @And("Click on Register")
    public void clickOnRegister() {
        re.clickMethod(re.getRegister());
    }

    @And("Fill the fields, first name, last name, email, telephone, password, confirm password, privacy policy")
    public void fillTheFieldsFirstNameLastNameEmailTelephonePasswordConfirmPasswordPrivacyPolicy(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        re.sendKeysMethod(re.getFirstName(), dataList.get(0));
        re.sendKeysMethod(re.getLastName(),dataList.get(1));
        re.sendKeysMethod(re.getEmail(), dataList.get(2));
        re.sendKeysMethod(re.getTelephone(), dataList.get(3));
        re.sendKeysMethod(re.getPassword(), dataList.get(4));
        re.sendKeysMethod(re.getPasswordConfirm(), dataList.get(5));
        re.clickMethod(re.getPrivacyPolicy());

    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        re.clickMethod(re.getContinueButton());
    }

    @And("Click on Continue button of Account Success page")
    public void clickOnContinueButtonOfAccountSuccessPage() {
        re.clickMethod(re.getContinueButtonSecondPage());
    }
}
