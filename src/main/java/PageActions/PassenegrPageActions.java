package PageActions;

import PageLocations.PassengerPageLocators;
import Utilities.SeleniumDriver;
import org.openqa.selenium.support.PageFactory;

public class PassenegrPageActions {

    PassengerPageLocators passengerPageLocators;

    public PassenegrPageActions(){
        this.passengerPageLocators = new PassengerPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),passengerPageLocators);

    }

    public void adultDetails(){

        passengerPageLocators.AdultFirstName.sendKeys("Lasan");
        passengerPageLocators.AdultLastName.sendKeys("Rashmika");
        passengerPageLocators.AdultEmailAddress.sendKeys("lasanrash@gmail.com");
        passengerPageLocators.AdultPhoneNumber.sendKeys("0711996777");
        System.out.println("Adult Details Filled");
    }

    public void infantDetails(){
        passengerPageLocators.InfantFirstName.sendKeys("Virat");
        passengerPageLocators.InfantLastName.sendKeys("Kohli");
        System.out.println("Infant Details Filled");


    }

    public void pickUpDropDown(){

        passengerPageLocators.HotelPickUpDropDown.click();
        passengerPageLocators.DropDownItemSelect.click();
        System.out.println("pickUpDropDown Selected");

    }

    public void addNote(){

        passengerPageLocators.AdditionalInfo.sendKeys("This is an additional note");
        System.out.println("Additional Note filled");
    }

    public void clickContinePayment(){
        passengerPageLocators.ContinuePaymentButton.click();
        System.out.println("Click 4ContinePayment ");

    }


}
