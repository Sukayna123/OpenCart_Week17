package StepDefinitions;

import Pages.RegisterElements;
import Utilities.DriverClass;
import io.cucumber.java.en.Given;

public class Login {

    RegisterElements re = new RegisterElements();
    @Given("Login")
    public void login() {
        DriverClass.getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
        re.clickMethod(re.getMyAccount());
        re.clickMethod(re.getLogin());
        re.sendKeysMethod(re.getEmail(), "technoS@gmail.com");
        re.sendKeysMethod(re.getPassword(), "batch07");
        re.clickMethod(re.getLoginButton());

    }
}
