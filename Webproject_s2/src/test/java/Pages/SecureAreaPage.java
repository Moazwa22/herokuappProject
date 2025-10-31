package Pages;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage{

    WebDriver driver;

    public SecureAreaPage (WebDriver driver){
        this.driver = driver;
    }

    By successMessageLocator = By.id("flash");
    String expectedSuccessMessage = "You logged into a secure area!";
    By pageTitle = By.tagName("h2");
    String expectedPageTitle = "Secure Area";
    By logoutButtonLocator = By.xpath("//i[@class ='icon-2x icon-signout']");

    public String getActualMessage(){
        return driver.findElement(successMessageLocator).getText();
    }
    public String getExpectedSuccessMessage(){
        return expectedSuccessMessage;
    }
    public String getActualPageTitle (){
        return driver.findElement(pageTitle).getText();
    }
    public String getExpectedPageTitle(){
        return expectedPageTitle;
    }

    public LoginPage clickLogoutButton(){
        driver.findElement(logoutButtonLocator).click();
        return new LoginPage(driver);
    }


}