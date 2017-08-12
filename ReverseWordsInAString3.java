public class ReverseWordsInAString3 {
    public static String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            String temp = reverse(word);
            result.append(temp);
            result.append(" ");
        }
        return result.toString().trim();
    }

    public static String reverse(String word) {
        int len = word.length();
        StringBuilder sb = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
}
