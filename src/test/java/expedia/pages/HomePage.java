package expedia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    WebDriver driver;
    Boolean home;

    @FindBy(id = "primary-header-home")
    private WebElement homeNav;

    @FindBy(css = "[id*=tab-flight-tab]")
    private WebElement flightBtn;


    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void checkIfHomeIsSelected(){
        home = homeNav.isSelected();
        if(home == false)
            homeNav.click();
    }

    public void selectsToTravelByFlight(){
        clickOnButton(flightBtn);
    }
}