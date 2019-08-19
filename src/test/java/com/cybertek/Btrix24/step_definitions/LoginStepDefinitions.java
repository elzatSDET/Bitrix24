package com.cybertek.Btrix24.step_definitions;

import com.cybertek.Btrix24.utilities.BrowserUtils;
import com.cybertek.Btrix24.utilities.ConfigurationReader;
import com.cybertek.Btrix24.utilities.Driver;
import com.cybertek.Btrix24.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class LoginStepDefinitions {
    Pages pages = new Pages();
    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        pages.loginPage().goToLandingPage();
    }
    @Then("user logs in as a marketing")
    public void user_logs_in_as_a_marketing() {
        BrowserUtils.waitPlease(2);
        String username = ConfigurationReader.getProperty("marketingusername");
        BrowserUtils.waitPlease(2);
        String password = ConfigurationReader.getProperty("marketingpassword");
        pages.loginPage().login(username, password);
    }
    @Then("user verifies that {string} page name is displayed")
    public void user_verifies_that_page_name_is_displayed(String expected) {
        Assert.assertEquals(expected,  pages.dashboardPage().getPageSubTitle());
    }
    @Then("user logs in with {string} username and {string} password")
    public void user_logs_in_with_username_and_password(String string, String string2) {
        pages.loginPage().login(string, string2);
    }

    //this is temporary solution until we start using hooks
    @Then("user quits")
    public void user_quits() {
        Driver.closeDriver();
    }


    @Given("user logs in with following credentials")
    public void user_logs_in_with_following_credentials(Map<String, String> values) {
        pages.loginPage().login(values.get("username"), values.get("password"));

    }

    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String role) {
        pages.loginPage().login(role);
    }


    @Then("user add the {string} and click send to create a Task")
    public void user_add_the_task_name_and_click_send_to_create_a_Task(String value) {
        pages.task().clickTask();
        pages.task().InputTaskName(value);
        pages.task().clickSend();

    }

    @When("user click link option and add {string} and {string}")
    public void user_click_link_option_and_add_and(String string, String string2) {
       pages.task().clickLink();
       pages.task().InputText(string);
       pages.task().InputLink(string2);
       pages.task().clickSave();

    }

    @Then("user finish the Task creation")
    public void user_finish_the_Task_creation() {
        pages.task().clickSend1();

    }

    @Then("user add the task name and set a deadline to finish the Task creation")
    public void user_add_the_task_name_and_set_a_deadline_to_finish_the_Task_creation() {
        pages.task().clickTask();
        pages.task().clickDeadLineBox();
        pages.task().clickDate();
        pages.task().clickSelect();
        pages.task().clickSend();

    }
}