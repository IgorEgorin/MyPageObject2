package functionTests;

import helperForTests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@Listeners(TestNGlistener.class)
public class ForParrallelRun {


    @Test(enabled = false)
    public void first() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\99999\\IdeaProjects\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get("https://www.epam.com");
        driver.findElement(By.xpath("//button[@class='header-search__button header__icon']")).click();
        Thread.sleep(2000);
        driver.quit();
    }

    @Test(enabled = false, successPercentage = 40, invocationCount = 2)
    public void two() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\99999\\IdeaProjects\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get("https://www.epam.com");
        driver.findElement(By.xpath("//button[@class='header-search__button header__icon']")).click();
        Thread.sleep(2000);
        driver.quit();
    }

    @Test(successPercentage = 5)
    public void three() {
        System.out.println("1q");
        Assert.assertTrue(true);
    }



}
