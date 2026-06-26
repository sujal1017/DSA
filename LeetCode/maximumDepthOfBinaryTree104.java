import javax.swing.tree.TreeNode;

public class maximumDepthOfBinaryTree104 {
    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        else{
            int ld = maxDepth(root.left);
            int rd = maxDepth(root.right);
            return 1+Math.max(ld,rd);
        }

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
        maximumDepthOfBinaryTree104 obj = new maximumDepthOfBinaryTree104();

        TreeNode root = obj.new TreeNode(3);
        root.left = obj.new TreeNode(9);
        root.right = obj.new TreeNode(20);
        root.right.left = obj.new TreeNode(15);
        root.right.right = obj.new TreeNode(7);

        int depth = obj.maxDepth(root);

        System.out.println("Maximum Depth of Binary Tree: " + depth);
    }
}
