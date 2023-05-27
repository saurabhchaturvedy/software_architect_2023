package Last_Minute_Brush_Up_Problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HeightBinaryTree {


    public int height(TreeNode root) {
        if (root == null) return -1;

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        int numberOfLevels = -1;

        while (true) {


            int nodesAtALevel = nodeQueue.size();
            if (nodesAtALevel == 0) {
                return numberOfLevels;
            }

            while (nodesAtALevel > 0) {
                TreeNode temp = nodeQueue.poll();
                if (temp.left != null) {
                    nodeQueue.offer(temp.left);
                }

                if (temp.right != null) {
                    nodeQueue.offer(temp.right);
                }

                nodesAtALevel--;

            }

            numberOfLevels++;
        }
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(78);

        root.left = left;
        root.right = right;

        HeightBinaryTree heightBinaryTree = new HeightBinaryTree();
        System.out.println(" height of the tree is : " + heightBinaryTree.height(root));
    }
}
