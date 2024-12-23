package example;

import org.testng.annotations.Test;

public class TestClassThree {

    @Test(priority = 3)
    public void testMethod1() {
        System.out.println("Тестовий метод 1 з пріоритетом 3");
    }

    @Test(priority = 2)
    public void testMethod2() {
        System.out.println("Тестовий метод 2 з пріоритетом 2");
    }

    @Test(priority = 1)
    public void testMethod3() {
        System.out.println("Тестовий метод 3 з пріоритетом 1");
    }
}
