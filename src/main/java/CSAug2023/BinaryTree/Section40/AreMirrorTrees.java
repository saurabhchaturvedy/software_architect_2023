package CSAug2023.BinaryTree.Section40;

import CSAug2023.BinaryTree.Section30.TreeNode;

public class AreMirrorTrees {


    public boolean areMirrorTrees(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }


        return root1.data == root2.data && areMirrorTrees(root1.left, root1.right) && areMirrorTrees(root2.right, root2.left);
    }


    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(20);
        root1.right = new TreeNode(30);

        TreeNode root2 = new TreeNode(10);
        root2.left = new TreeNode(30);
        root2.right = new TreeNode(20);

        AreMirrorTrees areMirrorTrees = new AreMirrorTrees();

        System.out.println(" are mirror trees ? :: " + areMirrorTrees.areMirrorTrees(root1, root2));
    }
}
