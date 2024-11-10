import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleExceptionTest {

    /**
     * Test data for positive test.
     *
     * @return test data array
     */
    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {2, 2, 4},
                {2, 3, 6},
                {3, 4, 12},
                {10, 10, 100}
        };
    }

    /**
     * Test data for exception test.
     *
     * @return test data array
     */
    @DataProvider(name = "negativeData")
    public static Object[][] negativeData() {
        return new Object[][]{
                {-2, 2},
                {2, -2},
                {-1, -1},
                {-3, 0}
        };
    }

    @Test(dataProvider = "data")
    public void testRectangleArea(int a, int b, int c) {
        try {
            int result = ExampleException.rectangleArea(a, b);
            assertEquals(result, c, "Area result calculation is incorrect for valid inputs");
        } catch (IllegalArgumentException e) {
            fail("Exception should not be thrown for valid inputs");
        }
    }


    @Test(dataProvider = "negativeData")
    public void testRectangleAreaNegative(int a, int b) {
        try {
            ExampleException.rectangleArea(a, b);
            fail("Exception should be thrown for negative values.");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Input values cannot be negative!", "The exception message is incorrect.");
        }
    }
}