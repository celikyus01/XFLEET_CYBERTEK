package com.xfleet.step_definitions;

import com.xfleet.pages.VehicleOdometerPages;
import com.xfleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class vehicleOdometer_Info_stepDef {


    @Then("{string} subtitle should be displayed")
    public void subtitle_should_be_displayed(String expectedTitle) {

        BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitFor(3);
        String actualTitle = new VehicleOdometerPages().getSubtitleVehicleOdometer(expectedTitle);

        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @Then("the user clicks id {string}")
    public void the_user_clicks_id(String string) {

          BrowserUtils.waitForPageToLoad(5);
          BrowserUtils.waitFor(3);
          new VehicleOdometerPages().clickOdometers(string);
    }

    @Then("the users clicks {string} next to Driver name")
    public void the_users_clicks_next_to_Driver_name(String string) {

        new VehicleOdometerPages().clicksVehicleOdometer(string);
        BrowserUtils.waitForPageToLoad(5);
    }

    @Then("the user verifies {string} is dislayed")
    public void the_user_verifies_is_dislayed(String expected) {

        String actual = new VehicleOdometerPages().getVehicleOdometer(expected);

        Assert.assertEquals(expected,actual);

    }

}
