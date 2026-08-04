class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class lowestCommonAncestorOfBinaryTree236{
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left == null){
            return right;
        }
        else if(right == null){
            return left;
        }
        else{
            return root;
        }
    }
    public static void main(String[] args) {
        lowestCommonAncestorOfBinaryTree236 obj = new lowestCommonAncestorOfBinaryTree236();
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        TreeNode p = root.left.left;      
        TreeNode q = root.right.right;    
        TreeNode ans = obj.lowestCommonAncestor(root, p, q);
        System.out.println(ans.val);

    }
}