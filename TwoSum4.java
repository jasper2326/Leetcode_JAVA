import java.util.HashSet;

public class TwoSum4 {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hash = new HashSet<>();
        return find(root, k, hash);
    }

    public boolean find(TreeNode root, int k, HashSet<Integer> hash) {
        if (root == null) {
            return false;
        }
        if (hash.contains(k - root.val)) {
            return true;
        }
        hash.add(root.val);
        return find(root.left, k, hash) || find(root.right, k, hash);
    }
}
