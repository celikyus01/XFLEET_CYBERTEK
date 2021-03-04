package com.xfleet.pages;

import com.xfleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleCosts extends BasePage {

    public static boolean pinStateIsSelected;
    public static boolean favoriteStateIsSelected;
    public static boolean favoritePageIsVisible;

    @FindBy(xpath = "//a[@class='oro-dropdown-toggle']")
    public WebElement dropdownToggle;
    @FindBy(xpath = "#favorite-tab")
    public WebElement favoriteTab;


    /**
     * @param mod: recent-emails (email)
     *             sticky-note (sticky)
     *             assigned-tasks (tasks)
     * @return modded widget locator
     */
    public String modWidgetLocator(String mod) {
        String modWidgetName = mod.toLowerCase().replace(" ", "-");

        return "div.sidebar-widget.sidebar-widget-" + modWidgetName;
    }

    public WebElement modPinOrFavoriteButtonLocator(String choice) {
        return Driver.get().findElement(By.xpath("//button[@title[contains(.,'" + choice.toLowerCase() + "')]]"));
    }

    public WebElement modPinHolderLocator() {
        return Driver.get().findElement(By.xpath("(//li[@class='pin-holder active']//a[@title='" + Driver.get().getTitle() + "'])[1]"));
    }

    public WebElement modPopupMenuTabLocators(String tab) {
        String newLocator = null;
        switch (tab) {
            case "Favorites":
                newLocator = "favorite-content";
                break;
            case "History":
                newLocator = "history-content";
                break;
            case "Most Viewed":
                newLocator = "mostviewed-content";
                break;
        }

        return Driver.get().findElement(By.id(newLocator));
    }

    public WebElement modFavoritePagesInPopupLocator(){
        return Driver.get().findElement(By.xpath("//a[.='"+Driver.get().getTitle()+"']"));
    }

}
