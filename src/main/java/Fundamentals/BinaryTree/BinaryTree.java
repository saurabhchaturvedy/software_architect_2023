package Fundamentals.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
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


    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void inorderIterative(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while (!stack.isEmpty() || temp != null) {

            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {

                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }


    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }


    public void postorderIterative(TreeNode root) {

        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (!stack.empty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;

                if (temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");

                    while (!stack.empty() && temp == stack.peek().right) {

                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                } else {

                    current = temp;
                }
            }
        }
    }

    public void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null) {
                queue.offer(temp.left);
            }

            if (temp.right != null) {
                queue.offer(temp.right);
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

        System.out.println();
        binaryTree.inorder(first);

        System.out.println();
        binaryTree.inorderIterative(first);

        System.out.println();
        binaryTree.postorder(first);

        System.out.println();
        binaryTree.postorderIterative(first);

        System.out.println();
        binaryTree.levelOrder(first);

    }
}
