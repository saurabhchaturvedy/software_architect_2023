package CSAug2023.BinaryTree.Section10;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfLeafNodes {


    public int numberOfLeafNodes(TreeNode root) {

        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        return numberOfLeafNodes(root.left) + numberOfLeafNodes(root.right);
    }

    public int numberOfLeafNodesIterative(TreeNode root) {
        if (root == null) {
            return 0;
        }


        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int numberOfLeafNodes = 0;


        while (!queue.isEmpty()) {

            TreeNode temp = queue.poll();

            if (temp.left == null && temp.right == null) {
                numberOfLeafNodes++;
            }


            if (temp.left != null) {
                queue.offer(temp.left);
            }

            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }

        return numberOfLeafNodes;
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(40);

        NumberOfLeafNodes numberOfLeafNodes = new NumberOfLeafNodes();
        int numberedOfLeafNodes = numberOfLeafNodes.numberOfLeafNodes(root);

        System.out.println("number of leaf nodes =" + numberedOfLeafNodes);

        int numNodes = numberOfLeafNodes.numberOfLeafNodesIterative(root);

        System.out.println("number of leaf nodes -> " + numNodes);
    }
}
