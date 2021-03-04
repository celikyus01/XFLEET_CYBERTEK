package com.xfleet.step_definitions;

import com.xfleet.pages.BasePage;
import com.xfleet.pages.LoginPage;
import com.xfleet.utilities.BrowserUtils;
import com.xfleet.utilities.ConfigurationReader;
import com.xfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class login_stepDef {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }


    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {

        new LoginPage().login(username, password);
        BrowserUtils.waitFor(3);

    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
        BrowserUtils.waitFor(4);
        BrowserUtils.waitForPageToLoad(5);
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(4);
        BrowserUtils.waitForPageToLoad(5);
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() {
        String username = ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @When("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information() {
        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should be able to redirected to the homepage")
    public void theUserShouldBeAbleToRedirectedToTheHomepage() {
        BrowserUtils.waitFor(3);
        String actualTitle= Driver.get().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);
    }

    @When("the user should be able to click on {string} button")
    public void theUserShouldBeAbleToClickOnForgotYourPasswordButton(String username, String password) {
        LoginPage loginPage=new LoginPage();
        loginPage.login(username, password);

    }


    @When("the user logs in using following credentials")
    public void theUserLogsInUsingFollowingCredentials() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

//    }

    @Then("the title should be Vehicles")
    public void theTitleShouldBeVehicles(String expectedTitle) {
        System.out.println("expectedTitle = " + expectedTitle);
        BrowserUtils.waitFor(5);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
    }

    @And("the user click {string}")
    public void theUserClick(String arg0) {
        
    }

    @And("make a quick search about cars information and then click search button")
    public void makeAQuickSearchAboutCarsInformationAndThenClickSearchButton() {
        
    }

    @And("the user click {string} and {string} buttons to change the pages")
    public void theUserClickAndButtonsToChangeThePages(String arg0, String arg1) {
        
    }

    @Then("visualize the number of records and pages truly on the webpage")
    public void visualizeTheNumberOfRecordsAndPagesTrulyOnTheWebpage() {
        
    }

    @And("the user click {string} drop-down tab")
    public void theUserClickDropDownTab(String arg0) {
        
    }

    @Then("visualize actively the number of pages in multiples of {int} if any enough records and pages are already saved")
    public void visualizeActivelyTheNumberOfPagesInMultiplesOfIfAnyEnoughRecordsAndPagesAreAlreadySaved(int arg0) {
        
    }

    @When("the user navigates to Fleet, Vehicle Odometer")
    public void theUserNavigatesToFleetVehicleOdometer() {
        
    }

    @Then("the subtitle should be Vehicles Odometers")
    public void theSubtitleShouldBeVehiclesOdometers() {
        
    }

    @And("the user click {string} tab")
    public void theUserClickTab(String arg0) {
        
    }

    @Then("push {string} button and then click one or more checkbox and push {string} button")
    public void pushButtonAndThenClickOneOrMoreCheckboxAndPushButton(String arg0, String arg1) {
        
    }

    @Then("push {string} button and then click one or more checkboxes and push {string} button")
    public void pushButtonAndThenClickOneOrMoreCheckboxesAndPushButton(String arg0, String arg1) {
        
    }

    @And("Click {string} tab near to {string} tab and observe {string} button is active here as well.")
    public void clickTabNearToTabAndObserveButtonIsActiveHereAsWell(String arg0, String arg1, String arg2) {
    }

    @When("the user navigates to {string}, {string}")
    public void theUserNavigatesTo() {

    }
}
