package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
   private WebDriver driver;
   public By loginnameField = By.id("username");
   public By loginpasswordField = By.id("password");
   public By loginButton = By.cssSelector("button[name='login']");
   public By logoutButton = By.partialLinkText("Logout");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setLoginUsername(){
        driver.findElement(loginnameField).sendKeys("afa");
    }
    public void setLoginPassword(){
        driver.findElement(loginpasswordField).sendKeys("123");
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
    public String confirm(){
        return driver.findElement(By.partialLinkText("Log out")).getText();
    }
    public void clickLogoutButton(){
        driver.findElement(logoutButton).click();
    }
}
