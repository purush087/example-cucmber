package expedia.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import expedia.pages.FlightBookingPage;

public class FlightBookingTest extends BaseSteps{
    
    FlightBookingPage flightBookingPage = new FlightBookingPage(driver);

    @And("user enters journey details")
    public void user_enters_journey_details() throws Throwable  {
        flightBookingPage.selectsOneWay();
        flightBookingPage.enterOriginAs("Bangalore");
        flightBookingPage.selectFirstOptionInSuggestions();
        flightBookingPage.enterDestinationAs("Hyderabad");
        flightBookingPage.selectFirstOptionInSuggestions();
        flightBookingPage.selectDepartDate();
        flightBookingPage.selectAdultSeats(2);
        flightBookingPage.selectChildSeats(1);

    }

    @Then("user searches for flights")
    public void user_searches_for_flights() throws Throwable{
        flightBookingPage.searchFlights();
    }
}
