package org.testapp.Ui.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }
    public WebElement findBy(By locator){
        return driver.findElement(locator);
    }
    public void click(By locator){
        findBy(locator).click();
    }
    public void setText(By locator, String text){
        findBy(locator).sendKeys(text);
    }
    public String getText(By locator){
        return findBy(locator).getText();
    }
}
