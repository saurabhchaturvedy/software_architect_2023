package CSAug2023.BinaryTree.Section40;

import CSAug2023.BinaryTree.Section30.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidth {


    public int maxWidth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int maxWidth = 1;

        while (true) {

            int size = queue.size();

            if (size == 0) {
                break;
            }

            if (size > maxWidth) {
                maxWidth = size;
            }

            while (size > 0) {
                TreeNode temp = queue.poll();

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }

                size--;
            }
        }


        return maxWidth;
    }


    public static void main(String[] args) {

        MaximumWidth maximumWidth = new MaximumWidth();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        root.right = new TreeNode(30);
        root.right.right = new TreeNode(70);
        root.right.left = new TreeNode(60);
        System.out.println("max width of binary tree is : " + maximumWidth.maxWidth(root));
    }
}
