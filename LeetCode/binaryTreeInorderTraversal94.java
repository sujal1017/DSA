import java.util.ArrayList;
import java.util.List;

public class binaryTreeInorderTraversal94 {

    List<Integer> result = new ArrayList<>();

    public List<Integer> inordertraversal(TreeNode root) {
        inorder(root);
        return result;
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        result.add(root.val);
        inorder(root.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

        binaryTreeInorderTraversal94 obj = new binaryTreeInorderTraversal94();

        TreeNode root = obj.new TreeNode(1);
        root.right = obj.new TreeNode(2);
        root.right.left = obj.new TreeNode(3);

        List<Integer> result = obj.inordertraversal(root);

        System.out.println(result);
    }
}

//result
// 1
// ├── left = null
// ├── print 1
// └── right = 2
//       ├── left = 3
//       │     ├── print 3
//       ├── print 2