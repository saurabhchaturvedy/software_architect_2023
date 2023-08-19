package CSAug2023.BinaryTree.Section40;

import CSAug2023.BinaryTree.Section30.TreeNode;

public class FoldableTree {


    public boolean isFoldableTree(TreeNode root) {
        if (root == null) {
            return true;
        }


        return isMirrorStructure(root.left, root.right);
    }

    private boolean isMirrorStructure(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {

            return false;
        }


        return isMirrorStructure(left.left, right.right) && isMirrorStructure(left.right, right.left);
    }


    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(20);
        root1.right = new TreeNode(30);

        FoldableTree foldableTree = new FoldableTree();

        System.out.println("Is foldable tree ?? ::::: "+foldableTree.isFoldableTree(root1));
    }
}
