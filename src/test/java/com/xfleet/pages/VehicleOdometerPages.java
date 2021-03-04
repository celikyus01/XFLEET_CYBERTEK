package com.xfleet.pages;

import com.xfleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleOdometerPages extends BasePage{

    @FindBy(xpath = "(//span[@class='title title-level-2'])[2]")
    public WebElement vehicleOdometer;

    public String getSubtitleVehicleOdometer(String text){

        WebElement title = Driver.get().findElement(By.xpath("//div/h1[.='"+text+"']"));

        return title.getText();
    }

    public void clickOdometers(String num){

        WebElement odometer = Driver.get().findElement(By.xpath("(//tbody//tr[@class='grid-row row-click-action'])["+num+"]"));
        odometer.click();

    }

    public void clicksVehicleOdometer(String text){

        WebElement VO= Driver.get().findElement(By.xpath("(//a[.='"+text+"'])[2]"));
        VO.click();

    }

    public String getVehicleOdometer(String text){

        WebElement VO = Driver.get().findElement(By.xpath("//div//h1[.='"+text+"']"));

        return VO.getText();

    }



}
