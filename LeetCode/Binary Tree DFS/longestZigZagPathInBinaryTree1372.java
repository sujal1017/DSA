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

public class longestZigZagPathInBinaryTree1372 {

    public int Solution(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(
                zigzag(root, 0, true),
                zigzag(root, 0, false)
        );
    }

    public int zigzag(TreeNode root, int steps, boolean goleft) {

        if (root == null) {
            return steps - 1;
        }

        if (goleft) {
            return Math.max(
                    zigzag(root.left, steps + 1, false),
                    zigzag(root.right, 1, true)
            );
        } else {
            return Math.max(
                    zigzag(root.right, steps + 1, true),
                    zigzag(root.left, 1, false)
            );
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(5);
        root.left.right.left.right = new TreeNode(6);

        longestZigZagPathInBinaryTree1372 obj =
                new longestZigZagPathInBinaryTree1372();

        System.out.println(obj.Solution(root));
    }
}