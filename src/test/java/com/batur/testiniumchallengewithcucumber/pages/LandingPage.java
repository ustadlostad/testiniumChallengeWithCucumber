package com.batur.testiniumchallengewithcucumber.pages;

import com.batur.testiniumchallengewithcucumber.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    //Page Elements
    String login_button_css_selector = ".account-user > .link-text";
    String popup_close_button_css_selector = ".modal-close";

    By login_button = By.cssSelector(login_button_css_selector);
    By popup_close_button = By.cssSelector(popup_close_button_css_selector);


    //Page Methods
    public void closePopupWindow() {
        click(popup_close_button);
    }

    public void clickLoginButton() {
        click(login_button);
    }

}
