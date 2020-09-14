package test.java.unit_tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Example_2_unit {

    Example2 example_2;
    String matrixRows;

    @BeforeMethod
    public void setUp() {
        example_2 = new Example2();
        matrixRows = example_2.getName();
    }


    @Test
    public void checkRowsLength() {
        int expectedRowAmount = 5;
        int actualRowAmount = matrixRows.split("\n").length;
        assertEquals(expectedRowAmount, actualRowAmount);

    }

    @Test
    public void checkRowsNumber() {
        String rows[] = matrixRows.split("\n");
        for (String row : rows) {
            int expectedRowLength = 10;
            int actualRowLength = row.split(" ").length;
            assertEquals(expectedRowLength, actualRowLength);
        }


    }

}
