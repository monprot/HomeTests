package Firsttest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Base4Test extends BaseTest {
    @Parameters({"iDoNotKnow", "iKnow"})

    @Test
    public void test4Meth(String a, String b) {
        System.out.println(a + "\n" + b);
    }
}
