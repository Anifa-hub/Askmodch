package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MenPage {
    private WebDriver driver;
    public By selectField = By.id("product_cat");
    public By menProduct = By.cssSelector(".ast-woo-product-category");

    public MenPage(WebDriver driver){
        this.driver=driver;
    }
    public void selectCategory(){
       new Select(driver.findElement(selectField)).selectByValue("mens-jeans");
    }
    public boolean verifyMenProduct(){
        List<WebElement> products = driver.findElements(menProduct);
        String productCategory = "Women";
        for(WebElement product :products){
            if(product.getText().contains(productCategory)) {
                return false;
            }

        }
        return true;
    }
}
