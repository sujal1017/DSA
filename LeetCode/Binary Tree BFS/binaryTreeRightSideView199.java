
import java.util.ArrayList;
import java.util.List;


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

public class binaryTreeRightSideView199{
    public List<Integer> Solution(TreeNode root){
        List<Integer> result = new ArrayList<>();
        rightView(root,result,0);
        return result;
    }
    public void rightView(TreeNode current,List<Integer> result, int currDepth){
        if(current == null){
            return;
        }
        if(currDepth == result.size()){
            result.add(current.val);
        }
        rightView(current.right, result, currDepth+1);
        rightView(current.left, result, currDepth+1);
    }
    public static void main(String[] args) {
        binaryTreeRightSideView199 obj = new binaryTreeRightSideView199();
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);


        List<Integer> ans = obj.Solution(root);

        System.out.println(ans);        
    }
}