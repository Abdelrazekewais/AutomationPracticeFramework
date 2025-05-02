package commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static commons.commonActionsMethods.getElement;

public class waits {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public waits(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //wait for element to be clickable
    public void waitForElementToBeClickable(WebDriver driver,By Element){
        wait.until(ExpectedConditions.elementToBeClickable(getElement(driver,Element)));
    }
    //wait for element to be visible
    public void waitForElementToBeVisible(WebDriver driver,By Element){
        wait.until(ExpectedConditions.visibilityOf(getElement(driver,Element)));
    }

    public void waitForElementLocatedToBeVisible(By Element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Element));
    }

}
