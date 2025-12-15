package register;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RegisterTests extends BaseTests {

    @Test
    public void testRegister (){
        var register = homePage.clickAccount();
        register.setUsername("afa");
        register.setEmail("afa@gmail.com");
        register.setPassword("123");
        register.clickRegister();
        assertEquals(register.assertion(),"Log out","registration fail");


    }
}
