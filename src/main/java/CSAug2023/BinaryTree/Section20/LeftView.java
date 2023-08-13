package CSAug2023.BinaryTree.Section20;

import CSAug2023.BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LeftView {


    public void leftView(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int levelSize = queue.size();
            int i = 0;

            while (i++ < levelSize) {
                TreeNode temp = queue.poll();

                if (i == 1) {
                    System.out.print(temp.data + " ");
                }

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

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(5);

        root.right = new TreeNode(2);
        root.right.right = new TreeNode(1);

        root.right.left = new TreeNode(3);
        root.right.left.left = new TreeNode(6);

        root.right.left.right = new TreeNode(7);

        LeftView leftView = new LeftView();
        leftView.leftView(root);
    }
}
