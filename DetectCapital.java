public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        return word.equals(word.toLowerCase()) || word.equals(word.toUpperCase()) ||
                Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase());
    }
}
