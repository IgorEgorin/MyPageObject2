package functionTests;

import helperForTests.BaseTest;
import helperForTests.Retry;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;


@Listeners(TestNGlistener.class)
public class MainTest extends BaseTest {

    @Test(description = "Кликаем на карточку США")
    public void clickOnCardUsa() throws InterruptedException {
//        epamMainPage
//                .scrollToEMEAtab();
        driver.findElement(By.xpath("s")).click();
        Thread.sleep(2000);
    }

    @Test()
    public void clickOnCardUsaTwo() throws InterruptedException {
        epamMainPage
                .scrollToEMEAtab();
        Thread.sleep(2000);
    }


//    @Test(expectedExceptions = {IndexOutOfBoundsException.class})
//    public void enterSearchQuery() throws InterruptedException {
//        epamMainPage
//                .enterSearchQuery("1");
//
//        Thread.sleep(4000);
//    }
//
//    @Parameters({"IntQuery"})
//    @Test(enabled = false)
//    public void enterIntQuery(int IntQuery) throws InterruptedException {
//        epamMainPage
//                .enterSearchQuery(String.valueOf(IntQuery));
//        Thread.sleep(4000);
//    }
//
//    @Test(enabled = true)
//    public void precondMethod() throws InterruptedException {
//        epamMainPage.enterSearchQuery("aaaa")
//                .scrollToEMEAtab();
//        Thread.sleep(3000);
//    }
//
//
//    @Test (enabled = false,
//            dependsOnMethods = "precondMethod"
//            ,alwaysRun = true)
//    public void mainMethod() throws InterruptedException {
//        driver.navigate().back();
//        epamMainPage.scrollToEMEAtab();
//        Thread.sleep(4000);
//    }
//
//    @Ignore
//    @Test
//    public void с(){
//        System.out.println("5");
//
//    }
//
//    @Test (enabled = false,
//            retryAnalyzer = Retry.class)
//    public void mustFail(){
//        System.out.println("Amount of run");
//        epamMainPage.enterSearchQuery("aaa")
//                .scrollToEMEAtab();
//    }
//
//    @DataProvider(parallel = true)
//    public Object[][] dataForProvider() {
//        return new Object[][]{
//                {"Пар1", "США"},
//                {"Пар2", "Канада"},
//                {"Пар3", "Европа"}
//        };
//    }
//
//    @Parameters
//    @Test(dataProvider = "dataForProvider")
//    public void enterTwoQuery(String s1, String s2) throws InterruptedException {
//        epamMainPage.enterTwoSearchQuery(s1, s2);
//        Thread.sleep(4000);
//    }
//
//    @DataProvider(name = "secondParCountrySearch")
//    public Object[][] doesNotMatterName() {
//        return new Object[][]{
//                {"Par4", "Scotland"},
//                {"Par5", "France"},
//                {"Par6", "Italy"}
//        };
//    }
//
//    @Deprecated
//    @Test(dataProvider = "secondParCountrySearch")
//    public void searchParTwo(String s1, String s2) throws InterruptedException {
//        epamMainPage.enterTwoSearchQuery(s1, s2);
//        Thread.sleep(4000);
//    }
}
