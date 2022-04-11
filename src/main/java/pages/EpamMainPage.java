package pages;

import helperForPages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EpamMainPage extends BasePage {

    private By tabEMEA = By.xpath("//a[@role='tab'][text()='EMEA']");
    private By searchButtonInHeader = By.xpath("//button[@class='header-search__button header__icon']");
    private By searchString = By.id("new_form_search");
    private By searchButtonOnSearchPage = By.xpath("//button[@class='header-search__submit']");

    public EpamMainPage(WebDriver driver) {
        super(driver);
    }

    public EpamMainPage scrollToEMEAtab(){
        waitVisibilityOf(driver.findElement(tabEMEA));
        scrollToElement(tabEMEA);
        return this;
    }

    public EpamMainPage enterSearchQuery(String query){
        driver.findElement(searchButtonInHeader).click();
        driver.findElement(searchString).sendKeys(query);
        driver.findElement(searchButtonOnSearchPage).click();
        return this;
    }

    public EpamMainPage enterTwoSearchQuery(String query1, String query2){
        driver.findElement(searchButtonInHeader).click();
        driver.findElement(searchString).sendKeys(query1);
        driver.findElement(searchString).sendKeys(" " + query2);
        driver.findElement(searchButtonOnSearchPage).click();
        return this;
    }


}
