package Firsttest;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Base3Test extends BaseTest{
    int a=10;
    @Epic("Простые тесты")
    @Feature("Первые шаги")
    @Story("10>10")
    @Test
    public void MethTest() {
        Assertion b = new Assertion();
        System.out.println("Начало Теста");
        boolean result = a>10;
        System.out.println(result);
        b.assertTrue(result);
        System.out.println("Конец теста");
    }
}
