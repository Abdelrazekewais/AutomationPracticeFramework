package pageObjects;

import commons.waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static commons.commonActionsMethods.getElement;

public class PlaceOrderPage {
    WebDriver driver;
    waits waiter;
    public PlaceOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public waits getWaiter() {
        if (waiter == null) {
            waiter = new waits(driver);
        }
        return waiter;
    }

    private By billingDetailsHeading = By.xpath("//h3[normalize-space()='Billing Details']");

    public PlaceOrderPage validatePlaceOrderPageDisplayed(){
        getWaiter().waitForElementLocatedToBeVisible(billingDetailsHeading);
        Assert.assertTrue(getElement(driver, billingDetailsHeading).isDisplayed());
        return this;
    }
}
