package browserByCategory;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserByMensCategoryTests extends BaseTests {
    @Test
    public void testBrowserByCategory(){
        var category = homePage.clickMen();
        category.selectCategory();

        boolean mensProduct = category.verifyMenProduct();
        Assert.assertTrue(mensProduct,"they are mixed genders product");
    }
}
