import java.util.*;

public class BinaryTreeLevelOrderTraversal2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        helper(result, root, 0);
        return result;
    }

    public void helper(List<List<Integer>> result, TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level > result.size()) {
            result.add(0, new LinkedList<>());
        }
        helper(result, root.left, level + 1);
        helper(result, root.right, level + 1);
        result.get(result.size() - level - 1).add(root.val);
    }

    public List<List<Integer>> levelOrderButtom2(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                level.add(current.val);
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            result.add(level);
        }

        Collections.reverse(result);
        return result;
    }
}
