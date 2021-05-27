package PageActions;

import PageLocations.PaymentPageLocators;
import PageLocations.ReviewPageLocators;
import Utilities.SeleniumDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.assertTrue;

public class ReviewPageActions {

    ReviewPageLocators reviewPageLocators;
    PaymentPageLocators paymentPageLocators;
    public String ProName3;
    public String ProName2;


    public ReviewPageActions() {
        this.reviewPageLocators = new ReviewPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), reviewPageLocators);
    }

    public void waitTillDisplayID() {
        WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(reviewPageLocators.BookingID));
        System.out.println("Wait till elementToBeClickable");
    }

    public void assertProductName() {
        try {
            PaymentPageActions paymentPageActions = new PaymentPageActions();
//        String ff1 = paymentPageLocators.ProductNamePaymentPage.getText();
//        System.out.println(ff1);

            ProName3 = reviewPageLocators.ProductName3.getText();
            System.out.println("Product Name in Review Page is:" + ProName3);

            ProName2 = paymentPageActions.productName();
            System.out.println("Product Name in Payment Page is" + ProName2);
            assertTrue(ProName3.contains(ProName2));
            System.out.println("Assertion Success");
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
