package org.testapp.Ui.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }
    public void waitForLocator(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public WebElement findBy(By locator){
        return driver.findElement(locator);
    }
    public void click(By locator){
        waitForLocator(locator);
        findBy(locator).click();
    }
    public void setText(By locator, String text){
        waitForLocator(locator);
        findBy(locator).sendKeys(text);
    }
    public String getText(By locator){
        waitForLocator(locator);
        return findBy(locator).getText();
    }
}
