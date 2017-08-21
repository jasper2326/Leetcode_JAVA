import java.util.HashMap;

public class PathSum3 {
    public int pathSum1(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return pathSumFrom(root, sum) + pathSum1(root.left, sum) + pathSum1(root.right, sum);
    }

    public int pathSumFrom(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.val == sum) {
            count++;
        }
        count += pathSumFrom(root.left, sum - root.val) + pathSumFrom(root.right, sum - root.val);
        return count;
    }
}
