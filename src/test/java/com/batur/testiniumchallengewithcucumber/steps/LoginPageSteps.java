package com.batur.testiniumchallengewithcucumber.steps;

import com.batur.testiniumchallengewithcucumber.base.BaseTest;
import com.batur.testiniumchallengewithcucumber.pages.LandingPage;
import com.batur.testiniumchallengewithcucumber.pages.LoginPage;
import com.batur.testiniumchallengewithcucumber.utilities.Utilities;
import com.opencsv.exceptions.CsvException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jsoup.Connection;

import java.io.IOException;

public class LoginPageSteps {

    LoginPage loginPage = new LoginPage(BaseTest.driver, BaseTest.wait, BaseTest.actions);
    LandingPage landingPage = new LandingPage(BaseTest.driver, BaseTest.wait, BaseTest.actions);

    public LoginPageSteps() throws IOException, CsvException {
    }

    @Given("user clicks sign in button")
    public void user_clicks_sign_in_button() {
        landingPage.clickLoginButton();
    }

    @Then("user is on login page")
    public void user_is_on_login_page() {
        loginPage.checkMainPage();
    }
    @When("user enters {string} and {string}")
    public void user_enters_and(String userName, String password) {
        loginPage.setEmail(userName);
        loginPage.setPassword(password);
    }
    @And("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("user is on main page")
    public void user_is_on_main_page() throws InterruptedException {
        loginPage.checkMainPage();
        loginPage.checkLoginStatus("fsfdsdf");
    }




}
