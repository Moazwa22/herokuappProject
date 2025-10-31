package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage{
    WebDriver driver;


    public HomePage (WebDriver driver){
        this.driver = driver;
    }

   // WebElement FormAuthentication = driver.findElement (By.linkText("Form Authentication"));

    By FormAuthenticator = By.linkText("Form Authentication");
    public LoginPage clickOnFormAuthenticate() {
        driver.findElement(FormAuthenticator).click();
        return new LoginPage(driver);
    }
}

