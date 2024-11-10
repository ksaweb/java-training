public class ExampleException {

    public static int rectangleArea(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Input values cannot be negative!");
        }
        return a * b;
    }
}