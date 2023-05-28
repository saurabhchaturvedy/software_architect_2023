package Last_Minute_Brush_Up_Problems;

import java.util.*;

public class ZigZagOrderTraversal {


    public List<List<Integer>> zigzag(TreeNode root) {

        List<List<Integer>> zigzag = new ArrayList<>();
        if (root == null) {
            return zigzag;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean flag = false;

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            Stack<Integer> reversedStack = new Stack<>();

            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();

                if (flag) reversedStack.push(temp.data);
                else level.add(temp.data);

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }

            flag = !flag;

            while (!reversedStack.isEmpty()) {
                level.add(reversedStack.pop());

            }
            zigzag.add(level);
        }

        return zigzag;
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        TreeNode eight = new TreeNode(8);
        TreeNode four = new TreeNode(4);
        TreeNode three = new TreeNode(3);
        TreeNode seven = new TreeNode(7);
        TreeNode one = new TreeNode(1);
        TreeNode six = new TreeNode(6);


        root.left = eight;
        root.right = four;

        eight.left = three;
        eight.right = seven;

        four.right = one;
        one.left = six;

        ZigZagOrderTraversal zigZagOrderTraversal = new ZigZagOrderTraversal();
        List<List<Integer>> zigzag = zigZagOrderTraversal.zigzag(root);

        for (List<Integer> level : zigzag) {
            for (Integer levelVal : level) {
                System.out.print(levelVal + " ");
            }
            System.out.println();
        }

    }
}
