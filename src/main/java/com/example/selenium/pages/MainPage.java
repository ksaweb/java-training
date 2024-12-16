package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage extends BasePage {

    @FindBy(tagName = "h2")
    private WebElement titleElement;

    @FindBy(linkText = "Logout")
    private WebElement logoutButton;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return titleElement.getText();
    }

    public LoginPage clickLogout() {
        logoutButton.click();
        return new LoginPage(driver);
    }
}
