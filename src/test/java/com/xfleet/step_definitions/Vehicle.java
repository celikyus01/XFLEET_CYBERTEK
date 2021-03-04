package com.xfleet.step_definitions;

import com.xfleet.pages.DashboardPage;
import com.xfleet.pages.LoginPage;
import com.xfleet.pages.VehiclePages;
import com.xfleet.pages.Vehicle_GeneralInfo;
import com.xfleet.utilities.BrowserUtils;
import com.xfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.client5.http.entity.mime.StringBody;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Vehicle {



    @When("the user selects car with licence number {string}")
    public void the_user_selects_car_with_licence_number(String licenceNumber) {
        BrowserUtils.waitFor(5);

        String locator = "//td[2][.='"+licenceNumber+"']";
        WebElement car = Driver.get().findElement(By.xpath(locator));


        car.click();

        BrowserUtils.waitFor(3);


        String actualSubtitle = new Vehicle_GeneralInfo().generalInformationSubtitle.getText();

        Assert.assertEquals("gerneral information page cannot be verified","General Information",actualSubtitle );


        BrowserUtils.waitFor(3);

    }

    @When("the user clicks on {string} button")
    public void the_user_clicks_on_button(String buttonTitle) {

       DashboardPage dashboard = new DashboardPage();
       dashboard.clickButton(buttonTitle);



    }

    @When("the user fills in the blank as {string} and {string}")
    public void the_user_fills_in_the_blank_as_and(String string, String string2) {

    }

    @Then("the user verifies the message {string}")
    public void the_user_verifies_the_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user verifies the data as {string} and {string} for the licence number {string}")
    public void the_user_verifies_the_data_as_and_for_the_licence_number(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @And("the user click grid settings")
    public void theUserClickGridSettings() {

        BrowserUtils.waitFor(4);
        VehiclePages vehiclePages = new VehiclePages();

        vehiclePages.GridButton.click();

    }
}
