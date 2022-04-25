package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //click on the ‘Forgot your password’ link
        //find the element of forgot your password
        clickOnElement(By.linkText("Forgot your password?"));
        //this os form requirement
        String expectedforgotPasswordText = "Forgot Your Password?";
        //find the forgot text element and get the text
        String actualforgotPasswordText = getTextFromElement(By.xpath("//div[@class='head']"));
        //Verify the text error message with assert
        verifyTextMessage(expectedforgotPasswordText,actualforgotPasswordText);
    }

    @After
    public void tearDown(){
        //close the browser
        closeBrowser();
    }

}
