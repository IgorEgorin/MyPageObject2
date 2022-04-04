package helperForTests;

import createDriver.CreateDriverChrome;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.EpamMainPage;

public class BaseTest {

    protected WebDriver driver = new CreateDriverChrome().createDriver();
    protected EpamMainPage epamMainPage = new EpamMainPage(driver);

    @BeforeTest
    public void setUp(){
        driver.get("https://www.epam.com");
    }

    @AfterTest
    public void quit(){
        driver.quit();
    }

}
