package org.testapp.Ui.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testapp.Ui.DriverManager.DriverManager;
import org.testapp.Ui.Hooks.ServiceHooks;
import org.testapp.Ui.Pages.DemoPage;
import org.testapp.Ui.Test.BaseTest;

public class DemoPageSteps {
    public WebDriver driver;
    DemoPage demoPage;

    @Before
    public void before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @After
    public void after(){
        driver.quit();
    }
    @Given("go to demo page")
    public void goToDemoPage(){
        demoPage = new DemoPage(driver);
        demoPage.openPage();
    }
    @Then("set name")
    public void setName(){
        demoPage.setName("Mustafa");
//        driver.quit();
    }
}
