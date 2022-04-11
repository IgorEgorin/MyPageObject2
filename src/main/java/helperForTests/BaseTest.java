package helperForTests;

import createDriver.CreateDriverChrome;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.EpamMainPage;

public class BaseTest {

    protected WebDriver driver = new CreateDriverChrome().createDriver();
    protected EpamMainPage epamMainPage = new EpamMainPage(driver);

    @BeforeTest (groups = {"smoke","regress"})
    public void setUp(){
        driver.get("https://www.epam.com");
    }

    @AfterTest (groups = {"smoke","regress"})
    public void quit(){
        driver.quit();
    }

}
