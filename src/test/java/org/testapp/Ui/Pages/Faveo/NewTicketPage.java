package org.testapp.Ui.Pages.Faveo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testapp.Ui.Pages.BasePage;

public class NewTicketPage extends BasePage {
    private By emailLocator = By.id("email");
    private By firstName = By.id("first_name");
    private By lastNameLocator = By.id("last_name");
    private By countryCodeLocator = By.id("country_code");

    public NewTicketPage(WebDriver driver) {
        super(driver);
    }
    public void fillTicketCreateForm(String email/*, String firstName, String lastName,
                                     String countryCode, String mobileNumber, String phone*/
                                     ){
        setText(emailLocator, email);

    }
}
