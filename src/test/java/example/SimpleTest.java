package example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleTest {

    @BeforeMethod
    public void setup() {
        System.out.println("BeforeMethod: налаштування");
    }

    @Test
    public void testMethod() {
        System.out.println("TestMethod: тестовий метод");
    }

    @AfterMethod
    public void teardown() {
        System.out.println("AfterMethod: очищення");
    }
}
