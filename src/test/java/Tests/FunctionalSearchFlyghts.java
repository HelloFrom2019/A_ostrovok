package Tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import PageObgjects.LandingPage;
import resources.base;

public class FunctionalSearchFlyghts extends base {


    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));
    }


    @Test
    public void FunctionalFlyghtsSearch() throws InterruptedException {
        String FromCity = prop.getProperty("fromCity");
        String ToCity = prop.getProperty("toCity");
        LandingPage lp = new LandingPage(driver);
        lp.getFlights().click();
        lp.getDepartureCity().sendKeys(FromCity);
        Thread.sleep(1000);
        lp.getDepartureCity().sendKeys(Keys.ENTER);
        lp.getDestinationCity().sendKeys(ToCity);
        Thread.sleep(1000);
        lp.getDestinationCity().sendKeys(Keys.ENTER);
        lp.getDepartDate().click();
        lp.getDateIn().click();
        lp.getReturnDate().click();
        lp.getDateOut().click();
        lp.getPassengers().click();
        Select SelectClass = new Select(lp.getSelectClass());
        SelectClass.selectByIndex(1);
        Select SelectAdults = new Select(lp.getSelectAdults());
        SelectAdults.selectByIndex(0);
        lp.getDone().click();
        lp.getSearch().click();
        ArrayList<String>
                Available_tabs = new ArrayList<String>
                (driver.getWindowHandles());
        driver.switchTo().window(Available_tabs.get(1));
// 		WebDriverWait wait = new WebDriverWait(driver, 30);
// 		wait.until(ExpectedConditions.invisibilityOf(lp.getResultFlights()));
        AssertJUnit.assertTrue(lp.getResultFlights().isDisplayed());


    }

    @AfterTest
    public void closeWebDriver() {
        driver.quit();

    }
}