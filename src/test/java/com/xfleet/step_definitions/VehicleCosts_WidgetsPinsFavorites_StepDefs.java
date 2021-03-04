package com.xfleet.step_definitions;

import com.xfleet.pages.DashboardPage;
import com.xfleet.pages.VehicleCosts;
import com.xfleet.utilities.BrowserUtils;
import com.xfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class VehicleCosts_WidgetsPinsFavorites_StepDefs {

    @When("the user clicks on Sidebar Widgets Add button number {string}")
    public void the_user_clicks_on_Sidebar_Widgets_Add_button_number(String nth) {
        new DashboardPage().clickAddButton(nth);
    }

    @And("the user clicks Sidebar Widgets Close button")
    public void theUserClicksSidebarWidgetsCloseButton() {
        new DashboardPage().widgetsClose.click();

    }

    @Then("the created {string} widget should be visible")
    public void theCreatedWidgetShouldBeVisible(String widgetName) {

        String modWidgetLocator = new VehicleCosts().modWidgetLocator(widgetName);
        Assert.assertTrue(Driver.get().findElement(By.cssSelector(modWidgetLocator)).isDisplayed());
    }

    @Given("the current state of {string} sign")
    public static void theCurrentStateOfSign(String button) {
        if (button.toLowerCase().equals("pin")) {
            VehicleCosts.pinStateIsSelected = new VehicleCosts().modPinOrFavoriteButtonLocator(button).getAttribute("class").contains("gold-icon");
        } else if (button.toLowerCase().equals("favorite")) {
            VehicleCosts.favoriteStateIsSelected = new VehicleCosts().modPinOrFavoriteButtonLocator(button).getAttribute("class").contains("gold-icon");
        }
    }

    @When("the user clicks the {string} sign")
    public void theUserClicksTheSign(String choice) {

        new VehicleCosts().modPinOrFavoriteButtonLocator(choice).click();
    }


    @Then("the {string} sign should change color \\(gray-gold)")
    public static void theSignShouldChangeColorGrayGold(String button) {
        BrowserUtils.waitFor(1);
        if (button.toLowerCase().equals("pin")) {
            boolean firstState = VehicleCosts.pinStateIsSelected;
            theCurrentStateOfSign(button);
            BrowserUtils.waitFor(1);
            boolean secondState = VehicleCosts.pinStateIsSelected;
            Assert.assertNotEquals(firstState, secondState);

        } else if (button.toLowerCase().equals("favorite")) {
            boolean firstState = VehicleCosts.favoriteStateIsSelected;
            theCurrentStateOfSign(button);
            BrowserUtils.waitFor(1);
            boolean secondState = VehicleCosts.favoriteStateIsSelected;
            Assert.assertNotEquals(firstState, secondState);
        }
    }

    @And("the pinned page visibility should change")
    public void thePinnedPageVisibilityShouldChange() {
        BrowserUtils.waitFor(1);
        if (VehicleCosts.pinStateIsSelected) {
            BrowserUtils.verifyElementDisplayed(new VehicleCosts().modPinHolderLocator());
        } else {
            List<WebElement> listOfPinHolderLocators = Driver.get().findElements(By.xpath("(//li[@class='pin-holder active']//a[@title='" + Driver.get().getTitle() + "'])[1]"));
            Assert.assertTrue(listOfPinHolderLocators.isEmpty());

        }
    }

    @When("the user clicks on dropdown menu of header")
    public void the_user_clicks_on_dropdown_menu_of_header() {
        new VehicleCosts().dropdownToggle.click();
        BrowserUtils.waitFor(1);
    }

    @When("selects {string} in the popup menu")
    public void selects_in_the_popup_menu(String tab) {
       BrowserUtils.singleClick(new VehicleCosts().modPopupMenuTabLocators(tab));
       BrowserUtils.waitFor(1);

    }

    @Then("the favorite page title should swap state in the popup menu \\(invisible-visible)")
    public void the_favorite_page_title_should_swap_state_in_the_popup_menu_invisible_visible() {

        BrowserUtils.waitFor(3);
        if (VehicleCosts.favoriteStateIsSelected) {
            BrowserUtils.verifyElementDisplayed(new VehicleCosts().modFavoritePagesInPopupLocator());
        } else {
            List<WebElement> listOfFavoritePagesLocators = Driver.get().findElements(By.xpath("//li[@class='active']//a[contains(.,'" + Driver.get().getTitle() + "')]"));
            Assert.assertTrue(listOfFavoritePagesLocators.isEmpty());
        }

    }


}
