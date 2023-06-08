package Last_Minute_Brush_Up_Problems;

public class InvertBinaryTree {


    TreeNode invertRecursive(TreeNode root) {
        if (root == null) {
            return null;
        }


        TreeNode left = invertRecursive(root.left);
        TreeNode right = invertRecursive(root.right);

        root.left = right;
        root.right = left;

        return root;
    }


    public void print(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(10);
        TreeNode right = new TreeNode(25);

        root.left = left;
        root.right = right;

        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode treeNode = invertBinaryTree.invertRecursive(root);

        invertBinaryTree.print(treeNode);


    }
}
