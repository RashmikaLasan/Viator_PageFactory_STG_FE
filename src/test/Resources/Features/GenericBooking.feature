Feature: Do the generic search and complete the booking.

  @cat
  Scenario: Validate Generic Flow for 1 Adult and 1 Infant

    Given I am on the Passenger Page "https://staging.theculturetrip.com/bookable/ibe/passenger?ci=GENCT_20210519_*_AUH_VT12596P7&fc=GEN_A-1_TG2~15:00&ex=&pax=1-1-0-0&childDob=2020&locale=en&currency=GBP"
    When I fill the details of the Adult Passenger
    When I fill the details of the Infant Passenger
    And select the Hotel Pickup from drop down
    And add Additional Information in text box
    And click Continue to Payment button

    And fill Card holder name
    And fill the Credit Card Number
    Then tick the Agreement
    And click Book Now button

    Then wait till page items load
    Then Assert the Product Name
    And Passenger details
    And Booking Date
    And Price of the Booking


#    #############-----------------------------------------

  @mad
  Scenario Outline: Validate Generic Flow for 1 Adult and 1 Infantsdsd

    Given user set the booking parameter checkIn date as "<FutureDateCount>" Supplier Code as "<supplierCode>" City as "<City>" ChoiceKey as "<ChoiceKey>" pax as "<Pax>" ChildDoB as "<childDob>" seniorDob as "<seniorDob>" currency as "<currency>" bookingProductType as "<bookingProductType>"
    When I fill the details in Checkout Page
    And should navigate to the Confirmation Page
    And Booking ID Should be displayed
    And Product Name should be displayed
    And Date should be displayed
    And Guest count should be displayed
    And Location should be displayed

    Examples:
      | FutureDateCount | supplierCode | City | ChoiceKey                                 | Pax                    | childDob | seniorDob | currency | bookingProductType |
      | 60              | VT5461P40    | LON  | GEN~0~DEFAULT~10:00~EVT-75~VT5461P40~5461P40 | 1-0-0-0 |          |           | GBP      | experiences        |


