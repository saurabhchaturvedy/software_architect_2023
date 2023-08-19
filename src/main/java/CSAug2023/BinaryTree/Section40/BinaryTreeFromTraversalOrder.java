package CSAug2023.BinaryTree.Section40;

import CSAug2023.BinaryTree.Section30.TreeNode;

import java.util.Stack;

public class BinaryTreeFromTraversalOrder {


    public static TreeNode buildTree(int[] inorder) {
        if (inorder == null || inorder.length == 0) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(inorder[0]);
        TreeNode current = root;

        for (int i = 1; i < inorder.length; i++) {
            TreeNode newNode = new TreeNode(inorder[i]);

            if (newNode.data < current.data) {
                current.left = newNode;
                stack.push(current);
                current = newNode;
            } else {
                while (!stack.isEmpty() && stack.peek().data < newNode.data) {
                    current = stack.pop();
                }
                current.right = newNode;
            }
        }

        return root;
    }

    public static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        int[] inorder = {4, 2, 5, 1, 6, 3, 7};
        TreeNode root = buildTree(inorder);

        System.out.println("Inorder traversal of the constructed tree:");
        inorderTraversal(root);
    }
}
