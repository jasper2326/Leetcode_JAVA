public class DiameterOfBinaryTree {
    public class resultType{
        int singlePath;
        int maxPath;
        resultType(int singlePath, int maxPath) {
            this.singlePath = singlePath;
            this.maxPath = maxPath;
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        resultType r = findMax(root);
        return r.maxPath;
    }

    public resultType findMax(TreeNode root) {
        if (root == null) {
            return new resultType(0, 0);
        }
        resultType left = findMax(root.left);
        resultType right = findMax(root.right);
        return new resultType(Math.max(left.singlePath, right.singlePath) + 1,
                Math.max(Math.max(left.maxPath, right.maxPath), left.singlePath + right.singlePath + 1));
    }
}
