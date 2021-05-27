package PageLocations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PassengerPageLocators {

    @FindBy(how = How.ID, using = "fName")
    public WebElement AdultFirstName;

    @FindBy(how = How.ID, using = "lName")
    public WebElement AdultLastName;

    @FindBy(how = How.ID, using = "email")
    public WebElement AdultEmailAddress;

    @FindBy(how = How.ID, using = "phoneNumber")
    public WebElement AdultPhoneNumber;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/surf-ct-widget-wizard[1]/div[1]/surf-ct-passenger-page[1]/div[1]/div[2]/div[1]/div[1]/surf-ct-generic-passengers-component[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/surf-form-input-beryl[1]/div[1]/input[1]")
    public WebElement InfantFirstName;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/surf-ct-widget-wizard[1]/div[1]/surf-ct-passenger-page[1]/div[1]/div[2]/div[1]/div[1]/surf-ct-generic-passengers-component[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/surf-form-input-beryl[1]/div[1]/input[1]")
    public WebElement InfantLastName;

    @FindBy(how = How.XPATH, using = "//input[@id='selectdropdown']")
    public WebElement HotelPickUpDropDown;

    @FindBy(how = How.XPATH, using = "//li[@id='notListedselect']")
    public WebElement DropDownItemSelect;

    @FindBy(how = How.ID, using = "note")
    public WebElement AdditionalInfo;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/surf-ct-widget-wizard[1]/div[1]/surf-ct-passenger-page[1]/div[1]/div[2]/div[2]/surf-ct-cart-summary-component[1]/div[1]/div[1]/div[1]/div[6]/button[1]")
    public WebElement ContinuePaymentButton;




}
