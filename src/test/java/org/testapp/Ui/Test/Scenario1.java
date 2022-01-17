package org.testapp.Ui.Test;

import org.testapp.Ui.Listener.TestListener;
import org.testapp.Ui.Pages.DemoPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListener.class)
public class Scenario1 extends BaseTest{
    DemoPage demoPage;
    @Test
    public void scenario1(){
        demoPage = new DemoPage(driver);
        demoPage.openPage();
        demoPage.isPageOpened();
        demoPage.setName("Mustafa");
    }


}
