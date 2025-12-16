package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public RegisterPage clickAccount (){
        clickLinks("Account");
        return new RegisterPage(driver);
    }

    public LoginPage clickAccountTOLogin (){
        clickLinks("Account");
        return new LoginPage(driver);
    }
    public void ScrollTobutton(){
        JavascriptExecutor js = (JavascriptExecutor)  driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    public boolean addToCart(int productId){
        List<WebElement> elements = driver.findElements(By.cssSelector(".astra-shop-summary-wrap a.button"));
        elements.get(productId).click();
        By productConfirmation = By.partialLinkText("View cart");
        List<WebElement> confirmationElements = driver.findElements(productConfirmation);
        if(!confirmationElements.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
    public StorePage clickStore(){
        clickLinks("Store");
        return new StorePage(driver);
    }

    public void clickLinks(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
