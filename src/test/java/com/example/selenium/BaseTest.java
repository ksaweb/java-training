package com.example.selenium;

import com.example.selenium.steps.UserSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    protected WebDriver driver;
    protected UserSteps userSteps;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        //добавив такі налаштування щоб пофіксити SessionNotCreatedException, можливо виникає через те що в мене М1 мак
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");

        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
        driver = new ChromeDriver(options);
        userSteps = new UserSteps(driver);
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
