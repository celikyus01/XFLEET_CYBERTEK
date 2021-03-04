package com.xfleet.pages;

import com.xfleet.utilities.BrowserUtils;
import com.xfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesInfoPage extends BasePage {
    public VehiclesInfoPage(){PageFactory.initElements(Driver.get(),this); }

    @FindBy(xpath = "(//td[2])[1]")
    public WebElement FirstBox;

    @FindBy(xpath= "//h5")
    public WebElement GeneralInfo;

    @FindBy(xpath = "(//*[@class='caret'])[1]")
    public WebElement ActivityType;

    @FindBy(xpath = "(//*[@value='Oro_Bundle_CallBundle_Entity_Call'])[2]")
    public WebElement CallCheck;

    @FindBy(xpath = "(//*[.='Call'])[1]")
    public WebElement CallText;

    @FindBy(xpath = "//*[@class='btn filter-select filter-criteria-selector']")
    public WebElement ActivityCall;

    @FindBy(css = "i.fa-refresh.hide-text")
    public WebElement Empty;

    @FindBy(className = "fa-repeat")
    public WebElement RefreshBtn;


//ab
}
