package functionTests;

import helperForTests.BaseTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {


//    @Deprecated
//    @Parameters
//    @Test(groups = {"smoke"})
//    public void clickOnCardUsa() throws InterruptedException {
//        epamMainPage
//                .scrollToEMEAtab();
//        System.out.println("Внутри метода");
//        Thread.sleep(2000);
//    }
//
//    @Deprecated
//    @Parameters({"query"})
//    @Test
//    public void enterSearchQuery(String query) throws InterruptedException {
//        epamMainPage
//                .enterSearchQuery(query);
//
//        Thread.sleep(4000);
//    }
//
//    @Deprecated
//    @Parameters({"IntQuery"})
//    @Test
//    public void enterIntQuery(int IntQuery) throws InterruptedException {
//        epamMainPage
//                .enterSearchQuery(String.valueOf(IntQuery));
//        Thread.sleep(4000);
//    }

    @Test
    public void precondMethod() throws InterruptedException {
        epamMainPage.enterSearchQuery("aaaa")
                .scrollToEMEAtab();
        Thread.sleep(3000);
    }


    @Test (dependsOnMethods = "precondMethod"
            ,alwaysRun = true)
    public void mainMethod() throws InterruptedException {
        driver.navigate().back();
        epamMainPage.scrollToEMEAtab();
        Thread.sleep(4000);
    }


//    @DataProvider(name = "dataFromDProvider")
//    public Object[][] dataForProvider() {
//        return new Object[][]{
//                {"Пар1", "США"},
//                {"Пар2", "Канада"},
//                {"Пар3", "Европа"}
//        };
//    }
//
//    @Deprecated
//    @Parameters({"dataFromDProvider"})
//    @Test(dataProvider = "dataFromDProvider")
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
