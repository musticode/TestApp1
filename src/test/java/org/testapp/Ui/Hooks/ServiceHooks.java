package org.testapp.Ui.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testapp.Ui.DriverManager.DriverManager;
import org.testapp.Ui.Test.BaseTest;

public class ServiceHooks  {
    DriverManager driverManager;

    @Before
    public void initializeBrowser(){
        driverManager = new DriverManager();
        driverManager.getDriver("chrome");
    }

    @After
    public void closeBrowser(){
        driverManager.tearDown();
    }

}
