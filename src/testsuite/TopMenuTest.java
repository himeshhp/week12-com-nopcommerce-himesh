package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseURL = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseURL);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //Find computers tab and click on tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a")).click();

        //Verify text on computers page
        String expectedMessage = "Computers";

        //Find computers text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[text()='Computers']"));
        String actualMessage = actualTextMessageElement.getText();

        //Validate actual and expected
        Assert.assertEquals("Text not matched", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //Find electronics tab and click on tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a")).click();

        //Verify text on electronics page
        String expectedMessage = "Electronics";

        //Find electronics text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[text()='Electronics']"));
        String actualMessage = actualTextMessageElement.getText();

        //Validate actual and expected
        Assert.assertEquals("Text not matched", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //Find apparel tab and click on tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[3]/a")).click();

        //Verify text on apparel page
        String expectedMessage = "Apparel";

        //Find apparel text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[text()='Apparel']"));
        String actualMessage = actualTextMessageElement.getText();

        //Validate actual and expected
        Assert.assertEquals("Text not matched", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //Find digital downloads tab and click on tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[4]/a")).click();

        //Verify text on digital downloads page
        String expectedMessage = "Digital downloads";

        //Find the digital downloads text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
        String actualMessage = actualTextMessageElement.getText();

        //Validate actual and expected
        Assert.assertEquals("Text not matched", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //Find books tab and click on tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[5]/a")).click();

        //Verify text on books page
        String expectedMessage = "Books";

        //Find books text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[text()='Books']"));
        String actualMessage = actualTextMessageElement.getText();

        //Validate actual and expected
        Assert.assertEquals("Text not matched", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //Find jewelry tab and click on tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[6]/a")).click();

        //Verify text on jewelry page
        String expectedMessage = "Jewelry";

        //Find jewelry text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[text()='Jewelry']"));
        String actualMessage = actualTextMessageElement.getText();

        //Validate actual and expected
        Assert.assertEquals("Text not matched", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //Find gift cards tab and click on tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[7]/a")).click();

        //Verify text on gift cards page
        String expectedMessage = "Gift Cards";

        //Find the gift cards text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[text()='Gift Cards']"));
        String actualMessage = actualTextMessageElement.getText();

        //Validate actual and expected
        Assert.assertEquals("Text not matched", expectedMessage, actualMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
