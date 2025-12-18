package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class StorePage {
    private WebDriver driver;
    private WebDriverWait wait;
    public By searchInput = By.id("woocommerce-product-search-field-0");
    public By searchButton = By.cssSelector("button[type='submit']");
    public By productTittleContainer = By.cssSelector(".ast-loop-product__link");
    public By productNotFound = By.cssSelector(".woocommerce-no-products-found");
    public By sliderSelector = By.cssSelector(".ui-slider-handle");
    public By maxPrice = By.cssSelector(".ui-slider-handle:nth-child(3)");
    public By filterButton = By.cssSelector("button[type='submit']");

    public StorePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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

    public ProductDetailsPage clickProduct(){
        driver.findElement(By.className("woocommerce-loop-product__title")).click();
        return new ProductDetailsPage (driver);
    }

    public void filterByPriceRange(int start, int end){

        List<WebElement> slider = driver.findElements(sliderSelector);
        while(Integer.parseInt(driver.findElement(By.className("from")).getText().substring(1)) < start){
            slider.getFirst().sendKeys(Keys.ARROW_RIGHT);
        }
        while(Integer.parseInt(driver.findElement(By.className("to")).getText().substring(1)) > end){
            slider.get(1).sendKeys(Keys.ARROW_LEFT);
        }
        driver.findElement(filterButton).click();
//        List<WebElement> storeListElement = driver.findElements(storeListPrice);
//        List<WebElement> storeDel = driver.findElements(By.cssSelector("del bdi"));
//        List<WebElement> updatedList = storeListElement.stream().filter(val -> !storeDel.contains(val)).toList();
//        return updatedList.stream().anyMatch(val-> (int)Double.parseDouble(val.getText().substring(1)) >= startingPrice && (int)Double.parseDouble(val.getText().substring(1)) <= endingPrice);
    }


    }






