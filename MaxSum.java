//Find a contiguous subarray which has the largest sum.

public class MaxSum {
    public static resultType maxSubArray(int[] nums) {
        // write your code
        if (nums == null || nums.length == 0) {
            return new resultType(0, 0, Integer.MIN_VALUE);
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int minSum = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (max < sum - minSum) {
                start = i - 1;
                max = sum - minSum;
            }
            if (minSum > sum) {
                end = i - 1;
                minSum = sum;
            }
        }
        return new resultType(start, end, max);
    }

    public static void main(String[] args) {
        int[] A = {-10,1,2,3,-10,5,8,-100};
        resultType a = maxSubArray(A);
        System.out.println(a.start);
        System.out.println(a.end);
        System.out.println(a.max);
    }

    public static class resultType {
        int start;
        int end;
        int max;
        public resultType(int start, int end, int max) {
            this.start = start;
            this.end = end;
            this.max = max;
        }
    }
}
