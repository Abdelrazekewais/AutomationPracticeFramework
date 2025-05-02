package commons;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static commons.commonActionsMethods.getElement;

public class JavascriptMethods {
    WebDriver driver;
    static JavascriptExecutor js;
    public JavascriptMethods(WebDriver driver) {
        this.driver = driver;
        js = (JavascriptExecutor) driver;
    }


    // Method to scroll to the element
    public static void scrollToElement(WebDriver driver, By element) {
        js.executeScript("arguments[0].scrollIntoView(true);", getElement(driver, element));
    }

    // Method to scroll to the top of the page
    public static void scrollToTop(WebDriver driver) {
        js.executeScript("window.scrollTo(0, 0);");
    }
    // Method to scroll to the bottom of the page
    public static void scrollToBottom(WebDriver driver) {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public static void scrollToSpecificPoint(WebDriver driver) {
        js.executeScript("window.scrollTo(0, 500);");
    }
}
