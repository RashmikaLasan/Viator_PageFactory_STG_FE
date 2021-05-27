package Steps;

import PageActions.PassenegrPageActions;
import PageActions.PaymentPageActions;
import PageActions.ReviewPageActions;
import Utilities.SeleniumDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.time.LocalDate;

public class GenericFlowSteps {

    PassenegrPageActions passenegrPageActions = new PassenegrPageActions();
    PaymentPageActions paymentPageActions = new PaymentPageActions();
    ReviewPageActions reviewPageActions = new ReviewPageActions();
    String STGBase = "https://staging.theculturetrip.com/checkout/?";

    @Given("^I am on the Passenger Page \"([^\"]*)\"$")
    public void i_am_on_the_passenger_page_something(String url) throws Throwable {
        System.out.println("Redirect to the URL");
        SeleniumDriver.openPage(url);
        Thread.sleep(5000);

    }

    @When("^I fill the details of the Adult Passenger$")
    public void i_fill_the_details_of_the_adult_passenger() throws Throwable {
        passenegrPageActions.adultDetails();
        Thread.sleep(1000);
    }

    @When("^I fill the details of the Infant Passenger$")
    public void i_fill_the_details_of_the_infant_passenger() throws Throwable {
        passenegrPageActions.infantDetails();
        Thread.sleep(1000);

    }

    @And("^select the Hotel Pickup from drop down$")
    public void select_the_hotel_pickup_from_drop_down() throws Throwable {
        passenegrPageActions.pickUpDropDown();
        Thread.sleep(1000);

    }

    @And("^add Additional Information in text box$")
    public void add_additional_information_in_text_box() throws Throwable {
        passenegrPageActions.addNote();


    }

    @And("^click Continue to Payment button$")
    public void click_continue_to_payment_button() throws Throwable {
        passenegrPageActions.clickContinePayment();
        Thread.sleep(5000);
    }


    @And("^fill Card holder name$")
    public void fill_card_holder_name() throws Throwable {
        paymentPageActions.enterCarName();
        Thread.sleep(500);
    }

    @And("^fill the Credit Card Number$")
    public void fill_the_credit_card_number() throws Throwable {
        paymentPageActions.enterCardnumber();
        Thread.sleep(3500);
    }


    @Then("^tick the Agreement$")
    public void tick_the_agreement() throws Throwable {
        paymentPageActions.tickBoxClick();
        Thread.sleep(5000);
    }


    @And("^click Book Now button$")
    public void click_book_now_button() throws Throwable {
        paymentPageActions.productName();
        paymentPageActions.bookNowClick();
        Thread.sleep(15000);
    }

    @Then("^wait till page items load$")
    public void wait_till_page_items_load(){

        reviewPageActions.waitTillDisplayID();

    }

    @Then("^Assert the Product Name$")
    public void assert_the_product_name() throws Throwable {
        reviewPageActions.assertProductName();
        Thread.sleep(15000);
    }

    @And("^Passenger details$")
    public void passenger_details() throws Throwable {
        System.out.println("passenger_details");
    }

    @And("^Booking Date$")
    public void booking_date() throws Throwable {
        System.out.println("booking_date");
    }

    @And("^Price of the Booking$")
    public void price_of_the_booking() throws Throwable {
        System.out.println("price_of_the_booking");
    }

    @Given("^user set the booking parameter checkIn date as \"([^\"]*)\" Supplier Code as \"([^\"]*)\" City as \"([^\"]*)\" ChoiceKey as \"([^\"]*)\" pax as \"([^\"]*)\" ChildDoB as \"([^\"]*)\" seniorDob as \"([^\"]*)\" currency as \"([^\"]*)\" bookingProductType as \"([^\"]*)\"$")
    public void userSetTheBookingParameterCheckInDateAsSupplierCodeAsCityAsChoiceKeyAsPaxAsChildDoBAsSeniorDobAsCurrencyAsBookingProductTypeAs(String FutureDateCount, String supplierCode, String City, String ChoiceKey, String Pax, String childDob, String seniorDob, String currency, String bookingProductType) throws Throwable {
                                                                                                                                  //"<FutureDateCount>" Supplier Code as "<supplierCode>" City as "<City>" ChoiceKey as "<ChoiceKey>" pax as "<Pax>" ChildDoB as "<childDob>" seniorDob as "<seniorDob>" currency as "<currency>" bookingProductType as "<bookingProductType>"

       String StartDate=  TimeDate.timeer(60);
       String stgCheckOut = "startDate="+StartDate+"&supplierCode="+supplierCode+"&city="+City+"&fc="+ChoiceKey+"&pax="+Pax+"&childDob="+childDob+"&seniorDob="+seniorDob+"&currency="+currency+"&bookingProductType="+bookingProductType;

        SeleniumDriver.openPage(STGBase+stgCheckOut);
        Thread.sleep(5000);
    }
}
