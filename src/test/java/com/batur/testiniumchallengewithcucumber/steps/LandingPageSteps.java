package com.batur.testiniumchallengewithcucumber.steps;

import com.batur.testiniumchallengewithcucumber.base.BaseTest;
import com.batur.testiniumchallengewithcucumber.pages.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class LandingPageSteps {

    LandingPage landingPage = new LandingPage(BaseTest.driver, BaseTest.wait, BaseTest.actions);

    @Given("user navigates to trendyol web site")
    public void user_navigates_to_trendyol_web_site() {
        landingPage.navigate("https://www.trendyol.com/");
    }

    @And("user closes popup")
    public void user_closes_popup() {
        landingPage.closePopupWindow();
    }

}
