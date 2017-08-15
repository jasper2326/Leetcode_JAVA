public class MinimumMovesToEqualArrayElements {
    public static int minMoves(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int min = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
        }
        int res = 0;
        for (int num : nums) {
            res += num - min;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int result = minMoves(nums);
        System.out.println(result);
    }
}
