package com.batur.testiniumchallengewithcucumber.pages;

import com.batur.testiniumchallengewithcucumber.base.BasePage;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductListPage extends BasePage {


    public ProductListPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    //Page Objects
    String items_xpath = "//div[@class = 'p-card-wrppr']";

    By items = By.xpath(items_xpath);

    //Page Methods
    public void selectRandomItem() {
        selectRandomObjectAndClick(items);
    }

}
