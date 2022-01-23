package com.batur.testiniumchallengewithcucumber.pages;

import com.batur.testiniumchallengewithcucumber.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    //Page Elements
    String search_bar_xpath = "//input[@class = 'search-box']";

    By search_bar = By.xpath(search_bar_xpath);

    //Page Methods
    public void searchAnItem(String item) {
        setText(item, search_bar);
        pressEnter(search_bar);
        refreshPage();
    }
}
