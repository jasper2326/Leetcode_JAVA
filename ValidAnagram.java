public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] characters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            characters[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            characters[t.charAt(i) - 'a']--;
            if (characters[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
