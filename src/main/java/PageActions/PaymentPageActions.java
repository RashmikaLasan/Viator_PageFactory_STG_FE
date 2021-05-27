package PageActions;

import PageLocations.PaymentPageLocators;
import Utilities.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static Utilities.SeleniumDriver.getDriver;

public class PaymentPageActions {

    PaymentPageLocators paymentPageLocators;
    ReviewPageActions reviewPageActions;
    public String ff;

    public PaymentPageActions(){
        this.paymentPageLocators = new PaymentPageLocators();
        this.reviewPageActions   = new ReviewPageActions();
        PageFactory.initElements(getDriver(),paymentPageLocators);
        PageFactory.initElements(getDriver(),reviewPageActions);

    }

    public void enterCarName(){

        paymentPageLocators.CardName.sendKeys("LasanR");
        System.out.println("Credit Card  Name Enter");

    }

    public void enterCardnumber(){
        WebElement Ifr = getDriver().findElement( By.xpath( "//iframe[@title='Secure card payment input frame']" ) );
        getDriver().switchTo().frame( Ifr );
        paymentPageLocators.CardNumber.sendKeys("5555555555554444044444444444");
        System.out.println("Credit card details entered");
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,1000)");
        System.out.println("Scroll Down");
    }

    public void tickBoxClick(){
        paymentPageLocators.TickBox.click();
        System.out.println("Tick box ticked");

    }

    public void bookNowClick(){
        paymentPageLocators.BookNow.click();
        System.out.println("Click Book now");
    }

    public String productName(){
        ff = paymentPageLocators.ProductNamePaymentPage.getText();
        System.out.println("productName>>>>>" +ff);
        return paymentPageLocators.ProductNamePaymentPage.getText();

    }
}
