package addToCartOnHomePage;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class AddToCartTests extends BaseTests {

    @Test
    public void testAddToCart(){
        var cart= homePage.clickStore();
        var cart2 = cart.clickProduct();
          cart2.addToCart();
        var proceed = cart2.clickViewCart();
       var checkout = proceed.clickProceedCheckOut();
       checkout.billingDetails();






    }

}
