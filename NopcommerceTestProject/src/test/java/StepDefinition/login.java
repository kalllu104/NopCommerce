package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class login {
    @Given("User on {string} browser and homepage{string}")
    public void userOnBrowserAndHomepage(String arg0, String arg1) {

        BaseClass.driverinit(arg0,arg1);
    }

    @When("User enter valid {string} and {string}")
    public void user_enter_valid_and(String string, String string2) {

        BaseClass.homepageObject.Enter_Username(string);
        BaseClass.homepageObject.Enter_Password(string2);

    }


    @Then("User should login successfully")
    public void user_should_login_successfully() {
        System.out.println("Logged In");
    }



}
