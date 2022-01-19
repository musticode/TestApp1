package org.testapp.Ui.Pages.Faveo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testapp.Ui.Pages.BasePage;

public class DashboardPage extends BasePage {
    private final String FAVEO_DASHBOARD = "https://sprint9stag1msp.osticket.dmdemo.comodo.com/dashboard";

    private By navbarTicketsLocator = By.id("ticket_tab");
    private By navBarCreateTicketLocator = By.cssSelector("#tab_ticket > nav > ul > li:nth-child(5) > a");


    private NewTicketPage newTicketPage;


    public DashboardPage(WebDriver driver) {
        super(driver);
    }
    public void getFaveoDashboard(){
        driver.get(FAVEO_DASHBOARD);
    }

    public NewTicketPage createTicket(){
        click(navbarTicketsLocator);
        click(navBarCreateTicketLocator);
        return new NewTicketPage(driver);
    }


}
