package CSAug2023.BinaryTree.Section10;

import java.util.LinkedList;
import java.util.Queue;

public class DifferenceEvenOddLevels {


    public int differenceEvenOddLevels(TreeNode root) {
        if (root == null) {
            return 0;
        }


        return root.data - differenceEvenOddLevels(root.left) - differenceEvenOddLevels(root.right);
    }


    public int differenceEvenOddLevelsIterative(TreeNode root) {
        if (root == null) {
            return 0;
        }


        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int level = 1;
        int evenSum = 0;
        int oddSum = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {

                TreeNode temp = queue.poll();

                if (level % 2 == 0) {
                    evenSum = evenSum + temp.data;
                } else {
                    oddSum = oddSum + temp.data;
                }

                if (temp.left != null) {
                    queue.offer(temp.left);
                }

                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }

            level++;
        }

        return oddSum-evenSum;
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(30);
        root.left = new TreeNode(15);
        root.right = new TreeNode(20);

        DifferenceEvenOddLevels differenceEvenOddLevels = new DifferenceEvenOddLevels();
        int sum = differenceEvenOddLevels.differenceEvenOddLevels(root);
        System.out.println("Difference in levels = " + sum);


        int sumIterative = differenceEvenOddLevels.differenceEvenOddLevelsIterative(root);
        System.out.println("Difference in levels = " + sumIterative);
    }
}
