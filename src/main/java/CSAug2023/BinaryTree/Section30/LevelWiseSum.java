package CSAug2023.BinaryTree.Section30;

import java.util.LinkedList;
import java.util.Queue;

public class LevelWiseSum {


    public void levelWiseSum(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int sum = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode temp = queue.poll();
                sum = sum + temp.data;

                System.out.print(sum + " ");

                if (temp.left != null) {
                    queue.offer(temp.left);
                }

                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }

        }

    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(3);

        root.left.right = new TreeNode(5);

        root.right = new TreeNode(8);
        root.right.right = new TreeNode(9);

        root.right.left = new TreeNode(7);

        LevelWiseSum levelWiseSum = new LevelWiseSum();
        levelWiseSum.levelWiseSum(root);
    }
}
