package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class main {
    @Test(priority = 0)
    public void ensureValidLogin() {

        WebDriver driver2 = new FirefoxDriver();
        driver2.manage().window().maximize();
        driver2.get("https://the-internet.herokuapp.com/");

        WebElement FormAuthentication2 = driver2.findElement(By.linkText("Form Authentication"));
        FormAuthentication2.click();

        WebElement username2 = driver2.findElement(By.id("username"));
        username2.sendKeys("tomsmith");

        WebElement password2 = driver2.findElement(By.id("password"));
        password2.sendKeys("SuperSecretPassword!");

        WebElement loginButton2 = driver2.findElement(By.xpath("//i[contains(text(),'Login')]"));
        loginButton2.click();

        String expectedSuccessMessage = "You logged into a secure area!";
        String actualSuccessMessage = driver2.findElement(By.id("flash")).getText();

        if (actualSuccessMessage.contains(expectedSuccessMessage)) {
            System.out.println("Success message matched" + expectedSuccessMessage);
        } else {
            System.out.println("Success Message Not Matched Of " + actualSuccessMessage);
        }

        driver2.quit();
    }
    @Test(priority = 1)
    public void ensureValidUserLogin() {

        WebDriver driver2 = new FirefoxDriver();
        driver2.manage().window().maximize();
        driver2.get("https://the-internet.herokuapp.com/");

        WebElement FormAuthentication2 = driver2.findElement(By.linkText("Form Authentication"));
        FormAuthentication2.click();

        WebElement username2 = driver2.findElement(By.id("username"));
        username2.sendKeys("tomsmith");

        WebElement password2 = driver2.findElement(By.id("password"));
        password2.sendKeys("Invalid password");

        WebElement loginButton2 = driver2.findElement(By.xpath("//i[contains(text(),'Login')]"));
        loginButton2.click();

        String expectedFailedMessage = "Your Password is invalid!";
        String actualFailedMessage = driver2.findElement(By.id("flash")).getText();

        if (actualFailedMessage.contains(expectedFailedMessage)) {
            System.out.println("Failed Message Matched Of " + expectedFailedMessage);
        } else {
            System.out.println("Failed Message Not Matched Of " + actualFailedMessage);
        }

        driver2.quit();
    }

    @Test(priority = 2)
    public void ensureValidPasswordLogin() {

        WebDriver driver2 = new FirefoxDriver();
        driver2.manage().window().maximize();
        driver2.get("https://the-internet.herokuapp.com/");

        WebElement FormAuthentication2 = driver2.findElement(By.linkText("Form Authentication"));
        FormAuthentication2.click();

        WebElement username2 = driver2.findElement(By.id("username"));
        username2.sendKeys("Invalid Username");

        WebElement password2 = driver2.findElement(By.id("password"));
        password2.sendKeys("SuperSecretPassword!");

        WebElement loginButton2 = driver2.findElement(By.xpath("//i[contains(text(),'Login')]"));
        loginButton2.click();

        String expectedFailedMessage = "Your Password is invalid!";
        String actualFailedMessage = driver2.findElement(By.id("flash")).getText();

        if (actualFailedMessage.contains(expectedFailedMessage)) {
            System.out.println("Failed Message Matched Of " + expectedFailedMessage);
        } else {
            System.out.println("Failed Message Not Matched Of " + actualFailedMessage);
        }

        driver2.quit();
    }
}
