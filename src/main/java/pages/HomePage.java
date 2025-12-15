package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

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
    public void clickLinks(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
