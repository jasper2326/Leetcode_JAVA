import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : magazine.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : ransomNote.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            }
            if (!map.containsKey(c) || map.get(c) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String r = "ab";
        String m = "abb";
        boolean result = canConstruct(r, m);
        System.out.println(result);
    }
}
