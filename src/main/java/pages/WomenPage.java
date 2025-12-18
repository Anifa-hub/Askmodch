package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.time.Duration;
import java.util.List;

public class WomenPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public By womenCategoryProducts = By.cssSelector(".ast-woo-product-category");



    public WomenPage(WebDriver driver){
        this.driver = driver;

    }
    public boolean verifyWomenCategoryProducts(){
        List<WebElement> products = driver.findElements(womenCategoryProducts);
        for (WebElement product : products){
            if(product.getText().contains("Men")){
                return false;

            }
        }
        return true;
    }



}
