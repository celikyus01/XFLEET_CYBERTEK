package com.xfleet.step_definitions;

import com.xfleet.pages.DashboardPage;
import com.xfleet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class vehicle_SidebarWidget_stepDef {

    @When("the user clicks plus sign")
    public void the_user_clicks_plus_sign() {

        new DashboardPage().plusSign.click();
        BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitFor(2);

    }

    @Then("Sidebar Widgets should displayed")
    public void sidebar_Widgets_should_displayed() {

        String expectedTitle = "Sidebar Widgets";
        String actualTitle = new DashboardPage().sidebarWidgets.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("the user clicks on {string} recent emails add button")
    public void the_user_clicks_on_recent_emails_add_button(String string) {

        new DashboardPage().clickAddButton(string);
    }

    @Then("added  {string} should be displayed")
    public void added_should_be_displayed(String string) {

        String expected = "Added (5)";
        String actual = new DashboardPage().getTextAdd(string);
        Assert.assertEquals(expected,actual);

    }
}
