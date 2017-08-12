public class ConstructStringFromBinaryTree {
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        if (t.left == null && t.right == null) {
            return String.valueOf(t.val);
        }
        if (t.right == null) {
            return String.valueOf(t.val) + "(" + tree2str(t.left) + ")";
        }
        return String.valueOf(t.val) + "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ")";
    }
}
