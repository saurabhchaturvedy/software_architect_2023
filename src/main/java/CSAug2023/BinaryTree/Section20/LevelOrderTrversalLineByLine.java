package CSAug2023.BinaryTree.Section20;

import CSAug2023.BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTrversalLineByLine {


    public void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }


        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode temp = queue.poll();

                System.out.print(temp.data + " ");

                if (temp.left != null) {
                    queue.offer(temp.left);
                }

                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(45);
        root.left = new TreeNode(90);
        root.right = new TreeNode(100);

        LevelOrderTrversalLineByLine levelOrderTrversalLineByLine = new LevelOrderTrversalLineByLine();
        levelOrderTrversalLineByLine.levelOrderTraversal(root);
    }
}
