package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter “Admin” username
        sendTextToElement(By.name("username"), "Admin");
        // Enter “admin123“ password
        sendTextToElement(By.name("password"), "admin123");
        // Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//button[@type='submit']"));

        String expectedMessage = "Dashboard";
        String actualTextMessage = getTextFromElement(By.xpath("//h6[contains(@class,'header-breadcrumb-module')]"));


        //Validate actual and expected message
        Assert.assertEquals("Dashboard", expectedMessage, actualTextMessage);


    }

    @After
    public void testDown() {
        closeBrowser();
    }

}
