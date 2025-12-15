package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;
    public By usernameField = By.id("reg_username");
    public By emailField = By.id("reg_email");
    public By passwordField = By.id("reg_password");
    public By RegisterField = By.cssSelector("button[name='register']");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickRegister (){
        driver.findElement(RegisterField).click();
    }
    public String assertion(){
       return driver.findElement(By.partialLinkText("Log out")).getText();
    }
}
