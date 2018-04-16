package expedia.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private WebDriver driver;

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
}
