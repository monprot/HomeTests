package Firsttest;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Base5Test extends BaseTest{
    /**
     * //Передаем параметры внутрь теста
     *
     */
    @DataProvider(name = "SetEnvironment", parallel = true)
    public Object[][] getData() {
        Object[][] browserProperty = new Object[][]{
                {"chrome", "70.0"},
                {"chrome", "71.0"},
                {"chrome", "72.0"},
                {"chrome", "73.0"},
                {"chrome", "74.0"},
                {"chrome", "75.0"}
        };

        return browserProperty;
    }
    @Epic("Простые тесты")
    @Feature("Первые шаги")
    @Story("Массив параметров")
    @Test(dataProvider = "SetEnvironment")
    public void Meth5Test(String a, String b) {
        System.out.println(a);
        System.out.println(b);
    }
}
