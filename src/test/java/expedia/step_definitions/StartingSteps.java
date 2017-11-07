package expedia.step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class StartingSteps {
    WebDriver driver;
    @Before
    public void setup(){
        driver = new DriverFactory().getDriver();
    }

    @After
    public void afterScenario(){
        new DriverFactory().destroyDriver();
    }

    @Given("User is on Landing Page")
    public void user_is_on_Landing_Page() throws Throwable{
        driver.get("https://www.expedia.co.in");
        driver.manage().window().maximize();
    }
}
