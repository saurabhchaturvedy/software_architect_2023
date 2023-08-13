package CSAug2023.BinaryTree.Section20;

import CSAug2023.BinaryTree.TreeNode;

import java.util.Stack;

public class PreOrderTraversal {


    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }


        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

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


        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);
        root.left.right.right = new TreeNode(11);
        root.left.right.left = new TreeNode(5);

        root.right = new TreeNode(5);
        root.right.right = new TreeNode(9);
        root.right.right.left = new TreeNode(4);

        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
        preOrderTraversal.preorder(root);
    }
}
