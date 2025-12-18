package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.webextension.WebExtension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetailsPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public ProductDetailsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    // add and view cart checkout
    public void addToCart(){
        driver.findElement(By.name("add-to-cart")).click();

    }
    public ViewCartPage clickViewCart(){

       wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class='button wc-forward']"))).click();

        return new ViewCartPage(driver);

    }
}
