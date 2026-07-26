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
public class countGoodNodesInBinaryTree1448 {
    public int goodNodes(TreeNode root){
        return findGood(root,root.val) ; 
    }
    public int findGood(TreeNode root, int val){
        if(root == null){
            return 0;
        }
        int max = Math.max(val,root.val);
        return (root.val>=val ? 1 : 0) + findGood(root.right, max) + findGood(root.left, max);
    }
    public static void main(String[] args) {
        countGoodNodesInBinaryTree1448 obj = new countGoodNodesInBinaryTree1448();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int count = obj.goodNodes(root);

        System.out.println(count);
    }
}
