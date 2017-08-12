public class MoveZeros {
    public static void moveZeros(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,0,3};
        moveZeros(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
