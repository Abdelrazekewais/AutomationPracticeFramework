package tests;

import org.testng.annotations.Test;
import pageObjects.BasketPage;
import pageObjects.PlaceOrderPage;
import pageObjects.homePage;

import java.io.IOException;

public class FunctionalityTests extends BaseTest {

    // Test to validate the functionality of the application
    @Test(description = "Clicking on Add to Basket for Thinking in HTML book")
    public void ValidateAddToBasketFunctionality() throws IOException, InterruptedException {
        logger.info("Validating Add To Basket button functionality");

        new homePage(driver)
                .clickThinkingInHTMLAddToCartBTN()
                .assertViewBasketBTNDisplayed();
        logger.info("Add To Basket button Functionality validation completed");
    }

    @Test(description = "Clicking on Shopping Cart")
    public void ValidateShoppingCartButtonFunctionality() throws IOException, InterruptedException {
        logger.info("Validating the functionality of Shopping Cart button");
        new homePage(driver)
                .clickShoppingCartBTN();
        new BasketPage(driver)
                .ValidateIfShoppingCartIsEmpty();

        logger.info("Functionality validation completed");
    }

    @Test(description = "Clicking on Proceed to Checkout")
    public void ValidateProceedToCheckoutFunctionality() throws IOException, InterruptedException {
        logger.info("Validating the functionality of Proceed to Checkout button");
        new homePage(driver)
                .clickThinkingInHTMLAddToCartBTN()
                .clickViewBasketBTN();
        new BasketPage(driver)
                .clickProceedToCheckoutBTN();
        new PlaceOrderPage(driver)
                .validatePlaceOrderPageDisplayed();
        logger.info("Checkout button Functionality validation completed");
    }
}
