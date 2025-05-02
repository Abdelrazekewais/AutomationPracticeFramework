package pageObjects;

import commons.JavascriptMethods;
import commons.waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static commons.commonActionsMethods.*;
import static commons.commonAssertionsMethods.elementIsDisplayed;


public class homePage {
    WebDriver driver;
    waits waiter;
    JavascriptMethods js;
    public homePage(WebDriver driver) {
        this.driver = driver;
    }

    public waits getWaiter(){
        if(waiter == null){
            waiter = new waits(driver);
        }
        return waiter;
    }
    // Locate elements in Home Page:
    private By ThinkInHTMLBookIMG = By.xpath("//img[@alt='Thinking in HTML']");
    private By ThinkInHTMLBookActualPrice = By.xpath("//a[contains(@href, 'thinking')]//child:: ins/span[contains(@class, 'Price-amount')]");
    private By ThinkingInHTMLAddToCartBTN = By.xpath("//li[contains(@class, 'post-163 product type-product')]//a[@href='/?add-to-cart=163']");
    private By ViewBasketBTN = By.xpath("//a[@title='View Basket']");
    private By Basket = By.xpath("//ul[@id='main-nav']//li//a[contains(@href, 'automationtesting.in/basket/')]");
    private By ThinkingInHTMLBook = By.xpath("//li[contains(@class, 'post-163 product')]");
    private By ShoppingCart = By.xpath("//a[contains(@title, 'Start shopping')]");

    public homePage validateThinkingInHTMLBookDisplayed(){
        getWaiter().waitForElementToBeVisible(driver,ThinkingInHTMLBook);
        Assert.assertTrue(elementIsDisplayed(driver,ThinkingInHTMLBook));
        return this;
    }

    public homePage validateThinkingInHTMLBookImageDisplayed(){
        Assert.assertTrue(elementIsDisplayed(driver,ThinkInHTMLBookIMG));
        return this;
    }

    public homePage validateThinkingInHTMLBookPriceDisplayed(){
        Assert.assertTrue(elementIsDisplayed(driver,ThinkInHTMLBookActualPrice));
        return this;
    }

    public homePage clickThinkingInHTMLAddToCartBTN(){
        js = new JavascriptMethods(driver);
        js.scrollToElement(driver,ThinkInHTMLBookIMG);
        getWaiter().waitForElementToBeVisible(driver,ThinkingInHTMLAddToCartBTN);
        clickElement(driver,ThinkingInHTMLAddToCartBTN);
        return this;
    }

    public homePage clickShoppingCartBTN() throws InterruptedException {
        js = new JavascriptMethods(driver);
        js.scrollToTop(driver);
        getWaiter().waitForElementLocatedToBeVisible(ShoppingCart);
        clickElement(driver,ShoppingCart);
        return this;
    }

    public homePage clickViewBasketBTN() throws InterruptedException {
        js = new JavascriptMethods(driver);
        js.scrollToSpecificPoint(driver);
        getWaiter().waitForElementLocatedToBeVisible(ViewBasketBTN);

        clickElement(driver,ViewBasketBTN);
        return this;
    }

    public homePage assertViewBasketBTNDisplayed() {
        getWaiter().waitForElementLocatedToBeVisible(ViewBasketBTN);
        Assert.assertTrue(elementIsDisplayed(driver,ViewBasketBTN));
        return this;
    }










}
