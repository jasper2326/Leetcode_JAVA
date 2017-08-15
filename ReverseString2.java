public class ReverseString2 {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int index = 0;
        while (index < s.length()) {
            int j = Math.min(index + k - 1, s.length() - 1);
            swap(arr, index, j);
            index += k * 2;
        }
        return String.valueOf(arr);
    }

    private void swap(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }
}
