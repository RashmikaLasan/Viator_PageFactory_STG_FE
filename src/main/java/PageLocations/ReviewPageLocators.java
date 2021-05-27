package PageLocations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ReviewPageLocators {

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/main[1]/surf-ct-widget-wizard[1]/div[1]/surf-ct-passenger-page[1]/div[1]/div[1]/article[1]/section[3]/div[2]/div[1]/surf-ct-booking-details-component[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[3]")
    public WebElement BookingID;

    @FindBy(how = How.XPATH,using = "/html[1]/body[1]/main[1]/surf-ct-widget-wizard[1]/div[1]/surf-ct-passenger-page[1]/div[1]/div[1]/article[1]/section[3]/div[2]/div[1]/surf-ct-booking-details-component[1]/div[1]/div[1]/div[1]/div[2]/h4[1]")
    public WebElement ProductName3;

    @FindBy(how = How.XPATH,using = "/html[1]/body[1]/main[1]/surf-ct-widget-wizard[1]/div[1]/surf-ct-passenger-page[1]/div[1]/div[1]/article[1]/section[3]/div[2]/div[1]/surf-ct-booking-details-component[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]")
    public WebElement Date3;

    @FindBy(how = How.XPATH,using = "/html[1]/body[1]/main[1]/surf-ct-widget-wizard[1]/div[1]/surf-ct-passenger-page[1]/div[1]/div[1]/article[1]/section[3]/div[2]/div[1]/surf-ct-booking-details-component[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[3]")
    public WebElement Time3;





}
