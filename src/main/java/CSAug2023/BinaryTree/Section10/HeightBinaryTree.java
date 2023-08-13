package CSAug2023.BinaryTree.Section10;

import java.util.LinkedList;
import java.util.Queue;

public class HeightBinaryTree {


    public int height(TreeNode root) {
        if (root == null) {
            return -1;
        }

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;

    }


    public int heightIterative(TreeNode root) {
        if (root == null) {
            return -1;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int height = -1;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode temp = queue.poll();

                if (temp.left != null) {
                    queue.offer(temp.left);
                }

                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }

            height++;
        }

        return height;
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        HeightBinaryTree heightBinaryTree = new HeightBinaryTree();
        int height = heightBinaryTree.height(root);
        System.out.println(" height of the tree = " + height);

        int heightIterative = heightBinaryTree.heightIterative(root);
        System.out.println("height iterative ::: " + heightIterative);
    }
}
