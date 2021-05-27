package PageLocations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentPageLocators {

    @FindBy(how = How.XPATH,using = "//input[@id='name']")
    public WebElement CardName;

    @FindBy(how = How.XPATH,using = "//input[@placeholder='Card number']")
    public WebElement CardNumber;

    @FindBy(how = How.XPATH,using = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/surf-ct-widget-wizard[1]/div[1]/surf-ct-payment-page[1]/div[1]/div[2]/div[2]/surf-ct-cart-summary-component[1]/div[1]/div[1]/div[1]/div[7]/label[1]/span[1]/span[1]")
    public WebElement TickBox;

    @FindBy(how = How.XPATH,using = "//button[contains(text(),'Book Now')]")
    public WebElement BookNow;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/main[1]/surf-ct-widget-wizard[1]/div[1]/surf-ct-payment-page[1]/div[1]/div[2]/div[2]/surf-ct-cart-summary-component[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/h4[1]")
    public WebElement ProductNamePaymentPage;

}
