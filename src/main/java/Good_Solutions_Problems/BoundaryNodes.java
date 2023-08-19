package Good_Solutions_Problems;

import CSAug2023.BinaryTree.Section30.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BoundaryNodes {


    public void printBoundaryNodes(TreeNode root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        printLeftBoundaryNodes(root.left);
        printLeaves(root);
        printRightBoundaryNodes(root.right);
    }

    private void printRightBoundaryNodes(TreeNode node) {

        Stack<Integer> stack = new Stack<>();

        while (node != null) {

            if (node.left != null || node.right != null) {
                stack.push(node.data);
            }

            if (node.left != null) {
                node = node.left;
            } else {

                node = node.right;
            }
        }


        while (!stack.isEmpty()) {

            System.out.print(stack.pop() + " ");
        }
    }

    private void printLeaves(TreeNode root) {

        if (root == null) {
            return;
        }


        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);


        while (!queue.isEmpty()) {

            TreeNode temp = queue.poll();

            if (temp.left == null && temp.right == null) {
                System.out.print(temp.data + " ");
            }

            if (temp.left != null) {
                queue.offer(temp.left);
            }

            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
    }

    private void printLeftBoundaryNodes(TreeNode node) {

        while (node != null) {

            if (node.left != null || node.right != null) {
                System.out.print(node.data + " ");
            }

            if (node.left != null) {
                node = node.left;
            } else {

                node = node.right;
            }
        }
    }


    public static void main(String[] args) {

        BoundaryNodes boundaryNodes = new BoundaryNodes();

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        root.right = new TreeNode(30);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(70);

        boundaryNodes.printBoundaryNodes(root);
    }
}
