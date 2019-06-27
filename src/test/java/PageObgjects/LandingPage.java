package PageObgjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;


public class LandingPage extends base {

    public WebDriver driver;

    By Destination = By.xpath("//input[@placeholder='City, hotel, or airport']");
    By CheckIn = By.xpath("//*[contains(text(),'Check-in')]");
    By CheckOut = By.xpath("//*[contains(text(),'Check-out')]");
    By Room = By.xpath("//*[@class='zen-guestsbutton-button-rooms']");
    By AddRoom = By.xpath("//*[contains(text(),'Add room')]");
    By Done = By.xpath("//*[contains(text(),'Done')]");
    By Search = By.xpath("//*[contains(text(),'Search')]");
    By DateIn = By.xpath("//*[@class='zen-calendar']//*[contains(text(),'11')]");
    By DateOut = By.xpath("//*[@class='zen-calendar']//*[contains(text(),'12')]");
    By Hotels = By.xpath("(//*[@class='zen-tab-title'])[1]");
    By HotelsResult = By.xpath("//a[@class='zenbreadcrumbs-item-link zenbreadcrumbs-item-link-disabled disabled']");
    By Flights = By.xpath("//a[@class='zen-tab plane-icon']");
    By DepartureCity = By.xpath("//input[@placeholder='London']");
    By DestinationCity = By.xpath("//input[@placeholder='New York']");
    By DepartDate = By.xpath("//*[contains(@class,'date-is-from')]");
    By ReturnDate = By.xpath("//*[contains(@class,'date-is-to')]");
    By Passengers = By.xpath("//*[contains(@class,'flighttype')]");
    By SelectClass = By.xpath("//div[@class='zen-passengers-rooms-field']//select[@class='zen-select-native']");
    By SelectAdults = By.xpath("//div[@class='zen-passengers-room-adults']//select[@class='zen-select-native']");
    By ResultFlights = By.xpath("//*[contains(@class,'container')]/div[9]/div[1]");
    By languages = By.xpath("//div[@class='zen-header-language-wrapper']//select[@class='zen-header-select-list']");
    By PerconalAccount = By.xpath("//div[@class='zen-header-account-button']");
    By Email = By.xpath("//*[@class='zen-authpane-signin-field zen-authpane-signin-field-email']//*[@class='zenforminput-inner']//*[@name='email']");
    By Password = By.xpath("//div[@class='zen-authpane-signin-field zen-authpane-signin-field-password']//label[@class='zenforminput-inner']//*[@name='pass']");
    By LogInButton = By.xpath("//*[contains(@class,'zen-authpane-signin-submit-button button-view-primary button-size-s')]");
    By ErrorMessage = By.xpath("//*[contains(@class,'error-message')]");


    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDisrination() {
        return driver.findElement(Destination);
    }

    public WebElement getCheckIn() {
        return driver.findElement(CheckIn);
    }

    public WebElement getCheckOut() {
        return driver.findElement(CheckOut);
    }

    public WebElement getRoom() {
        return driver.findElement(Room);
    }

    public WebElement getAddRoom() {
        return driver.findElement(AddRoom);
    }

    public WebElement getDone() {
        return driver.findElement(Done);
    }

    public WebElement getSearch() {
        return driver.findElement(Search);
    }

    public WebElement getDateIn() {
        return driver.findElement(DateIn);
    }

    public WebElement getDateOut() {
        return driver.findElement(DateOut);
    }

    public WebElement getResult() {
        return driver.findElement(HotelsResult);
    }

    public WebElement getFlights() {
        return driver.findElement(Flights);
    }

    public WebElement getDepartureCity() {
        return driver.findElement(DepartureCity);
    }

    public WebElement getDestinationCity() {
        return driver.findElement(DestinationCity);
    }

    public WebElement getDepartDate() {
        return driver.findElement(DepartDate);
    }

    public WebElement getReturnDate() {
        return driver.findElement(ReturnDate);

    }

    public WebElement getPassengers() {
        return driver.findElement(Passengers);
    }

    public WebElement getSelectClass() {
        return driver.findElement(SelectClass);
    }

    public WebElement getSelectAdults() {
        return driver.findElement(SelectAdults);
    }

    public WebElement getResultFlights() {
        return driver.findElement(ResultFlights);
    }

    public WebElement getlanguages() {
        return driver.findElement(languages);
    }

    public WebElement getHotels() {
        return driver.findElement(Hotels);
    }

    public void clickOnAccount() throws InterruptedException {
        driver.findElement(PerconalAccount).click();
        Thread.sleep(1000);

    }

    public WebElement getEmail() {
        return driver.findElement(Email);
    }

    public WebElement getPassword() {
        return driver.findElement(Password);
    }

    public WebElement getLogIn() {
        return driver.findElement(LogInButton);
    }

    public WebElement getErrorMessage() {
        return driver.findElement(ErrorMessage);
    }

}
     
