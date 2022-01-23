package com.batur.testiniumchallengewithcucumber.steps;

import com.batur.testiniumchallengewithcucumber.base.BaseTest;
import com.batur.testiniumchallengewithcucumber.pages.LandingPage;
import com.batur.testiniumchallengewithcucumber.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageSteps {

    LoginPage loginPage = new LoginPage(BaseTest.driver, BaseTest.wait, BaseTest.actions);
    LandingPage landingPage = new LandingPage(BaseTest.driver, BaseTest.wait, BaseTest.actions);

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

    @When("user is on main page")
    public void user_is_on_main_page(){
        loginPage.checkMainPage();
    }

    @Then("login success")
    public void login_success() throws InterruptedException {
        loginPage.checkLoginStatus("Baturtestmaili@Gmail.Com");
    }

    @Then("login fail error need to be displayed as {string}")
    public void login_fail_error_need_to_be_displayed_as(String string) {
        Assert.assertEquals(string, loginPage.getLoginErrorMessage());
    }


}
