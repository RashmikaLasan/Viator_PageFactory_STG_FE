$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GenericBooking.feature");
formatter.feature({
  "line": 1,
  "name": "Do the generic search and complete the booking.",
  "description": "",
  "id": "do-the-generic-search-and-complete-the-booking.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 25,
      "value": "#############-----------------------------------------"
    }
  ],
  "line": 30,
  "name": "Validate Generic Flow for 1 Adult and 1 Infantsdsd",
  "description": "",
  "id": "do-the-generic-search-and-complete-the-booking.;validate-generic-flow-for-1-adult-and-1-infantsdsd",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@mad"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user set the booking parameter checkIn date as \"\u003cFutureDateCount\u003e\" Supplier Code as \"\u003csupplierCode\u003e\" City as \"\u003cCity\u003e\" ChoiceKey as \"\u003cChoiceKey\u003e\" pax as \"\u003cPax\u003e\" ChildDoB as \"\u003cchildDob\u003e\" seniorDob as \"\u003cseniorDob\u003e\" currency as \"\u003ccurrency\u003e\" bookingProductType as \"\u003cbookingProductType\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "I fill the details in Checkout Page",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "should navigate to the Confirmation Page",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Booking ID Should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Product Name should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Date should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Guest count should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Location should be displayed",
  "keyword": "And "
});
formatter.examples({
  "line": 41,
  "name": "",
  "description": "",
  "id": "do-the-generic-search-and-complete-the-booking.;validate-generic-flow-for-1-adult-and-1-infantsdsd;",
  "rows": [
    {
      "cells": [
        "FutureDateCount",
        "supplierCode",
        "City",
        "ChoiceKey",
        "Pax",
        "childDob",
        "seniorDob",
        "currency",
        "bookingProductType"
      ],
      "line": 42,
      "id": "do-the-generic-search-and-complete-the-booking.;validate-generic-flow-for-1-adult-and-1-infantsdsd;;1"
    },
    {
      "cells": [
        "60",
        "VT5461P40",
        "LON",
        "GEN~0~DEFAULT~10:00~EVT-75~VT5461P40~5461P40",
        "1-0-0-0",
        "",
        "",
        "GBP",
        "experiences"
      ],
      "line": 43,
      "id": "do-the-generic-search-and-complete-the-booking.;validate-generic-flow-for-1-adult-and-1-infantsdsd;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4064265400,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Validate Generic Flow for 1 Adult and 1 Infantsdsd",
  "description": "",
  "id": "do-the-generic-search-and-complete-the-booking.;validate-generic-flow-for-1-adult-and-1-infantsdsd;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@mad"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user set the booking parameter checkIn date as \"60\" Supplier Code as \"VT5461P40\" City as \"LON\" ChoiceKey as \"GEN~0~DEFAULT~10:00~EVT-75~VT5461P40~5461P40\" pax as \"1-0-0-0\" ChildDoB as \"\" seniorDob as \"\" currency as \"GBP\" bookingProductType as \"experiences\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "I fill the details in Checkout Page",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "should navigate to the Confirmation Page",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Booking ID Should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Product Name should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Date should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Guest count should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Location should be displayed",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "60",
      "offset": 48
    },
    {
      "val": "VT5461P40",
      "offset": 70
    },
    {
      "val": "LON",
      "offset": 90
    },
    {
      "val": "GEN~0~DEFAULT~10:00~EVT-75~VT5461P40~5461P40",
      "offset": 109
    },
    {
      "val": "1-0-0-0",
      "offset": 163
    },
    {
      "val": "",
      "offset": 185
    },
    {
      "val": "",
      "offset": 201
    },
    {
      "val": "GBP",
      "offset": 216
    },
    {
      "val": "experiences",
      "offset": 244
    }
  ],
  "location": "GenericFlowSteps.userSetTheBookingParameterCheckInDateAsSupplierCodeAsCityAsChoiceKeyAsPaxAsChildDoBAsSeniorDobAsCurrencyAsBookingProductTypeAs(int,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 77804357800,
  "status": "passed"
});
formatter.match({
  "location": "GenericFlowSteps.iFillTheDetailsInCheckoutPage()"
});
formatter.result({
  "duration": 53102830900,
  "status": "passed"
});
formatter.match({
  "location": "GenericFlowSteps.shouldNavigateToTheConfirmationPage()"
});
formatter.result({
  "duration": 47758996800,
  "status": "passed"
});
formatter.match({
  "location": "GenericFlowSteps.bookingIDShouldBeDisplayed()"
});
formatter.result({
  "duration": 24534700,
  "status": "passed"
});
formatter.match({
  "location": "GenericFlowSteps.productNameShouldBeDisplayed()"
});
formatter.result({
  "duration": 45070100,
  "status": "passed"
});
formatter.match({
  "location": "GenericFlowSteps.dateShouldBeDisplayed()"
});
formatter.result({
  "duration": 45543500,
  "status": "passed"
});
formatter.match({
  "location": "GenericFlowSteps.guestCountShouldBeDisplayed()"
});
formatter.result({
  "duration": 48522600,
  "status": "passed"
});
formatter.match({
  "location": "GenericFlowSteps.locationShouldBeDisplayed()"
});
formatter.result({
  "duration": 20028672300,
  "status": "passed"
});
formatter.after({
  "duration": 1077498700,
  "status": "passed"
});
});