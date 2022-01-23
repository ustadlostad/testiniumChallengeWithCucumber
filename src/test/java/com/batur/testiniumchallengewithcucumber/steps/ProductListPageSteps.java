package com.batur.testiniumchallengewithcucumber.steps;

import com.batur.testiniumchallengewithcucumber.base.BaseTest;
import com.batur.testiniumchallengewithcucumber.pages.ProductListPage;
import io.cucumber.java.en.And;

public class ProductListPageSteps {

    ProductListPage productListPage = new ProductListPage(BaseTest.driver, BaseTest.wait, BaseTest.actions);

    @And("user selects random product")
    public void user_selects_random_product() {
        productListPage.selectRandomItem();

    }

}
