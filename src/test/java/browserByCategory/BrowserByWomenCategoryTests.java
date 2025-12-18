package browserByCategory;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserByWomenCategoryTests extends BaseTests {
    @Test
    public void testWomenCategoryProducts(){
        var womenProducts = homePage.clickWomen();
        boolean isContainsMenProducts = womenProducts.verifyWomenCategoryProducts();
        Assert.assertFalse(isContainsMenProducts,"It contains mixed Gender");

    }
}
