package CSAug2023.BinaryTree.Section30;

import java.util.*;

public class BottomView {


    public void bottomView(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        Map<Integer, Integer> bottomViewMap = new TreeMap<>();

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            int hd = temp.height;

            bottomViewMap.put(hd, temp.data);

            if (temp.left != null) {
                temp.left.height = hd - 1;
                queue.offer(temp.left);
            }

            if (temp.right != null) {

                temp.right.height = hd + 1;
                queue.offer(temp.right);
            }
        }

        System.out.print(bottomViewMap.values() + " ");
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        BottomView bottomView = new BottomView();
        bottomView.bottomView(root);
    }
}
