import java.util.HashSet;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashSet<Character> hash = new HashSet<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (hash.contains(c)) {
                hash.remove(c);
                count++;
            } else {
                hash.add(c);
            }
        }

        if (!hash.isEmpty()) {
            return count * 2 + 1;
        } else {
            return count * 2;
        }
    }
}
