
public class balancedBinaryTree110{
    public boolean isBalanced(TreeNode root){
        if(root == null) return true;
        if (Height(root) == -1) return false;
        return true;
    }
    public int Height(TreeNode root){
        if(root == null) return 0;
        int lh = Height(root.left);
        int rh = Height(root.right);
        if(Math.abs(rh-lh)>1) return -1;
        if(lh == -1 ||rh == -1) return -1;
        return 1 + Math.max(rh,lh);
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
    public static void main(String[] args){
        balancedBinaryTree110 obj = new balancedBinaryTree110();
        TreeNode root = obj.new TreeNode(3);
        root.left = obj.new TreeNode(9);
        root.right = obj.new TreeNode(20);
        root.right.left = obj.new TreeNode(15);
        root.right.right = obj.new TreeNode(7);
        System.out.println(obj.isBalanced(root));
    }

}