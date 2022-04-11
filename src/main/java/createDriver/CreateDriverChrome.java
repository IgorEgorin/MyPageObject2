package createDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CreateDriverChrome {

    public static WebDriver createDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\99999\\IdeaProjects\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        return driver;
    }

}
