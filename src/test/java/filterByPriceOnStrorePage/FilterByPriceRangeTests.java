package filterByPriceOnStrorePage;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.StorePage;

public class FilterByPriceRangeTests extends BaseTests {

    @Test
    public void testFilterByPriceRange(){
        var filter = homePage.clickStore();
        filter.filterByPriceRange(50,70);
    }
}
