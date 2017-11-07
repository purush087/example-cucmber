package expedia.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import util.WaitFor;

import java.util.List;

public class FlightBookingPage {
    WebDriver driver;

    public FlightBookingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "type-one-way")
    private WebElement selectOneWay;

    @FindBy(id = "flight-origin")
    private WebElement originAt;

    @FindBy(id = "flight-destination")
    private WebElement destination;

    @FindBys({@FindBy(className = "main-suggestion")})
    private WebElement suggestions;

    @FindBy(id = "flight-departing")
    private WebElement departDate;

    @FindBy(id = "flight-adults")
    private WebElement adultSeats;

    @FindBy(id = "flight-children")
    private WebElement childSeats;

    @FindBy(id = "search-button")
    private WebElement searchForFlights;

    public void selectsOneWay(){
        new WaitFor().waitForElementToBeClickable(selectOneWay,driver);
        selectOneWay.click();
    }

    public void enterOriginAs(String originCity){
        originAt.sendKeys(originCity);
    }
    public void enterDestinationAs(String destinationCity){
        destination.sendKeys(destinationCity);
    }

    public void selectFirstOptionInSuggestions(){
        new WaitFor().waitForElementToBeClickable(suggestions,driver);
        List<WebElement> options = suggestions.findElements(By.className("multiLineDisplay"));
        options.get(0).click();

    }

    public void selectDepartDate(){
        departDate.sendKeys();
    }

    public void selectAdultSeats(int seats){
        if(seats < 7) {
            Select dropdown = new Select(adultSeats);
            dropdown.selectByIndex(seats - 1);
        }
    }

    public void selectChildSeats(int seats){
        if(seats < 7){
            Select dropdown = new Select(childSeats);
            dropdown.selectByIndex(seats - 1);
        }
    }

    public SearchResultsPage searchFlights(){
        searchForFlights.click();
        return new SearchResultsPage(driver);
    }
}
