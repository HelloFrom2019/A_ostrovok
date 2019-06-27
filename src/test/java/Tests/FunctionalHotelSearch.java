package Tests;

import org.testng.AssertJUnit;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Keys;
import PageObgjects.LandingPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.base;

public class FunctionalHotelSearch extends base {


    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));

    }

    @Test
    public void FunctionalSearchHotel() throws InterruptedException {

        String d = prop.getProperty("fromCity");
        String result = prop.getProperty("result");
        LandingPage lp = new LandingPage(driver);
        lp.getDisrination().sendKeys(d);
        Thread.sleep(1000);
        lp.getDisrination().sendKeys(Keys.ENTER);
        lp.getCheckIn().click();
        lp.getDateIn().click();
        lp.getDateOut().click();
        lp.getRoom().click();
        lp.getDone().click();
        lp.getSearch().click();

        ArrayList<String>
                Available_tabs = new ArrayList<String>
                (driver.getWindowHandles());

        driver.switchTo().window(Available_tabs.get(1));
        AssertJUnit.assertEquals(lp.getResult().getText(), result);

    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();


    }


}
		
		
		


