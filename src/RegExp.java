import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        String ipPattern =
                "\\b(?:[0-1]?\\d{1,2}|2[0-4][0-9]|25[0-5])\\." +
                        "(?:[0-1]?\\d{1,2}|2[0-4][0-9]|25[0-5])\\." +
                        "(?:[0-1]?\\d{1,2}|2[0-4][0-9]|25[0-5])\\." +
                        "(?:[0-1]?\\d{1,2}|2[0-4][0-9]|25[0-5])\\b";

        Pattern pattern = Pattern.compile(ipPattern);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group(); // Return matched IP
        }
        return "";
    }
}