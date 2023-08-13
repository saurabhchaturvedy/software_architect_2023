package CSAug2023.BinaryTree.Section20;

import CSAug2023.BinaryTree.TreeNode;

public class DeleteBinaryTree {


    public TreeNode deleteTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        root.left = deleteTree(root.left);
        root.right = deleteTree(root.right);

        System.out.println("Deleting the node : " + root.data);

        root = null;
        return root;

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

        TreeNode root = new TreeNode(40);
        root.left = new TreeNode(45);
        root.right = new TreeNode(70);

        DeleteBinaryTree deleteBinaryTree = new DeleteBinaryTree();
        deleteBinaryTree.deleteTree(root);


        deleteBinaryTree.inorder(root);


    }
}
