package com.xfleet.step_definitions;

import com.xfleet.pages.VehiclesCreateCarPage;
import com.xfleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class VehiclesCreateCarStepDefs {

    @When("the user clicks Create Car button")
    public void the_user_clicks_Create_Car_button() {
        VehiclesCreateCarPage createCar = new VehiclesCreateCarPage();
        BrowserUtils.waitFor(6);
        createCar.CreateCarLocate.click();
    }

    @When("the user enters car informations")
    public void the_user_enters_car_informations(Map<String, String> carInfo) {
        VehiclesCreateCarPage createCar = new VehiclesCreateCarPage();
        BrowserUtils.waitFor(5);

        String licensePlate = carInfo.get("License Plate");
        createCar.licensePlateBox.sendKeys(licensePlate);

        BrowserUtils.waitFor(1);
        createCar.TagsCheckBox.click();

        BrowserUtils.waitFor(1);
        createCar.DriverBox.sendKeys(carInfo.get("Driver"));

        BrowserUtils.waitFor(1);
        createCar.LocationBox.sendKeys(carInfo.get("Location"));

        BrowserUtils.waitFor(1);
        createCar.ChassisNumberBox.sendKeys(carInfo.get("Chassis Number"));

        BrowserUtils.waitFor(1);
        createCar.ModelYearBox.sendKeys(carInfo.get("Model Year"));

        BrowserUtils.waitFor(1);
        createCar.LastOdometerBox.sendKeys(carInfo.get("Last Odometer"));

        BrowserUtils.waitFor(1);
        createCar.ImmatriculationDateBox.click();

        BrowserUtils.waitFor(1);
        createCar.ImmatriculationDateToday.click();

        BrowserUtils.waitFor(1);
        createCar.FirstContractDateBox.click();

        BrowserUtils.waitFor(1);
        createCar.FirstContractDateToday.click();

        BrowserUtils.waitFor(1);
        createCar.CatalogValueBox.sendKeys(carInfo.get("Seats Number"));

        BrowserUtils.waitFor(1);
        createCar.SeatsNumberBox.sendKeys(carInfo.get("Seats Number"));

        BrowserUtils.waitFor(1);
        createCar.DoorsNumberBox.sendKeys(carInfo.get("Doors Number"));

        BrowserUtils.waitFor(1);
        createCar.ColorBox.sendKeys(carInfo.get("Color"));

        BrowserUtils.waitFor(1);
        createCar.TransmissionBox.click();
        createCar.TransmissionSelect.click();

        BrowserUtils.waitFor(1);
        createCar.FuelTypeBox.click();
        createCar.FuelTypeElectric.click();

        BrowserUtils.waitFor(1);
        createCar.CO2EmissionsBox.sendKeys(carInfo.get("CO2 Emissions"));

        BrowserUtils.waitFor(1);
        createCar.HorsepowerBox.sendKeys(carInfo.get("Horsepower"));

        BrowserUtils.waitFor(1);
        createCar.HorsepowerTaxationBox.sendKeys(carInfo.get("Horsepower Taxation"));

        BrowserUtils.waitFor(1);
        createCar.PowerBox.sendKeys(carInfo.get("Power (KW)"));

        BrowserUtils.waitFor(2);
        createCar.VehicleModelBox.click();

        BrowserUtils.waitFor(2);
        createCar.RougeCheckBox.click();

        BrowserUtils.waitFor(2);
        createCar.SelectBox.click();

        BrowserUtils.waitFor(2);
        createCar.VehicleMakeBox.click();

        BrowserUtils.waitFor(2);
        createCar.TeslaBox.click();

        BrowserUtils.waitFor(2);
        createCar.SelectBox.click();

    }

    @Then("the user clicks Save And Close button")
    public void the_user_clicks_Save_And_Close_button() {
        VehiclesCreateCarPage createCar = new VehiclesCreateCarPage();
        BrowserUtils.waitFor(3);
        createCar.dropDownSave.click();

        BrowserUtils.waitFor(3);
        createCar.SaveAndClose.click();

    }

    @Then("the user clicks Save And New button")
    public void the_user_clicks_Save_And_New_button() {
        VehiclesCreateCarPage createCar = new VehiclesCreateCarPage();
        BrowserUtils.waitFor(3);
        createCar.dropDownSave.click();

        BrowserUtils.waitFor(3);
        createCar.SaveAndNew.click();

    }

    @Then("the user clicks Save button")
    public void the_user_clicks_Save_button() {
        VehiclesCreateCarPage createCar = new VehiclesCreateCarPage();
        BrowserUtils.waitFor(5);
        createCar.dropDownSave.click();

        BrowserUtils.waitFor(3);
        createCar.Save.click();
    }

    @Then("the user should be able to verify Entity saved")
    public void the_user_should_be_able_to_verify_Entity_saved() {
        VehiclesCreateCarPage createCarPage = new VehiclesCreateCarPage();
        String expected = "Entity saved";

        BrowserUtils.waitFor(4);
        Assert.assertEquals(expected, createCarPage.EntitySavedMessage.getText());

        System.out.println("All of car information are matching");

    }

}
