package expedia.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import expedia.pages.HotelBookingPage;

public class HotelBooking extends BaseSteps{

    HotelBookingPage hotelBookingPage = new HotelBookingPage(driver);

    @When("^User chooses to book hotel$")
    public void userChoosesToBookHotel() throws Throwable {
        hotelBookingPage.bookHotelIn("Banglore");
        hotelBookingPage.bookHotelOnDates();
        hotelBookingPage.searchHotels();
    }
}
