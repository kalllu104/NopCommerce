package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {

    @Given("User is on {string} browser and enter Registration page {string}")
    public void userIsOnBrowserAndEnterRegistrationPage(String arg0, String arg1) {
        BaseClass.driverinit(arg0,arg1);
        BaseClass.homepageObject.Click_RegistrationLink();
    }

    @When("User enter all details")
    public void user_enter_all_details() {

    }
    @When("user click on register button")
    public void user_click_on_register_button() {
        System.out.println("Button click");
    }
    @Then("User registered")
    public void user_registered() {
        System.out.println("Registered");
    }



}
