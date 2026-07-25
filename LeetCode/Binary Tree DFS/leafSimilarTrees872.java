import java.util.ArrayList;
import java.util.List;

public class leafSimilarTrees872{

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public boolean Solution(TreeNode root1,TreeNode root2){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        findLeaf(root1, list1);
        findLeaf(root2, list2);

        System.out.println("Tree 1 Leaf Nodes: " + list1);
        System.out.println("Tree 2 Leaf Nodes: " + list2);

        return list1.equals(list2);

    }

    public void findLeaf(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            list.add(root.val);
        }

        findLeaf(root.left, list);
        findLeaf(root.right, list);
    }
    public static void main(String[] args) {

        // -------- Tree 1 --------
        TreeNode root1 = new TreeNode(3);

        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);

        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);

        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);

        root1.right.left = new TreeNode(9);
        root1.right.right = new TreeNode(8);

        // -------- Tree 2 --------

        TreeNode root2 = new TreeNode(3);

        root2.left = new TreeNode(5);
        root2.right = new TreeNode(1);

        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(7);

        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(2);

        root2.right.right.left = new TreeNode(9);
        root2.right.right.right = new TreeNode(8);

        leafSimilarTrees872 obj = new leafSimilarTrees872();

        boolean ans = obj.Solution(root1, root2);

        System.out.println("Are the trees leaf similar? " + ans);

    }


}