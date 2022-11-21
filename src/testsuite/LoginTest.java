package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseURL = "https://demo.nopcommerce.com/";

    //Setup browser
    @Before
    public void setUp() {
        openBrowser(baseURL);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //Find login tab and click on tab
        driver.findElement(By.linkText("Log in")).click();

        //Verify text on login page
        String expectedMessage = "Welcome, Please Sign In!";

        //Find the welcome text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualTextMessageElement.getText();

        //Validate actual and expected
        Assert.assertEquals("Not navigated to Login Page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Find login tab and click on tab
        driver.findElement(By.linkText("Log in")).click();

        //Find email and enter in field element
        driver.findElement(By.id("Email")).sendKeys("test123@gmail.com");

        //Find password and enter in field element
        driver.findElement(By.name("Password")).sendKeys("test1234");

        //Find login button and click
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        //Verify Log out text after login
        String expectedMessage = "Log out";

        //Find Log out text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[text()='Log out']"));
        String actualMessage = actualTextMessageElement.getText();

        //Validate actual and expected
        Assert.assertEquals("Log out text not found", expectedMessage, actualMessage);
    }

    @Test
    public void verifyTheErrorMessage() {
        //Find login tab and click on tab
        driver.findElement(By.linkText("Log in")).click();

        //Find email and enter in field element
        driver.findElement(By.id("Email")).sendKeys("test123@gmail.com");

        //Find password and enter in field element
        driver.findElement(By.name("Password")).sendKeys("test123");

        //Find login button and click
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        //Verify error message on login page when entering invalid credentials
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" + "The credentials provided are incorrect";

        //Find the error message text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualMessage = actualTextMessageElement.getText();

        //Validate actual and expected
        Assert.assertEquals("Error message not found", expectedMessage, actualMessage);
    }
    
    @After
    public void tearDown() {
        closeBrowser();
    }
}
