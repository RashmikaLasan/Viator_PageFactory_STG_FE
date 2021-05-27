package Steps;

import Utilities.SeleniumDriver;
import cucumber.api.java.Before;

import java.net.MalformedURLException;

public class BeforeActions {

    @Before
    public static void setup() throws MalformedURLException {

        SeleniumDriver.setUpDriver();

    }

}