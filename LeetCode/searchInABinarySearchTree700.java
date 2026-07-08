
public class searchInABinarySearchTree700 {
    public TreeNode searchBST (TreeNode root, int val){
         if(root == null){
            return root;
        }
        else if(root.val == val){
            return root;
        }
        else if(root.val < val){
            return searchBST(root.right,val);
        }
        else{
            return searchBST(root.left,val);
        }
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

    public static void main(String[] args) {
        searchInABinarySearchTree700 obj = new searchInABinarySearchTree700();
        TreeNode root = obj.new TreeNode(4);
        root.left = obj.new TreeNode(2);
        root.right = obj.new TreeNode(7);
        root.left.left = obj.new TreeNode(1);
        root.left.right = obj.new TreeNode(3);
        TreeNode ans = obj.searchBST(root, 2);

        if(ans != null){
            System.out.println("Found : " + ans.val);
        }
        else{
            System.out.println("Not Found");
        }
    }
    
}
