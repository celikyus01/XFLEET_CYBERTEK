package com.xfleet.step_definitions;

import com.xfleet.pages.VehicleOdometerPages;
import com.xfleet.utilities.BrowserUtils;
import com.xfleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CV_Odometer_stepDef {


    @When("the user clicks  button Create Vehicle Odometer")
    public void the_user_clicks_button_Create_Vehicle_Odometer() {
        BrowserUtils.waitFor(3);
        Driver.get().findElement(By.xpath("//a[@title='Create Vehicle Odometer']")).click();
        BrowserUtils.waitFor(3);
        BrowserUtils.waitForPageToLoad(5);

    }
///

    @Then("Verify that {string} displayed")
    public void verify_that_displayed(String string) {

        String actual = Driver.get().findElement(By.xpath("//div[@class='pull-left pull-left-extra']")).getText();

        String expected ="Entities / Vehicle Odometer / Create Vehicle Odometer";

        Assert.assertEquals(expected,actual);
    }



}
//
//
//
//

