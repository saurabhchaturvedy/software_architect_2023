package CSAug2023.BinaryTree.Section40;

import CSAug2023.BinaryTree.Section30.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class WidthOfALevel {


    public int widthOfALevelRecursive(TreeNode root, int level) {

        if (root == null) {
            return 0;
        }

        if (level == 1) {
            return 1;
        }


        return widthOfALevelRecursive(root.left, level - 1) + widthOfALevelRecursive(root.right, level - 1);
    }


    public int widthOfALevelIterative(TreeNode root, int level) {

        if (root == null || level < 1) {
            return 0;
        }


        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int currentLevel = 1;

        while (!queue.isEmpty() && currentLevel!=level) {

            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode temp = queue.poll();

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {

                    queue.add(temp.right);
                }
            }

            currentLevel++;
        }


        return queue.size();
    }


    public static void main(String[] args) {

        WidthOfALevel widthOfALevel = new WidthOfALevel();

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        root.right = new TreeNode(30);
        root.right.right = new TreeNode(70);
        root.right.left = new TreeNode(60);

        System.out.println("size of the level is " + widthOfALevel.widthOfALevelIterative(root, 3));
        System.out.println("size of the level is " + widthOfALevel.widthOfALevelRecursive(root, 3));
    }
}
