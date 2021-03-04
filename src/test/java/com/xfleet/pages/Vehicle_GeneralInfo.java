package com.xfleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Vehicle_GeneralInfo extends BasePage{

    @FindBy(xpath = "//h5")
    public WebElement generalInformationSubtitle;
}
