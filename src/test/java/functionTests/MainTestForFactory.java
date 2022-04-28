package functionTests;

import helperForTests.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class MainTestForFactory extends BaseTest {


    @Test
    public void clickOnCardUsa() throws InterruptedException {
        epamMainPage
                .scrollToEMEAtab();
        Thread.sleep(2000);
    }

}
