package CSAug2023.BinaryTree.Section30;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class TopView {


    public void topView(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        TreeMap<Integer, Integer> topView = new TreeMap<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode temp = queue.poll();
            int hd = temp.height;

            if (!topView.containsKey(hd)) {
                topView.put(hd, temp.data);
            }

            if (temp.left != null) {
                queue.offer(temp.left);
            }

            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }

        System.out.print(topView.values());
    }


    public static void main(String[] args) {


        TreeNode root = new TreeNode(15);

        root.left = new TreeNode(38);

        root.right = new TreeNode(44);

        TopView topView = new TopView();

        topView.topView(root);
    }
}




