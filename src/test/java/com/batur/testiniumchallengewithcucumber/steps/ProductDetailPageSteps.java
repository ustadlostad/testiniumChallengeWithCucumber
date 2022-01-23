package com.batur.testiniumchallengewithcucumber.steps;

import com.batur.testiniumchallengewithcucumber.base.BaseTest;
import com.batur.testiniumchallengewithcucumber.pages.ProductDetailPage;
import com.batur.testiniumchallengewithcucumber.utilities.Utilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class ProductDetailPageSteps {

    static public String productPageItemName;
    static public String productPageItemPrice;

    ProductDetailPage productDetailPage = new ProductDetailPage(BaseTest.driver, BaseTest.wait, BaseTest.actions);
    Utilities utilities = new Utilities();

    @Then("selected product info is written in to a file")
    public void selected_product_info_is_written_in_to_a_file() throws IOException {
        productDetailPage.switchBrowserTab();
        productPageItemName = productDetailPage.getItemName();
        productPageItemPrice = productDetailPage.getItemPrice();
        utilities.writeTxtFile(productDetailPage.getItemName());
        utilities.writeTxtFile(productDetailPage.getItemPrice());
        setProductPageItemName(productPageItemName = productDetailPage.getItemName());
        setProductPageItemPrice(productPageItemPrice = productDetailPage.getItemPrice());
    }

    public void setProductPageItemPrice(String productPageItemPrice) {
        this.productPageItemPrice = productPageItemPrice;
    }

    public void setProductPageItemName(String productPageItemName) {
        this.productPageItemName = productPageItemName;
    }

    public String getProductPageItemName() {
        return productPageItemName;
    }

    public String getProductPageItemPrice() {
        return productPageItemPrice;
    }

    @And("user add product to basket")
    public void user_add_product_to_basket() {
        productDetailPage.addItemToTheBasket();
        productDetailPage.goToBasket();
    }

}
