package com.batur.testiniumchallengewithcucumber.steps;

import com.batur.testiniumchallengewithcucumber.base.BaseTest;
import com.batur.testiniumchallengewithcucumber.pages.MainPage;
import io.cucumber.java.en.Given;

public class MainPageSteps {

    MainPage mainPage = new MainPage(BaseTest.driver, BaseTest.wait, BaseTest.actions);

    @Given("user searches for {string}")
    public void user_searches_for(String string) {
        mainPage.searchAnItem(string);

    }

}
