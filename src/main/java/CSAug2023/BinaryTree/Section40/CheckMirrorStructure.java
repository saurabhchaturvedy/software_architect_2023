package CSAug2023.BinaryTree.Section40;

import CSAug2023.BinaryTree.Section30.TreeNode;

public class CheckMirrorStructure {


    public boolean checkMirrorStructure(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }


        return checkMirrorStructure(root1.left, root2.right) && checkMirrorStructure(root1.right, root2.left);
    }


    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(20);
        root1.right = new TreeNode(30);

        TreeNode root2 = new TreeNode(10);
        root2.left = new TreeNode(30);
        root2.right = new TreeNode(20);

        CheckMirrorStructure checkMirrorStructure = new CheckMirrorStructure();

        System.out.println("Are mirror structures ??? :::: " + checkMirrorStructure.checkMirrorStructure(root1, root2));
    }
}
