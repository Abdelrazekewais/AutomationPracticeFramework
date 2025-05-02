package tests;

import org.testng.annotations.Test;
import pageObjects.BasketPage;
import pageObjects.homePage;

import java.io.IOException;

import static utilities.Log.info;

public class AssertionsTests extends BaseTest {

    @Test(description = "Asserting Thinking in HTML book exist along with its price")
    public void ValidateThinkingInHTMLIsDisplayed() {
        info("Asserting Thinking in HTML book exist along with its price");
        new homePage(driver)
                .validateThinkingInHTMLBookDisplayed()
                .validateThinkingInHTMLBookPriceDisplayed()
                .validateThinkingInHTMLBookImageDisplayed();
        info("Asserting Thinking in HTML book exist along with its price: Completed");

    }


    @Test(description = "Asserting Thinking in HTML book is added to cart")
    public void ValidateThinkingInHTMLBookAddedToCart() throws InterruptedException, IOException {
       info("Asserting Thinking in HTML book is added to cart");
        new homePage(driver)
                .clickThinkingInHTMLAddToCartBTN()
                .clickViewBasketBTN();

        new BasketPage(driver)
                .AssertBasketTitleDisplayed()
                .AssertProductTitleDisplayed()
                .AssertProductPriceDisplayed()
                .AssertProductTotalDisplayed()
                .AssertProductImageDisplayed()
                .AssertProductQuantityDisplayed();

        info("Asserting Thinking in HTML book is added to cart: Completed");
    }

    @Test(description = "Asserting Billing details are displayed")
    public void ValidateBillingDetailsDisplayed() throws IOException, InterruptedException {
        info("Asserting Billing details are displayed");
        new homePage(driver)
                .clickThinkingInHTMLAddToCartBTN()
                .clickViewBasketBTN();
        new BasketPage(driver)
                .AssertBillingSubTotalDisplayed()
                .AssertBillingTaxDisplayed()
                .AssertBillingTotalDisplayed();
       info("Asserting Billing details are displayed: Completed");
    }

}
