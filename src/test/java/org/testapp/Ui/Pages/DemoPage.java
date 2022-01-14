package org.testapp.Ui.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoPage extends BasePage{
    private String DEMO_PAGE_URL = "https://demoqa.com/automation-practice-form";
    private By nameLocator = By.xpath("//*[@id=\"firstName\"]");


    public DemoPage(WebDriver driver) {
        super(driver);
    }
    public void openPage(){
        driver.get(DEMO_PAGE_URL);
    }
    public void setName(String name){
        setText(nameLocator, name);
    }



}
