package CSAug2023.BinaryTree.Section20;

import CSAug2023.BinaryTree.TreeNode;

public class MirrorTree {


    public void mirrorTree(TreeNode root) {

        if (root == null) {
            return;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirrorTree(root.left);
        mirrorTree(root.right);
    }


    public void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        MirrorTree mirrorTree = new MirrorTree();
        mirrorTree.mirrorTree(root);

        mirrorTree.inorder(root);
    }
}
