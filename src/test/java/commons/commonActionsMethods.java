package commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class commonActionsMethods {
    WebDriver driver;
    public commonActionsMethods(WebDriver driver) {
        this.driver=driver;
    }


    // create method to get and return the element
    public static WebElement getElement(WebDriver driver, By element) {
        return driver.findElement(element);
    }

    // create method to get and return the list of elements
    public static List<WebElement> getElements(WebDriver driver,By element) {
        return driver.findElements(element);
    }

    // Method to take By variable element and click it
    public static void clickElement(WebDriver driver,By element) {
        getElement(driver, element).click();
    }

    // Method to take By variable element and fill it with data
    public static void SendKeys(WebDriver driver,By element, String input) {
        getElement(driver, element).sendKeys(input);
    }



}
