public class minimumDepthOfBinaryTree111 {
    public int minDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int ld = root.left == null ? Integer.MAX_VALUE :minDepth(root.left);
        int rd = root.right == null ? Integer.MAX_VALUE :minDepth(root.right);
        return 1 + Math.min(rd,ld);
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
        minimumDepthOfBinaryTree111 obj = new minimumDepthOfBinaryTree111();
        TreeNode root = obj.new TreeNode(3);
        root.left = obj.new TreeNode(9);
        root.right = obj.new TreeNode(20);
        root.right.left = obj.new TreeNode(15);
        root.right.right = obj.new TreeNode(7);
        System.out.println(obj.minDepth(root));
    }
    
}
