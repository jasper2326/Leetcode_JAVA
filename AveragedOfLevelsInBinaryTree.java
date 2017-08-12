import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AveragedOfLevelsInBinaryTree {
    public List<Double> averageOfLevels1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Double> average = new LinkedList<>();
        if (root == null) {
            return average;
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                sum += current.val;
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            average.add(sum * 1.0 / size);
        }
        return average;
    }

    public List<Double> averageOfLevels2(TreeNode root) {
        List<Integer> count = new ArrayList<>();
        List<Double> result = new ArrayList<>();
        average(root, 0, result, count);
        for (int i = 0; i < result.size(); i++) {
            result.set(i, result.get(i) / count.get(i));
        }
        return result;
    }

    public void average(TreeNode root, int level, List<Double> result, List<Integer> count) {
        if (root == null) {
            return;
        }
        if (level < result.size()) {
            result.set(level, result.get(level) + root.val);
            count.set(level, count.get(level) + 1);
        } else {
            result.add(1.0 * root.val);
            count.add(1);
        }
        average(root.left, level + 1, result, count);
        average(root.right, level + 1, result, count);
    }
}
