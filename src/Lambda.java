import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {

    /**
     * Function to get max value.
     *
     * @return lambda expression.
     */
    public static BiFunction<Double, Double, Double> getMax() {
        // TODO replace null with lambda expression
        return (a, b) -> a > b ? a : b;
    }

    /**
     * Function to get square root.
     *
     * @return lambda expression.
     */
    public static Function<Double, Double> getSqrt() {
        // TODO replace null with method reference
        return Math::sqrt;
    }
}