package PageActions;

import PageLocations.CheckOutLocators;
import Utilities.SeleniumDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

public class CheckOutActions {

    CheckOutLocators CheckOutPageLocators;

    public CheckOutActions() {
        this.CheckOutPageLocators = new CheckOutLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), CheckOutPageLocators);

    }

    public void PassengerDetails() throws InterruptedException {

        Thread.sleep(3000);
        CheckOutPageLocators.Title1.click();
        Thread.sleep(2000);
        CheckOutPageLocators.TitleSelect1.click();

        CheckOutPageLocators.FName1.sendKeys("Lasan");
        CheckOutPageLocators.LName1.sendKeys("Rashmika");

        CheckOutPageLocators.Email1.sendKeys("lasanrash@gmail.com");

        JavascriptExecutor jsx = (JavascriptExecutor) SeleniumDriver.getDriver();
        jsx.executeScript("window.scrollBy(0,250)", "");


        CheckOutPageLocators.CountryCode1.click();
        Thread.sleep(3000);
        System.out.println("CountryCode1 Click Success1");

        CheckOutPageLocators.CountryCodeSelect1.click();


        CheckOutPageLocators.MobileNumber.sendKeys("0711996777");
        Thread.sleep(3000);

        CheckOutPageLocators.SomeWhere.click();


        CheckOutPageLocators.Language.click();
        Thread.sleep(3000);
        CheckOutPageLocators.LanguageSelect.click();


    }

    public void PayementSection() throws InterruptedException {


        JavascriptExecutor jsx = (JavascriptExecutor) SeleniumDriver.getDriver();
        jsx.executeScript("window.scrollBy(0,250)", "");
        SeleniumDriver.getDriver().switchTo().frame(0);
        Thread.sleep(2500);

        CheckOutPageLocators.CardNumber.sendKeys("555555555555444425255555555");

        SeleniumDriver.getDriver().switchTo().defaultContent();
        Thread.sleep(2500);
        CheckOutPageLocators.CardName.sendKeys("LasanRash");
        jsx.executeScript("window.scrollBy(0,150)", "");


        CheckOutPageLocators.Tick.click();
        CheckOutPageLocators.Confirm.click();
        Thread.sleep(25000);


    }


}

