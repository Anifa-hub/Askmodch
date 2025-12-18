package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProceedCheckOutPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By firstName = By.id("billing_first_name");
    private By lastName = By.id("billing_last_name");
    private By address = By.id("billing_address_1");
    private By country = By.id("billing_country");
    private By streetAddress = By.id("billing_address_1");
    private By streetAddress_2 = By.id("billing_address_2");
    private By town = By.id("billing_city");
    private By state = By.id("billing_state");
    private By zipCode = By.id("billing_postcode");
    private By emailAddress = By.id("billing_email");
    private By phone = By.id("billing_phone");
    //private By placeOrderBtn = By.id("place_order");
   // public By placeOrder = By.id("place_order");

    public ProceedCheckOutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    public void billingDetails(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName))
                .sendKeys("Anifa");
        driver.findElement(lastName).sendKeys("Bazu");
        driver.findElement(address).sendKeys("123 Test Street");
        new Select(driver.findElement(country)).selectByVisibleText("Rwanda");

        driver.findElement(streetAddress).sendKeys("Kigali");
        driver.findElement(streetAddress_2).sendKeys("Appointment");
        driver.findElement(town).sendKeys("Kigali");
        driver.findElement(state).sendKeys("Rwanda");
        driver.findElement(zipCode).sendKeys("00000");
        driver.findElement(phone).sendKeys("0780000000");
        driver.findElement(emailAddress).sendKeys("chris@gmail.com");
           // setPlaceOrder();
    }

    public void setPlaceOrder(){
        wait.until(ExpectedConditions.elementToBeClickable(By.id("place_order"))).click();
    }


}
