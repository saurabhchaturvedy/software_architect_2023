package CSAug2023.BinaryTree.Section30;

import CSAug2023.BinaryTree.TreeNode;

public class IdenticalTrees {


    public boolean areIdenticalTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }

        if (t1 == null || t2 == null) {
            return false;
        }

        return t1.data == t2.data && areIdenticalTrees(t1.left, t2.left) && areIdenticalTrees(t1.right, t2.right);
    }

    public static void main(String[] args) {


        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(20);
        root1.right = new TreeNode(30);

        TreeNode root2 = new TreeNode(10);
        root2.left = new TreeNode(20);
        root2.right = new TreeNode(30);


        IdenticalTrees identicalTrees = new IdenticalTrees();
        boolean areIdentical = identicalTrees.areIdenticalTrees(root1, root2);

        System.out.print("Are trees identical ??? ::: " + areIdentical);
    }
}
