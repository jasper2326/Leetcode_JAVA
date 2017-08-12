public class ConvertBSTToGreaterTree {
    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }

    int sum = 0;
    public void convert(TreeNode root) {
        if (root == null) {
            return;
        }
        convert(root.right);
        root.val += sum;
        sum = root.val;
        convert(root.left);
    }
}
