package CSAug2023.BinaryTree.Section40;

import CSAug2023.BinaryTree.Section30.TreeNode;

public class DoubleTree {


    public void doubleTree(TreeNode root) {

        if (root == null) {
            return;
        }

        doubleTree(root.left);
        doubleTree(root.right);

        TreeNode newNode = new TreeNode(root.data);
        newNode.left = root.left;
        root.left = newNode;
    }


    public void print(TreeNode root) {

        if (root == null) {
            return;
        }

        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(7);
        root.right = new TreeNode(8);

        DoubleTree doubleTree = new DoubleTree();
        doubleTree.print(root);

        doubleTree.doubleTree(root);

        System.out.println();

        doubleTree.print(root);
    }
}
