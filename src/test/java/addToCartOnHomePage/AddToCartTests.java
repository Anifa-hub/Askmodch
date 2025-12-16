package addToCartOnHomePage;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class AddToCartTests extends BaseTests {
    @Test
    public void testAddToCart(){
       boolean isOkay = homePage.addToCart(3);
        Assert.assertTrue(isOkay, "Add to Cart Failed");
    }
}
