package commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import static commons.commonActionsMethods.getElement;

public class commonAssertionsMethods {
    static SoftAssert softAssertion;
    WebDriver driver;

    public commonAssertionsMethods(WebDriver driver) {
        this.driver = driver;
        softAssertion = new SoftAssert();
    }

    public static boolean elementIsDisplayed(WebDriver driver, By element) {
        return getElement(driver, element).isDisplayed();
    }

    public static void SoftAssertionElementIsDisplayed(WebDriver driver, By element) {
        //getElement(driver, element).isDisplayed();
        softAssertion.assertTrue(getElement(driver, element).isDisplayed());
    }

}
