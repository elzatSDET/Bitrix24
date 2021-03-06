package com.cybertek.Btrix24.step_definitions;

import com.cybertek.Btrix24.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class TopMenuDefinitions {

    Pages pages = new Pages();


    @Then("user navigates to {string} and {string}")
    public void user_navigation_to_and(String tab, String module) {
        pages.dashboardPage().navigateToModule(tab, module);
    }


    @Then("user name should be {string}")
    public void user_name_should_be(String expected) {
        Assert.assertEquals(expected, pages.dashboardPage().getUserMenuName());
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expected) {
        Assert.assertEquals(expected, pages.dashboardPage().getPageTitle());
    }

}