package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
    public WebDriver driver;
    public Properties prop;

    public WebDriver initializeDriver() throws IOException {


        prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/admin/IdeaProjects/A_ostrovok/src/main/java/resources/data.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");
        System.out.print(browserName);

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/admin/IdeaProjects/A_ostrovok/src/main/java/resources/drivers/chromedriver");
            driver = new ChromeDriver();
        }
        if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "/Users/admin/IdeaProjects/A_ostrovok/src/main/java/resources/drivers/geckodriver");
            driver = new FirefoxDriver();

        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}