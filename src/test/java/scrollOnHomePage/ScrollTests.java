package scrollOnHomePage;

import base.BaseTests;
import org.testng.annotations.Test;

public class ScrollTests extends BaseTests {
    @Test

    public void testScrollOnHomePage(){
        homePage.ScrollTobutton();
    }
}
