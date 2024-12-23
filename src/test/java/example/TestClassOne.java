package example;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;

public class TestClassOne {

    @BeforeGroups(groups = {"group1"})
    public void beforeGroup1() {
        System.out.println("Перед групою 1");
    }

    @BeforeGroups(groups = {"group2"})
    public void beforeGroup2() {
        System.out.println("Перед групою 2");
    }

    @AfterGroups(groups = {"group1"})
    public void afterGroup1() {
        System.out.println("Після групи 1");
    }

    @AfterGroups(groups = {"group2"}, enabled = false) // Виняток з виконання
    public void afterGroup2() {
        System.out.println("Після групи 2 (не виконується)");
    }

    @Test(groups = {"group1"})
    public void testMethod1() {
        System.out.println("Тестовий метод 1 з групи group1");
    }

    @Test(groups = {"group2"})
    public void testMethod2() {
        System.out.println("Тестовий метод 2 з групи group2");
    }
}
