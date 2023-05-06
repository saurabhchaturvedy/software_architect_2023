package Fundamentals.BinaryTree;

import java.util.Stack;

public class BinaryTree {


    TreeNode root;

    private static class TreeNode {
        TreeNode left;
        TreeNode right;
        int data;

        TreeNode(int data) {
            this.data = data;
        }
    }


    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }


    public void preOrderIterative(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            TreeNode temp = stack.pop();

            System.out.print(temp.data + " ");

            if (temp.right != null) {
                stack.push(temp.right);
            }

            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }


    public static void main(String[] args) {

        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = first;

        first.left = second;
        first.right = third;

        third.left = fourth;
        third.right = fifth;

        binaryTree.preOrder(first);
        System.out.println();
        binaryTree.preOrderIterative(first);

    }
}
