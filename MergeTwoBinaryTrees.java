import java.util.LinkedList;
import java.util.Stack;

public class MergeTwoBinaryTrees {
    public static TreeNode mergeTrees1(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees1(t1.left, t2.left);
        t1.right = mergeTrees1(t1.right, t2.right);
        return t1;
    }

    public static TreeNode mergeTrees2(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[] {t1, t2});
        while (!stack.isEmpty()) {
            TreeNode[] current = stack.pop();
            if (current[0] == null || current[1] == null) {
                continue;
            }
            current[0].val += current[1].val;
            if (current[0].left == null) {
                current[0].left = current[1].left;
            } else {
                stack.push(new TreeNode[] {current[0].left, current[1].left});
            }
            if (current[0].right == null) {
                current[0].right = current[1].right;
            } else {
                stack.push(new TreeNode[] {current[0].right, current[1].right});
            }
        }
        return t1;
    }
}
