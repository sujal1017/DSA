import java.util.ArrayList;
import java.util.List;

public class binaryTreePostorderTraversal145 {
    List<Integer> result = new ArrayList<>();
    public List <Integer> postorderTraversal(TreeNode root){
        postorder(root);
        return result;
    }

    public void postorder(TreeNode root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        result.add(root.val);
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
        binaryTreePostorderTraversal145 obj = new binaryTreePostorderTraversal145();
        TreeNode root = obj.new TreeNode(1);
        root.right = obj.new TreeNode(2);
        root.right.left = obj.new TreeNode(3);
        List<Integer> result = obj.postorderTraversal(root);
        System.out.println(result);
    }

    
}
