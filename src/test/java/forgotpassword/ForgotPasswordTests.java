package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testRetrievePassword(){
        var forgetPasswordPage = homePage.clickForgotPasswordPage();
        var emailSentPage = forgetPasswordPage.retrievePassword("mariluke@test.com");
        assertEquals(emailSentPage.getMessage(), "Your e-mail's been sent!", "Message is incorrect");
        
    }


}
