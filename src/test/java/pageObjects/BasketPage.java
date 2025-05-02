package pageObjects;

import commons.waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

import static commons.commonActionsMethods.clickElement;
import static commons.commonActionsMethods.getElement;
import static commons.commonAssertionsMethods.elementIsDisplayed;
import static dataDrivenHandling.jsonDataReader.getProductDetails;

public class BasketPage {

    waits waiter;
    WebDriver driver;
    private By BasketTotalsTitle = By.xpath("//h2[normalize-space()='Basket Totals']");
    private By ProductTitle = By.xpath("//td[@class='product-name']//a");
    private By ProductImage = By.xpath("//img[@class='attachment-shop_thumbnail size-shop_thumbnail wp-post-image']");
    private By ProductPrice = By.xpath("//td[@class='product-price']//span");
    private By ProductQuantity = By.xpath("//input[@title='Qty']");
    private By ProductTotal = By.xpath("//td[@class='product-subtotal']//span[@class='woocommerce-Price-amount amount']");

    // Billing Details elements
    private By BillingSubtotalDetails = By.xpath("//td[@data-title='Subtotal']//span");
    private By BillingTaxDetails = By.xpath("//td[@data-title='Tax']//span");
    private By BillingTotalDetails = By.xpath("//tr[@class='order-total']//td[@data-title='Total']//span");
    private By CheckOutBTN = By.xpath("//a[normalize-space()='Proceed to Checkout']");

    public BasketPage(WebDriver driver) {
        this.driver = driver;
    }

    public waits getWaiter() {
        if (waiter == null) {
            waiter = new waits(driver);
        }
        return waiter;
    }

    public BasketPage AssertBasketTitleDisplayed() {
        getWaiter().waitForElementLocatedToBeVisible(BasketTotalsTitle);
        elementIsDisplayed(driver, BasketTotalsTitle);
        return this;
    }

    public BasketPage AssertProductTitleDisplayed() throws IOException {
        elementIsDisplayed(driver, ProductTitle);
        Assert.assertEquals(getElement(driver, ProductTitle).getText(), getProductDetails().getTitle());
        return this;
    }

    public BasketPage AssertProductImageDisplayed() throws IOException {
        elementIsDisplayed(driver, ProductImage);
        Assert.assertEquals(getElement(driver, ProductImage).getDomAttribute("src"), getProductDetails().getImgSource());
        return this;
    }

    public BasketPage AssertProductQuantityDisplayed() throws IOException {
        elementIsDisplayed(driver, ProductQuantity);
        Assert.assertEquals(getElement(driver, ProductQuantity).getDomAttribute("value"), getProductDetails().getQuantity());
        return this;
    }

    public BasketPage AssertProductPriceDisplayed() throws IOException {
        elementIsDisplayed(driver, ProductPrice);
        Assert.assertEquals(getElement(driver, ProductPrice).getText(), getProductDetails().getPrice());
        return this;
    }

    public BasketPage AssertProductTotalDisplayed() throws IOException {
        elementIsDisplayed(driver, ProductTotal);
        Assert.assertEquals(getElement(driver, ProductTotal).getText(), getProductDetails().getTotal());
        return this;
    }

    public BasketPage AssertBillingSubTotalDisplayed() throws IOException {
        elementIsDisplayed(driver, BillingSubtotalDetails);
        Assert.assertEquals(getElement(driver, BillingSubtotalDetails).getText(), getProductDetails().getBillingSubtotal());
        return this;
    }

    public BasketPage AssertBillingTaxDisplayed() throws IOException {
        elementIsDisplayed(driver, BillingTaxDetails);
        Assert.assertEquals(getElement(driver, BillingTaxDetails).getText(), getProductDetails().getBillingTax());
        return this;
    }

    public BasketPage AssertBillingTotalDisplayed() throws IOException {
        elementIsDisplayed(driver, BillingTotalDetails);
        Assert.assertEquals(getElement(driver, BillingTotalDetails).getText(), getProductDetails().getBillingTotal());
        return this;
    }

    public BasketPage ValidateIfShoppingCartIsEmpty() {
        Assert.assertEquals(driver.getTitle(), "Products – Automation Practice Site");
        return this;
    }

    public BasketPage clickProceedToCheckoutBTN() throws InterruptedException {
        getWaiter().waitForElementToBeVisible(driver, CheckOutBTN);
        clickElement(driver, CheckOutBTN);
        return this;
    }

}
