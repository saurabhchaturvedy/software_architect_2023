package CSAug2023.BinaryTree.Section10;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {


    public void levelOrderTraversal(TreeNode root) {

        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);


        while (!queue.isEmpty()) {

            TreeNode temp = queue.poll();

            System.out.print(temp.data + " ");

            if (temp.left != null) {
                queue.offer(temp.left);
            }

            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(80);
        root.right = new TreeNode(90);

        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        levelOrderTraversal.levelOrderTraversal(root);
    }
}
