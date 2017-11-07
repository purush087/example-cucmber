package expedia.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    protected static WebDriver driver;

    public DriverFactory(){
        initialize();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void initialize(){
        if(driver == null){
            createNewDriverInstance();
        }
    }

    public void createNewDriverInstance(){
        System.setProperty("webdriver.chrome.driver", "lib/chromeDriver");
        driver = new ChromeDriver();
    }

    public void destroyDriver(){
        driver.quit();
        driver = null;
    }
}
