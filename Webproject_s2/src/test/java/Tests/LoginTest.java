package Tests;

import BaseTest.BaseTestClass;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTestClass {

    @Test
    public void ensureLoginSuccess (){
     loginPage = homePage.clickOnFormAuthenticate();
     loginPage.setUsername("tomsmith");
     loginPage.setPassword("SuperSecretPassword!");
     secureAreaPage = loginPage.clickOnLoginButton();
    // Assert.assertEquals(secureAreaPage.getActualMessage(), secureAreaPage.getExpectedSuccessMessage());
     Assert.assertTrue(secureAreaPage.getActualMessage().contains(secureAreaPage.getExpectedSuccessMessage()));
    }

    @Test
    public void ensureLoginFailed(){

    }
}