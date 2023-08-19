package CSAug2023.BinaryTree.Section40;

import CSAug2023.BinaryTree.Section30.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class ElementBetweenLevels {


    public void printBetweenLevels(TreeNode root, int min, int max) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 1;

        while (true) {

            int size = queue.size();
            if (size == 0 || level > max) {
                break;
            }

            while (size > 0) {

                TreeNode temp = queue.poll();

                if (level >= min && level <= max) {


                    System.out.print(temp.data + " ");
                }

                if (temp.left != null) {
                    queue.offer(temp.left);
                }

                if (temp.right != null) {
                    queue.offer(temp.right);
                }

                size--;
            }
            level++;
        }


    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        root.right = new TreeNode(30);
        root.right.right = new TreeNode(70);
        root.right.left = new TreeNode(60);

        ElementBetweenLevels elementBetweenLevels = new ElementBetweenLevels();
        elementBetweenLevels.printBetweenLevels(root, 2, 3);
    }
}
