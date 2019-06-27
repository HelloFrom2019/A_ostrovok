package Tests;


import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObgjects.LandingPage;
import resources.base;

public class VerifyLanguages extends base {
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));

	}
	@Test
	 public void VerifyRussian() throws InterruptedException {
		LandingPage lp= new LandingPage(driver);
		Select SelectRu=new Select(lp.getlanguages());
		SelectRu.selectByValue("ru");
        Assert.assertEquals(lp.getHotels().getText(),"Отели");		
	}
	@Test
	public void VerifyEnglish() {
		LandingPage lp=new LandingPage(driver);
		Select SelectEn=new Select(lp.getlanguages());
		SelectEn.selectByValue("en");
		Assert.assertEquals(lp.getHotels().getText(), "Hotels");
	}
	@Test
	public void VerifyGerman() {
		LandingPage lp=new LandingPage(driver);
		Select SelectDe=new Select(lp.getlanguages());
		SelectDe.selectByValue("de");
		Assert.assertEquals(lp.getHotels().getText(), "Hotels");
	}
	@Test
	public void VerifyEspañol() {
		LandingPage lp=new LandingPage(driver);
		Select SelectEs=new Select(lp.getlanguages());
		SelectEs.selectByValue("es");
		Assert.assertEquals(lp.getHotels().getText(), "Hoteles");
	}
	@Test
	public void VerifyItaliano() {
		LandingPage lp=new LandingPage(driver);
		Select SelectIt=new Select(lp.getlanguages());
		SelectIt.selectByValue("it");
		Assert.assertEquals(lp.getHotels().getText(), "Hotel");	
	}
	  @Test
	  public void VerifyFrançais() {
		 LandingPage lp=new LandingPage(driver);
		 Select SelectFr =new Select(lp.getlanguages());
		 SelectFr.selectByValue("fr");
		 Assert.assertEquals(lp.getHotels().getText(), "Hôtels");
	  }
	@Test
	public void VerifyPolski() {
		LandingPage lp=new LandingPage(driver);
		Select SelectPol=new Select(lp.getlanguages());
		SelectPol.selectByValue("pl");
		Assert.assertEquals(lp.getHotels().getText(), "Hotele");
	}
	@Test
	public void VerifyPortuguês() {
        LandingPage lp=new LandingPage(driver);
        Select SelectPor = new Select(lp.getlanguages());
        SelectPor.selectByValue("pt");
        Assert.assertEquals(lp.getHotels().getText(), "Hotéis");
	}
	@Test
	public void VefifyTürkçe() {
		LandingPage lp=new LandingPage(driver);
		Select SelectTur=new Select(lp.getlanguages());
		SelectTur.selectByValue("tr");
		Assert.assertEquals(lp.getHotels().getText(), "Oteller");
	}
	  
	@AfterTest
	public void CloseDriver() {
		driver.quit();
	}
	
	
}
