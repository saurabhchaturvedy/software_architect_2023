package CSAug2023.BinaryTree.Section20;


import CSAug2023.BinaryTree.TreeNode;

import java.util.Stack;

public class InorderTraversal {


    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }


        while (!stack.isEmpty()) {

            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                TreeNode tmp = temp.right;

                while (tmp != null) {
                    stack.push(tmp);
                    tmp = tmp.left;

                }
            }
        }
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(87);
        root.left = new TreeNode(77);
        root.right = new TreeNode(66);

        InorderTraversal inorderTraversal = new InorderTraversal();
        inorderTraversal.inorder(root);
    }
}
