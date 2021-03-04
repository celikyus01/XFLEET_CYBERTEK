package com.xfleet.pages;

import com.xfleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class VehiclePages extends BasePage{

    @FindBy(css = ".fa-cog.hide-text")
    public WebElement GridButton;


    @FindBy (css = ".column-manager-title")
    public WebElement getGridButtonTitle;

    @FindBy(xpath = "//input[@placeholder='Quick Search']")
    public WebElement quickSeach;




    public void sendQuickSeach(String text){

        quickSeach.sendKeys(text);
    }

    public void selectGridSettings(String text){

        WebElement selectSettings = Driver.get().findElement(By.xpath("//label[.='"+text+"']"));
        selectSettings.click();

    }

    public String  isSelected(String text){

        WebElement isSelectSettings = Driver.get().findElement(By.xpath("//span[.='"+text+"']"));

        return isSelectSettings.getText();

    }
}
