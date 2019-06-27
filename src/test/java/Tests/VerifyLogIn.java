package Tests;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObgjects.LandingPage;
import junit.framework.Assert;
import resources.base;

public class VerifyLogIn extends base{
		 
	 

 @BeforeTest
  public void initialize() throws IOException {
	 driver=initializeDriver();
	 driver.get(prop.getProperty("url"));
	
	    } 
 
 
 @Test
 public void ErrorMassege() throws InterruptedException {
 	String InvalidPassword= prop.getProperty("invalidPassword");
	 String InvalidEmail= prop.getProperty("invalidEmail");
	 String ErrorMessage =prop.getProperty("errorMessage");

	 LandingPage lp=new LandingPage(driver);
	 lp.clickOnAccount();
	 lp.getEmail().sendKeys(InvalidEmail);
	 lp.getPassword().sendKeys(InvalidPassword);
	 lp.getLogIn().click();
	 Assert.assertEquals(lp.getErrorMessage().getText(), ErrorMessage);

 }
	@AfterTest
	public void DriverClose() {
		driver.quit();
	}
	
	
}
