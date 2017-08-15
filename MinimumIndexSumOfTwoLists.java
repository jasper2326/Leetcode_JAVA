import java.util.ArrayList;
import java.util.HashMap;

public class MinimumIndexSumOfTwoLists {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        ArrayList<String> result = new ArrayList<>();
        int min_sum = Integer.MAX_VALUE;
        int sum;

        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                sum = j + map.get(list2[j]);
                if (sum < min_sum) {
                    result.clear();
                    result.add(list2[j]);
                    min_sum = sum;
                } else if (sum == min_sum) {
                    result.add(list2[j]);
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
