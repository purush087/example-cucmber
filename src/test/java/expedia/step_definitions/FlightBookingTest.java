package expedia.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import expedia.pageObjects.FlightBookingPage;

public class FlightBookingTest extends DriverFactory{

    @And("user enters journey details")
    public void user_enters_journey_details() throws Throwable  {
        new FlightBookingPage(driver).selectsOneWay();
        new FlightBookingPage(driver).enterOriginAs("Bangalore");
        new FlightBookingPage(driver).selectFirstOptionInSuggestions();
        new FlightBookingPage(driver).enterDestinationAs("Hyderabad");
        new FlightBookingPage(driver).selectFirstOptionInSuggestions();
        new FlightBookingPage(driver).selectDepartDate();
        new FlightBookingPage(driver).selectAdultSeats(2);
        new FlightBookingPage(driver).selectChildSeats(2);

    }

    @Then("user searches for flights")
    public void user_searches_for_flights() throws Throwable{
        new FlightBookingPage(driver).searchFlights();
    }
}
