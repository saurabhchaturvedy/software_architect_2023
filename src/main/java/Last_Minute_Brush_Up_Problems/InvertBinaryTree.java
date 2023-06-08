package Last_Minute_Brush_Up_Problems;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {


    TreeNode invertRecursive(TreeNode root) {
        if (root == null) {
            return null;
        }


        TreeNode left = invertRecursive(root.left);
        TreeNode right = invertRecursive(root.right);

        root.left = right;
        root.right = left;

        return root;
    }


    TreeNode invertIterative(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode current = queue.poll();

            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;

            if (current.left != null) {
                queue.offer(current.left);
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        return root;
    }


    public void print(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(10);
        TreeNode right = new TreeNode(25);

        root.left = left;
        root.right = right;

        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode treeNode = invertBinaryTree.invertRecursive(root);

        invertBinaryTree.print(treeNode);

        TreeNode treeNode1 = invertBinaryTree.invertIterative(root);

        System.out.println();
        invertBinaryTree.print(treeNode1);


    }
}
