import java.util.LinkedList;
import java.util.Queue;

public class ReshapeTheMatrix {
    public static int[][] matrixReshape1(int[][] nums, int r, int c) {
        if (nums == null) {
            return nums;
        }
        int[][] result = new int[r][c];
        if (nums.length * nums[0].length != r * c) {
            return nums;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                result[count / c][count % c] = nums[i][j];
                count++;
            }
        }
        return result;
    }

    public static int[][] matrixReshape2(int[][] nums, int r, int c) {
        if (nums == null) {
            return nums;
        }
        if (nums.length * nums[0].length != r * c) {
            return nums;
        }
        int count = 0;
        int[][] result = new int[r][c];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                queue.add(nums[i][j]);
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = queue.poll();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        int[][] ans = matrixReshape1(a, r, c);
        System.out.println(ans);
    }
}
