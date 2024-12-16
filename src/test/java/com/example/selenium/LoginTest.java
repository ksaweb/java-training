package com.example.selenium;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import com.example.selenium.pages.MainPage;



public class LoginTest extends BaseTest {

    @Test
    public void login() {
        userSteps.login("tomsmith", "SuperSecretPassword!");

        MainPage mainPage = new MainPage(driver);
        assertEquals(mainPage.getTitle(), "Secure Area", "Login failed");

        userSteps.logout();
    }
}
