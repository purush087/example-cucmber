package expedia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HotelBookingPage extends BasePage{

    @FindBy(css = "input[type='text'][id*='hotel-destination']")
    private WebElement hotelDestination;

    @FindBy(css = ".results .display-group-results li")
    private List<WebElement> suggestionsForCities;

    @FindBy(css = "input[id*='hotel-checkin'][name='startDate']")
    private WebElement hotelCheckInDate;

    @FindBy(css = "input[id*='hotel-checkout'][name='endDate']")
    private WebElement hotelCheckoutDate;

    @FindBy(xpath = "//*[contains(@id,\"gcw-hotel-form\")]/div[9]/label/button")
    private WebElement searchHotelsButton;

    public HotelBookingPage(WebDriver webDriver) {
        super(webDriver);
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    public void bookHotelIn(String city) {
        sendkeys(hotelDestination,city);
        waitForElementsToBeVisible(suggestionsForCities);
        clickOnButton(suggestionsForCities.get(0));
    }

    public void bookHotelOnDates() {
        sendkeys(hotelCheckInDate,getCurrentDate());
        sendkeys(hotelCheckoutDate,getOneDayLaterDate());
    }

    public void searchHotels() {
        clickOnButton(searchHotelsButton);
    }
}
