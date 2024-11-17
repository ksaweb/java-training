import java.util.Arrays;
public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        // TODO replace return with your code
        return Arrays.stream(numbers).filter(n -> n % 2 == 0).map(n -> n * n).sum();
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        // TODO replace return with your code
        return Arrays.stream(numbers).filter(n -> n % 2 != 0).sorted().toArray();
    }
}