package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewCartPage {
    private WebDriver driver;
    public By proceedCheckOut = By.cssSelector("[class='checkout-button button alt wc-forward']");

    public ViewCartPage(WebDriver driver) {
        this.driver = driver;
    }
    public ProceedCheckOutPage clickProceedCheckOut(){
        driver.findElement(proceedCheckOut).click();
        return new ProceedCheckOutPage(driver);
    }
}
