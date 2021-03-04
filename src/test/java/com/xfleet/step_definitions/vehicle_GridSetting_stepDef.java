package com.xfleet.step_definitions;

import com.xfleet.pages.DashboardPage;
import com.xfleet.pages.VehiclePages;
import com.xfleet.utilities.BrowserUtils;
import com.xfleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ve;
import org.junit.Assert;

public class vehicle_GridSetting_stepDef {

    @When("the user clicks {string} under the {string}")
    public void the_user_clicks_under_the(String string, String string2) {

        new DashboardPage().navigateToModule(string2,string);

    }

    @Then("the url should be changed")
    public void the_url_should_be_changed() {

        String expectedTitle = "http://qa.xfleetsolutions.com/entity/Extend_Entity_Carreservation";
        BrowserUtils.waitFor(2);
        BrowserUtils.waitForPageToLoad(5);
        Assert.assertTrue(Driver.get().getCurrentUrl().contains(expectedTitle));
        BrowserUtils.waitFor(2);
        BrowserUtils.waitForPageToLoad(5);


    }

    @Then("the user clicks Grid Settings button")
    public void the_user_clicks_Grid_Settings_button() {

        new VehiclePages().GridButton.click();
        BrowserUtils.waitForPageToLoad(5);

    }

    @Then("Grid Setting should be displayed")
    public void grid_Setting_should_be_displayed() {

        String expectedTitle = "Grid Settings";
        String actualTitle = new VehiclePages().getGridButtonTitle.getText();

        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @Then("the user clicks Quick Search -- {string}")
    public void the_user_clicks_Quick_Search(String string) {

          VehiclePages vehiclePages = new VehiclePages();

          BrowserUtils.waitForPageToLoad(5);
          vehiclePages.sendQuickSeach(string);

          BrowserUtils.waitFor(3);
          vehiclePages.selectGridSettings(string);
          BrowserUtils.waitFor(2);


    }

    @Then("{string} should be selected")
    public void should_be_selected(String expected) {

         Assert.assertEquals(expected,new VehiclePages().isSelected(expected));


    }


}
