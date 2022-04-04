package pages;

import helperForPages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EpamMainPage extends BasePage {

    private By tabEMEA = By.xpath("//a[@role='tab'][text()='EMEA']");

    public EpamMainPage(WebDriver driver) {
        super(driver);
    }

    public EpamMainPage scrollToEMEAtab(){
        waitVisibilityOf(driver.findElement(tabEMEA));
        scrollToElement(tabEMEA);
        return this;
    }
}
