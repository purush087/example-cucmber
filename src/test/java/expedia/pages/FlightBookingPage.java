package expedia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FlightBookingPage extends BasePage {

    WebDriver driver;

    public FlightBookingPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[id*='flight-type-one-way-label']")
    private WebElement selectOneWay;

    @FindBy(css = "input[type='text'][id*='flight-origin']")
    private WebElement originAt;

    @FindBy(css = "input[type='text'][id*='flight-destination']")
    private WebElement destination;

    @FindBy(css = ".results-item .multiLineDisplay")
    private WebElement suggestions;

    @FindBy(css = "[id*='flight-departing-single']")
    private WebElement departDate;

    @FindBy(css = "[id*='flight-adults']")
    private WebElement adultSeats;

    @FindBy(css = "[id*='flight-children']")
    private WebElement childSeats;

    @FindBy(xpath = "//*[contains(@id,'gcw-flights-form')]/div[8]/label/button")
    private WebElement searchForFlights;

    public void selectsOneWay() {
        clickOnButton(selectOneWay);
    }

    public void enterOriginAs(String originCity) {
        sendkeys(originAt, originCity);
    }

    public void enterDestinationAs(String destinationCity) {
        sendkeys(destination, destinationCity);
    }

    public void selectFirstOptionInSuggestions() {
        clickOnButton(suggestions);
    }

    public void selectDepartDate() {
        departDate.sendKeys(getOneDayLaterDate());
    }

    public void selectAdultSeats(int seats) {
        if (seats < 7) {
            Select dropdown = new Select(adultSeats);
            dropdown.selectByIndex(seats - 1);
        }
    }

    public void selectChildSeats(int seats) {
        if (seats < 7) {
            Select dropdown = new Select(childSeats);
            dropdown.selectByIndex(seats - 1);
        }
    }

    public void searchFlights() {
        clickOnButton(searchForFlights);
    }
}
