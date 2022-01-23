package com.batur.testiniumchallengewithcucumber.steps;

import com.batur.testiniumchallengewithcucumber.base.BaseTest;
import com.batur.testiniumchallengewithcucumber.pages.BasketPage;
import com.batur.testiniumchallengewithcucumber.pages.ProductDetailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class BasketPageSteps {

    BasketPage basketPage = new BasketPage(BaseTest.driver, BaseTest.wait, BaseTest.actions);
    ProductDetailPageSteps productDetailPageSteps = new ProductDetailPageSteps();

    String itemBasketName;
    String itemBasketPrice;
    String itemCount;
    String basketIsEmptyWarning;

    @Then("product price and basket price are compared")
    public void product_price_and_basket_price_are_compared() {

        itemBasketName = basketPage.getItemBasketName();
        itemBasketPrice = basketPage.getItemBasketPrice();

        Assert.assertTrue(productDetailPageSteps.getProductPageItemName().contains(itemBasketName));
        Assert.assertTrue(itemBasketPrice.contains(productDetailPageSteps.getProductPageItemPrice()));
    }

    @And("user increases the product number")
    public void user_increases_the_product_number() throws InterruptedException {
        itemCount = basketPage.increaseItemCountAndGetItemCount();
    }

    @Then("it is checked that product number is {string}")
    public void it_is_checked_that_product_number_is(String string) {
        Assert.assertEquals(itemCount,"Actual and Expected Item Count is not equal!", string);
    }

    @And("user deletes product from basket")
    public void user_deletes_product_from_basket() {
        basketIsEmptyWarning = basketPage.deleteItemFromBasket();
    }

    @Then("basket is empty")
    public void basket_is_empty() {
        Assert.assertEquals(basketIsEmptyWarning,"Sepetinde ürün bulunmamaktadır.");
    }

}
