import java.util.Arrays;
import java.util.HashSet;

public class DistributeCandies {
    public static int distributeCandies1(int[] candies) {
        HashSet<Integer> hash = new HashSet<>();
        for (int candy : candies) {
            hash.add(candy);
        }
        return Math.min(hash.size(), candies.length / 2);
    }

    public static int distributeCandies2(int[] candies) {
        Arrays.sort(candies);
        int count = 1;
        for (int i = 1; i < candies.length && count < candies.length; i++) {
            if (candies[i] > candies[i - 1]) {
                count++;
            }
        }
        return count;
    }
}
