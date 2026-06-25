import java.util.ArrayList;
import java.util.List;

public class binaryTreePreorderTraversal144 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root){
        preorder(root);
        return result;
    }

    public void preorder(TreeNode root){
        if(root == null){
            return;
        }
        result.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public class TreeNode {
         int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String [] args){
        binaryTreePreorderTraversal144 obj = new binaryTreePreorderTraversal144();
        TreeNode root = obj.new TreeNode(1);
        root.right = obj.new TreeNode(2);
        root.right.left = obj.new TreeNode(3);
        List<Integer> result = obj.preorderTraversal(root);
        System.out.println(result);
    }
}

