package CSAug2023.BinaryTree.Section20;

import CSAug2023.BinaryTree.TreeNode;

import java.util.Stack;

public class PostOrderTraversal {


    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> first = new Stack<>();
        Stack<TreeNode> second = new Stack<>();

        first.push(root);

        while (!first.isEmpty()) {

            TreeNode temp = first.pop();

            if (temp.left != null) {
                first.push(temp.left);
            }

            if (temp.right != null) {

                first.push(temp.right);
            }


            second.push(temp);
        }


        while (!second.isEmpty()) {


            System.out.print(second.pop().data + " ");
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

        PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
        postOrderTraversal.postorder(root);
    }
}
