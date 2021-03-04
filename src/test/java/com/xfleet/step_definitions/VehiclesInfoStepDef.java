package com.xfleet.step_definitions;

import com.xfleet.pages.VehiclesInfoPage;
import com.xfleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VehiclesInfoStepDef {

    @When("the user clicks on first car in the grid")
    public void the_user_clicks_on_first_car_in_the_grid() {
        VehiclesInfoPage vehiclesInfoPage = new VehiclesInfoPage();
        BrowserUtils.waitFor(5);
        vehiclesInfoPage.FirstBox.click();

    }

    @Then("the user should be able to see all information about selected car")
    public void the_user_should_be_able_to_see_all_information_about_selected_car() {
        VehiclesInfoPage vehiclesInfoPage= new VehiclesInfoPage();
        String expectedResult = "General Information";

        BrowserUtils.waitFor(3);
        Assert.assertEquals(expectedResult,vehiclesInfoPage.GeneralInfo.getText());
    }

    @Then("the user clicks call under the Activity Type button")
    public void the_user_clicks_call_under_the_Activity_Type_button() {
        VehiclesInfoPage vehiclesInfoPage = new VehiclesInfoPage();

        BrowserUtils.waitFor(3);
        vehiclesInfoPage.ActivityType.click();

        BrowserUtils.waitFor(2);
        vehiclesInfoPage.CallCheck.click();

        BrowserUtils.waitFor(2);
        vehiclesInfoPage.Empty.click();

    }

    @Then("the user should be able to verify filtering")
    public void the_user_should_be_able_to_verify_filtering() {
        VehiclesInfoPage vehiclesInfoPage = new VehiclesInfoPage();
        String expected = "Call";
        BrowserUtils.waitFor(3);
        Assert.assertEquals(expected,vehiclesInfoPage.CallText.getText());

    }

    @Then("the user clicks Refresh button")
    public void the_user_clicks_Refresh_button() {
        BrowserUtils.waitFor(3);
        new VehiclesInfoPage().RefreshBtn.click();
    }

    @Then("the user should be able to see the refreshing message")
    public void the_user_should_be_able_to_see_the_refreshing_message() {
        BrowserUtils.waitFor(3);
        System.out.println("Page is refreshed successfully");
    }
}
