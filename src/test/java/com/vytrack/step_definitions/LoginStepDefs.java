package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.*;

public class LoginStepDefs {


    private final LoginPage loginPage;   // we create a referance variable

    public LoginStepDefs(LoginPage loginPage){    // we are intantiatiate in public constructor
        this.loginPage = loginPage;
    }


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.get().get("https://qa1.vytrack.com/");
        System.out.println("I am on the login page");
    }

    @When("user logs in as a store manager")
    public void user_logs_in_as_a_store_manager() {
        loginPage.login("storemanager85", "UserUser123");
        System.out.println("Trying to login as store manager");
    }

    @Then("user should be able to see Dashboard page title")
    public void user_should_be_able_to_see_dashboard_page_title() {

        System.out.println("I see that page title is a Dashboard");
    }

    @When("user logs in as a sales manager")
    public void user_logs_in_as_a_sales_manager() {
        loginPage.login("salesmanager110", "UserUser123");
        System.out.println("Trying to login as sales manager");
    }

    @When("user logs in as a driver")
    public void user_logs_in_as_a_driver() {
        loginPage.login("user10", "UserUser123");
        System.out.println("Trying to login as driver");
    }

    @When("user logs in with {string} and {string} credentials")
    public void user_logs_in_with_and_credentials(String username, String password) {
        System.out.println("Trying to login with username and password");
    }
    
    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        loginPage.login(username, password);
        System.out.printf("Enter username  %s, and password %s to login\n", username, password);
    }


}
