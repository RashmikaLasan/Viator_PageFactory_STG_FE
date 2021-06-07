package Steps;

import org.junit.Assert;

import static PageActions.CheckOutActions.ProdName;
import static PageActions.ConfirmPageActions.ConfirmProductName;

public class ConfirmPageAssertions {


    public void Assertions() {

        System.out.println(ProdName);
        System.out.println(ConfirmProductName);
        Assert.assertEquals(ProdName, ConfirmProductName);




    }


}
