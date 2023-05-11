package Last_Minute_Brush_Up_Problems;

import java.util.LinkedList;
import java.util.Queue;

public class RightView {


    public void rightView(TreeNode root) {

        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int size = queue.size(); // nodes at the current level of tree
            int i = 0;

            while (i++ < size) {
                TreeNode temp = queue.poll();

                if (i == size) {
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

        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);


        one.left = two;
        one.right = three;
        two.right = four;
        three.left = five;
        three.right = six;
        five.left = seven;
        five.right = eight;

        RightView rightView = new RightView();
        rightView.rightView(one);
    }
}
