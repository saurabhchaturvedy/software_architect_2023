package CSAug2023.BinaryTree.Section20;

import CSAug2023.BinaryTree.TreeNode;

public class ReverseOrderTraversal {


    public int height(TreeNode root) {
        if (root == null) {
            return -1;
        }

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }


    public void printNodesAtALevel(TreeNode root, int level) {

        if (root == null) {
            return;
        }

        if (level == 1) {
            System.out.print(root.data + " ");
            return;
        }

        printNodesAtALevel(root.left, level - 1);
        printNodesAtALevel(root.right, level - 1);
    }


    public void reverseOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }


        int height = height(root);

        for (int i = height; i >= 0; i--) {
            printNodesAtALevel(root, i + 1);
            System.out.println();
        }
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(40);
        root.left = new TreeNode(80);
        root.right = new TreeNode(100);

        ReverseOrderTraversal reverseOrderTraversal = new ReverseOrderTraversal();
        reverseOrderTraversal.reverseOrderTraversal(root);
    }
}
