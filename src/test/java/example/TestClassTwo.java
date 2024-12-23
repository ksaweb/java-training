package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTwo {

    @Test
    @Parameters("param1")
    public void testWithXmlParameter(String param1) {
        System.out.println("Тест з параметром з XML: " + param1);
    }

    @Test(dataProvider = "dataProviderMethod") // Використовуємо правильну назву dataProvider
    public void testWithDataProvider(String param1, String param2) {
        System.out.println("Тест з параметрами з DataProvider: " + param1 + ", " + param2);
    }

    @DataProvider(name = "dataProviderMethod") // Визначаємо dataProvider
    public Object[][] dataProviderMethod() {
        return new Object[][] {
                {"value1", "value2"},
                {"value3", "value4"}
        };
    }
}
