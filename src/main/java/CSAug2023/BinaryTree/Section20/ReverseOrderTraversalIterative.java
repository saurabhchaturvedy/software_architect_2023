package CSAug2023.BinaryTree.Section20;

import CSAug2023.BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseOrderTraversalIterative {


    public void reverseOrderTraversalIterative(TreeNode root) {
        if (root == null) {
            return;
        }


        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {

            TreeNode temp = queue.poll();

            stack.push(temp.data);

            if (temp.left != null) {
                queue.offer(temp.left);
            }

            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }

        while (!stack.isEmpty()) {

            System.out.print(stack.pop() + " ");
        }
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(30);
        root.left = new TreeNode(50);
        root.right = new TreeNode(60);

        ReverseOrderTraversalIterative reverseOrderTraversalIterative = new ReverseOrderTraversalIterative();
        reverseOrderTraversalIterative.reverseOrderTraversalIterative(root);
    }
}
