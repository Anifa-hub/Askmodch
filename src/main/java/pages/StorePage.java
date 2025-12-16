package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StorePage {
    private WebDriver driver;
    public By searchInput = By.id("woocommerce-product-search-field-0");
    public By searchButton = By.cssSelector("button[type='submit']");
    public By productTittleContainer = By.cssSelector(".ast-loop-product__link");
    public By productNotFound = By.cssSelector(".woocommerce-no-products-found");

    public StorePage(WebDriver driver) {
        this.driver = driver;
    }
    public void searchProduct(String productName){
        driver.findElement(searchInput).sendKeys(productName);
    }
    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }
    public String isProductDisplayed(){
       return driver.findElement(productNotFound).getText();
    }
    public boolean verifySearchResultsAreRelevant(){
        List<WebElement> products = driver.findElements(productTittleContainer);
        String lowerSearchTerm = "jeans".toLowerCase();

        if (products.isEmpty()) {
            return false;
        }

        for (WebElement linkElement : products) {
            String linkText = linkElement.getText();
            // If any title does not contain the search term, verification fails
            if (!linkText.toLowerCase().contains(lowerSearchTerm)) {
                return false;
            }
        }
        return true;
    }

    }



