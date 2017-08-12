import java.util.HashMap;
import java.util.HashSet;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (int)t.charAt(i);
            sum -= (int)s.charAt(i);
        }
        sum += t.charAt(t.length() - 1);
        return (char)sum;
    }
}
