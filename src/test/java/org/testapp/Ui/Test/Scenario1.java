package org.testapp.Ui.Test;

import org.testapp.Ui.Pages.DemoPage;
import org.testng.annotations.Test;

public class Scenario1 extends BaseTest{
    DemoPage demoPage;
    @Test
    public void scenario1(){
        demoPage = new DemoPage(driver);
        demoPage.openPage();
        demoPage.setName("Mustafa");
    }


}
