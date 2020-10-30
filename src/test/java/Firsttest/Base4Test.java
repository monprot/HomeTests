package Firsttest;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Base4Test extends BaseTest {
    @Parameters({"iDoNotKnow", "iKnow"})

    @Epic("Простые тесты")
    @Feature("Первые шаги")
    @Story("Работа с параметрами")
    @Test
    public void test4Meth(String a, String b) {
        System.out.println(a + "\n" + b);
    }
}
