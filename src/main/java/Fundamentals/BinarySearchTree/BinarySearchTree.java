package Fundamentals.BinarySearchTree;

public class BinarySearchTree {


    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    public void insert(int value) {
        root = insert(root, value);
    }


    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.data) {
            root = insert(root.left, value);
        } else {
            root = insert(root.right, value);
        }

        return root;
    }


    public TreeNode search(TreeNode root, int key) {

        if (root == null || root.data == key) {
            return root;
        }

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public void inOrder() {
        inorder(root);
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


        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(20);
        binarySearchTree.insert(15);
        binarySearchTree.insert(35);
        binarySearchTree.insert(10);
        binarySearchTree.insert(18);

        binarySearchTree.inOrder();
    }
}
