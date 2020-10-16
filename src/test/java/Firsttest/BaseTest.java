package Firsttest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    @BeforeTest
    public void Method1Test() {
        System.out.println("Действие перед тестом");
    }

    @AfterTest
    public void Method2Test() {
        System.out.println("Действие после теста\n");
    }

    @BeforeMethod
    public void Method3Test() {
        System.out.println("Действие перед методом");
    }

    @AfterMethod
    public void Method4Test() {
        System.out.println("Действие после метода");
    }

}

