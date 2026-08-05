
import java.util.LinkedList;
import java.util.Queue;

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

public class maximumLevelSumOfBinaryTree1161 {
    public int Solution(TreeNode root){
        if(root == null){
           return 0;
        }
        int ans = 0;
        int level = 0;
        int max = Integer.MIN_VALUE;
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int sum = 0;
            level++;
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode tn = q.poll();
                sum += tn.val;
                if(tn.left != null){
                    q.add(tn.left);
                }
                if(tn.right != null){
                    q.add(tn.right);
                }
            }
            if(sum > max){
                max = sum;
                ans = level;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        maximumLevelSumOfBinaryTree1161 obj = new maximumLevelSumOfBinaryTree1161();
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);
        int ans = obj.Solution(root);
        System.out.println(ans);
    }
}
