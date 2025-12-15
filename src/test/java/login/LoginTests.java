package login;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTests {

    @Test
    public void testLogin(){
        var login = homePage.clickAccountTOLogin();
        login.setLoginUsername();
        login.setLoginPassword();
        login.clickLoginButton();
        assertEquals(login.confirm(),"Log out","user can not login");
        // you can un comment this if you want to logout
        //login.clickLogoutButton();
    }
}
