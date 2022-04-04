package functionTests;

import helperForTests.BaseTest;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {

    @Test
    public void clickOnCardUsa() throws InterruptedException {
        epamMainPage
                .scrollToEMEAtab();
        System.out.println("Внутри метода");
        Thread.sleep(2000);
    }
}
