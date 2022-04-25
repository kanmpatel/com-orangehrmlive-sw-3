package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){

        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //find the element of username and send the email key
        sendTextToElement(By.id("txtUsername"),"Admin");
        //find the element of password and send the password key
       sendTextToElement(By.xpath("//input[@id='txtPassword']"),"admin123");
        //click on loging button using elements
        clickOnElement(By.name("Submit"));
        //this os form requirement
        String expectedLogInText = "Welcome";
        //find the welcome text element and get the text
        String actualLogInText = getTextFromElement(By.partialLinkText("Welcome"));
        //Verify the text error message with assert
        verifyTextMessage(expectedLogInText,actualLogInText.substring(0,7));
    }

    @After
    public void tearDown(){
        //close the browser
        closeBrowser();
    }

}
