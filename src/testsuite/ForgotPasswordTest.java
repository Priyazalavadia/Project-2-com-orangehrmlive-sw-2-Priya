package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //click on forgot password
        clickOnElement(By.xpath("//p[contains(@class,'-forgot-header')]"));

        String expectedMessage = "Reset Password";
        String actualTextMessage = getTextFromElement(By.xpath("//h6[contains(@class,'forgot-password-title')]"));


        //Validate actual and expected message
        Assert.assertEquals("No Such msg found", expectedMessage, actualTextMessage);
    }

    @After
    public void testDown() {
        closeBrowser();
    }


}



