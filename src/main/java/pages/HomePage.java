package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    public WebDriver driver;
   // public  By productConfirmation = By.partialLinkText("View cart");
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

    public StorePage clickStore(){
        clickLinks("Store");
        return new StorePage(driver);
    }
    public MenPage clickMen(){
        clickLinks("Men");
        return new MenPage (driver);
    }
    public WomenPage clickWomen(){
        clickLinks("Women");
        return new WomenPage(driver);
    }

    public void clickLinks(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
