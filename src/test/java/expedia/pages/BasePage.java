package expedia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BasePage {

    protected WebDriver driver;
    private WebDriverWait webDriverWait;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();

    <T> BasePage(WebDriver webDriver) {
        this.driver = webDriver;
        webDriverWait = new WebDriverWait(webDriver,30);
    }

    protected void waitForElementToBeVisible(WebElement element) {
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void waitForElementToBeInvisible(WebElement element) {
        webDriverWait.until(ExpectedConditions.invisibilityOf(element));
    }

    protected void waitForElementsToBeVisible(List<WebElement> elementList) {
        webDriverWait.until(ExpectedConditions.visibilityOfAllElements(elementList));
    }

    protected void waitForElementToBeClickable(WebElement element) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void clickOnButton(WebElement element) {
        waitForElementToBeVisible(element);
        element.click();
    }

    protected void sendkeys(WebElement element,String text){
        waitForElementToBeVisible(element);
        waitForElementToBeClickable(element);
        element.sendKeys(text);
    }

    protected String getCurrentDate(){
        return simpleDateFormat.format(date);
    }

    protected String getOneDayLaterDate(){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, 1);
        date = c.getTime();
        return simpleDateFormat.format(date);
    }
}
