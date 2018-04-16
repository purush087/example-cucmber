package expedia.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import expedia.pages.HomePage;

public class HomeTest extends BaseSteps{

    HomePage homePage = new HomePage(driver);

    @Given("User is on Landing Page")
    public void user_is_on_Landing_Page() throws Throwable{
        driver.get("https://www.expedia.co.in");
        driver.manage().window().maximize();
    }

    @When("User chooses to travel by flight")
    public void user_chooses_to_travel_by_flight() throws Throwable{
        homePage.checkIfHomeIsSelected();
        homePage.selectsToTravelByFlight();
    }
}
