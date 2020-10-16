package Firsttest;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Base2Test extends BaseTest {
    int a=10;


    @Test
    public void MethTest() {
        Assertion b = new Assertion();
        System.out.println("Начало Теста");
        boolean result = a>=10;
        System.out.println(result);
        b.assertTrue(result);
        System.out.println("Конец теста");
    }
}
