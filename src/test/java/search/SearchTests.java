package search;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchTests extends BaseTests {
    @Test
    public void testSearch(){
        var search = homePage.clickStore();
        search.searchProduct("Jeans".toLowerCase());
        search.clickSearchButton();
        boolean confirmation = search.verifySearchResultsAreRelevant();
        Assert.assertTrue(confirmation, "Product is not displayed");
    }
    // if the searched product is not found
    @Test
    public void productNotFoundTest(){
        var noProduct = homePage.clickStore();
        noProduct.searchProduct("jetans");
        noProduct.clickSearchButton();
        assertEquals(noProduct.isProductDisplayed(),"No products were found matching your selection.","There is product that much your search");
    }

}
