package com.xfleet.step_definitions;

import com.xfleet.pages.DashboardPage;
import com.xfleet.utilities.BrowserUtils;
import com.xfleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class VehicleGeneral_Info_stepDef {

    @When("the user navigates to {string} -- {string}")
    public void the_user_navigates_to(String string, String string2) {
        new DashboardPage().navigateToModule( string,string2);
        BrowserUtils.waitFor(4);
        BrowserUtils.waitForPageToLoad(5);
    }

    @When("the user selects vehicle log with id1")
    public void the_user_selects_vehicle_log_with_id1() {
        Driver.get().findElement(By.xpath("(//tbody//tr)[1]")).click();
        BrowserUtils.waitFor(2);
        BrowserUtils.waitForPageToLoad(5);
    }

    @Then("the user seeing general information subtitle is displayed")
    public void the_user_seeing_general_information_subtitle_is_displayed() {
        String actual = Driver.get().findElement(By.xpath("//span[.='General Information']")).getText();

        String expected = "General Information";

        Assert.assertEquals(expected,actual);
    }

    @Then("the user clicks General button")
    public void the_user_clicks_General_button() {
        Driver.get().findElement(By.xpath("//a[.='General']")).click();
        BrowserUtils.waitFor(2);
        BrowserUtils.waitForPageToLoad(5);
    }

    @Then("General Information should be displayed")
    public void general_Information_should_be_displayed() {
        String actual = Driver.get().findElement(By.xpath("//h5")).getText();
        BrowserUtils.waitFor(2);
        String expected = "General Information";

        Assert.assertEquals(expected,actual);
    }

    @Then("the user clicks Activity Type button")
    public void the_user_clicks_Activity_Type_button() {
        Driver.get().findElement(By.xpath("//div[@class='btn filter-select filter-criteria-selector filter-default-value']")).click();
        BrowserUtils.waitFor(2);
        BrowserUtils.waitForPageToLoad(5);
    }

    @Then("Activity Type should be displayed")
    public void activity_Type_should_be_displayed() {

        String actual = Driver.get().findElement(By.xpath("//div[@class='btn filter-select filter-criteria-selector filter-default-value']")).getText();
        BrowserUtils.waitFor(2);
        String expected ="Activity Type: All";

        Assert.assertEquals(expected,actual);
    }






}
//
//
//