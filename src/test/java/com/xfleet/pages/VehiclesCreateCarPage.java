package com.xfleet.pages;

import com.xfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesCreateCarPage extends BasePage{
    public VehiclesCreateCarPage(){PageFactory.initElements(Driver.get(),this);}

    @FindBy(xpath = "//*[@title='Create Car']")
    public WebElement CreateCarLocate;

    @FindBy(name = "custom_entity_type[LicensePlate]")
    public WebElement licensePlateBox;

    @FindBy(xpath = "(//*[@type='checkbox'])[4]")
    public WebElement TagsCheckBox;

    @FindBy(name = "custom_entity_type[Driver]")
    public WebElement DriverBox;

    @FindBy(name = "custom_entity_type[Location]")
    public WebElement LocationBox;

    @FindBy(name = "custom_entity_type[ChassisNumber]")
    public WebElement ChassisNumberBox;

    @FindBy(name = "custom_entity_type[ModelYear]")
    public WebElement ModelYearBox;

    @FindBy(name = "custom_entity_type[LastOdometer]")
    public WebElement LastOdometerBox;

    @FindBy(css = "input[id^='date_selector_custom_entity_type_ImmatriculationDate-uid-']")
    public WebElement ImmatriculationDateBox;

    @FindBy(css = "button.ui-datepicker-current.ui-state-default.ui-priority-secondary.ui-corner-all")
    public WebElement ImmatriculationDateToday;

    @FindBy(css = "input[id^='date_selector_custom_entity_type_FirstContractDate-uid-']")
    public WebElement FirstContractDateBox;

    @FindBy(css = "button.ui-datepicker-current.ui-state-default.ui-priority-secondary.ui-corner-all")
    public WebElement FirstContractDateToday;

    @FindBy(name = "custom_entity_type[CatalogValue]")
    public WebElement CatalogValueBox;

    @FindBy(name = "custom_entity_type[SeatsNumber]")
    public WebElement SeatsNumberBox;

    @FindBy(name = "custom_entity_type[DoorsNumber]")
    public WebElement DoorsNumberBox;

    @FindBy(name = "custom_entity_type[Color]")
    public WebElement ColorBox;

    @FindBy(xpath = "//*[@class='select2-choice select2-default']")
    public WebElement TransmissionBox;

    @FindBy(css = "div.select2-drop.select2-display-none.select2-drop-auto-width.select2-drop-active.oro-select2__dropdown")
    public WebElement TransmissionSelect;

    @FindBy(xpath = "(//*[@class='select2-chosen'])[2]")
    public WebElement FuelTypeBox;

    @FindBy(xpath = "(//*[@class='select2-result-label'])[3]")
    public WebElement FuelTypeElectric;

    @FindBy(name = "custom_entity_type[CO2Emissions]")
    public WebElement CO2EmissionsBox;

    @FindBy(name = "custom_entity_type[Horsepower]")
    public WebElement HorsepowerBox;

    @FindBy(name = "custom_entity_type[HorsepowerTaxation]")
    public WebElement HorsepowerTaxationBox;

    @FindBy(name = "custom_entity_type[Power]")
    public WebElement PowerBox;

    @FindBy(css = "span.filename")
    public WebElement LogoBox;

    @FindBy(xpath = "(//*[@class='fa-plus'])[1]")
    public WebElement VehicleModelBox;

    @FindBy(xpath = "//td[.='Rouge']")
    public WebElement RougeCheckBox;

    @FindBy(css = ".btn.btn-primary")
    public WebElement SelectBox;

    @FindBy(xpath = "(//*[@class='fa-plus'])[2]")
    public WebElement VehicleMakeBox;

    @FindBy(xpath = "//td[.='Tesla']")
    public WebElement TeslaBox;


    @FindBy(xpath = "//*[@class='btn-success btn dropdown-toggle']")
    public WebElement dropDownSave;

    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement SaveAndClose;

    @FindBy(xpath = "(//*[@class='btn btn-success action-button'])[1]")
    public WebElement SaveAndClose2;


    @FindBy(xpath = "(//*[@type='submit'])[3]")
    public WebElement SaveAndNew;

    @FindBy(xpath = "(//*[@type='submit'])[4]")
    public WebElement Save;

    @FindBy(css = "div.message")
    public WebElement EntitySavedMessage;

}
