import java.util.HashSet;
import java.util.Set;
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        Set<String> set1 = new HashSet<>();
        Set<String> commonElements = new HashSet<>();

        for (String s : array1) {
            set1.add(s);
        }

        for (String s : array2) {
            if (set1.contains(s)) {
                commonElements.add(s);
            }
        }

        return commonElements.toArray(new String[0]);
    }
}