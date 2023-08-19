package CSAug2023.BinaryTree.Section40;

import CSAug2023.BinaryTree.Section30.TreeNode;

public class SameStructures {


    public boolean areSameStructures(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {

            return false;
        }


        return areSameStructures(root1.left, root2.left) && areSameStructures(root1.right, root2.right);
    }


    public static void main(String[] args) {


        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(20);
        root1.right = new TreeNode(30);

        TreeNode root2 = new TreeNode(10);
        root2.left = new TreeNode(20);
        root2.right = new TreeNode(30);

        SameStructures sameStructures = new SameStructures();

        System.out.print(" Are same structures ?? :::: " + sameStructures.areSameStructures(root1, root2));
    }
}
