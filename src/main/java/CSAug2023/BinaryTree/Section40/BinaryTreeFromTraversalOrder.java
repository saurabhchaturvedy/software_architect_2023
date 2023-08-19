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


    public static TreeNode buildTreeFromPreOrder(int[] preorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(preorder[0]);
        stack.push(root);

        for (int i = 1; i < preorder.length; i++) {
            TreeNode newNode = new TreeNode(preorder[i]);
            TreeNode current = stack.peek();

            if (newNode.data < current.data) {
                current.left = newNode;
            } else {
                TreeNode parent = null;
                while (!stack.isEmpty() && stack.peek().data < newNode.data) {
                    parent = stack.pop();
                }
                parent.right = newNode;
            }

            stack.push(newNode);
        }

        return root;
    }


    public static TreeNode buildTreeFromPostorder(int[] postorder) {
        if (postorder == null || postorder.length == 0) {
            return null;
        }

        int n = postorder.length;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(postorder[n - 1]);
        stack.push(root);

        for (int i = n - 2; i >= 0; i--) {
            TreeNode newNode = new TreeNode(postorder[i]);
            TreeNode current = null;

            while (!stack.isEmpty() && stack.peek().data > newNode.data) {
                current = stack.pop();
            }

            if (current != null) {
                current.left = newNode;
            } else {
                stack.peek().right = newNode;
            }

            stack.push(newNode);
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
