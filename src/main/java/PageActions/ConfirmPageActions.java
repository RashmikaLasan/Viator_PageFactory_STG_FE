package PageActions;

import PageLocations.ConfirmPageLocators;
import Utilities.SeleniumDriver;
import org.openqa.selenium.support.PageFactory;

public class ConfirmPageActions {

    ConfirmPageLocators confirmPageLocators;
    public String ConfirmProductName;
    public String BookingId;
    public String ConfirmDate;
    public String ConfirmLocation;
    public String ConfirmGuest;


    public ConfirmPageActions() {
        this.confirmPageLocators = new ConfirmPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), confirmPageLocators);

    }

    public void ProductName() {
        ConfirmProductName = confirmPageLocators.ProductName.getText();
        System.out.println("ConfirmProductName is: " + ConfirmProductName);


    }

    public void BookingID() {
        BookingId = confirmPageLocators.BookingID.getText();
        System.out.println("BookingId is: " + BookingId);


    }

    public void Date() {
        String DateAll = confirmPageLocators.Date.getText();
        ConfirmDate = DateAll.split(":")[1];
        System.out.println("ConfirmDate is: " + ConfirmDate);


    }

    public void Guest() {
        String Guest = confirmPageLocators.Location.getText();
        ConfirmGuest = Guest.split(":")[1];
        System.out.println("ConfirmGuest is: " + ConfirmGuest);


    }

    public void Location() throws InterruptedException {
        String Loc = confirmPageLocators.Location.getText();
        ConfirmLocation = Loc.split(":")[1];
        System.out.println(ConfirmLocation);
        Thread.sleep(20000);


    }

    public void BookingIdVisible() {
        if (confirmPageLocators.BookingID != null) {

            System.out.println("Navigated to the Confirmation Page");
            System.out.println("Navigated URL is: " + SeleniumDriver.getDriver().getCurrentUrl());
            BookingId = confirmPageLocators.BookingID.getText();
            System.out.println("BookingId is: " + BookingId);

        } else {
            System.out.println("Not Navigated to the Confirmation Page");
        }

    }


}
