package expedia.step_definitions;

import cucumber.api.java.en.When;
import expedia.pageObjects.HomePage;

public class HomeTest extends DriverFactory{


    @When("User chooses to travel by flight")
    public void user_chooses_to_travel_by_flight() throws Throwable{
        new HomePage(driver).checkIfHomeIsSelected();
        new HomePage(driver).selectsToTravelByFlight();
    }
}
