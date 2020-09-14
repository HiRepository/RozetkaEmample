package test.java.unit_tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Example_3_unit {

    @Test(dataProvider = "default")
    public void test(String actual, String expected) {
        Example3 example_3_unit = new Example3();
        actual = example_3_unit.reverseName(actual);
        assertEquals(actual, expected);
    }

    @DataProvider(name = "default")
    public Object[][] provider(String actual) {
        return new Object[][]{
                {"Ihor", "rohI"},


        };


    }
}
